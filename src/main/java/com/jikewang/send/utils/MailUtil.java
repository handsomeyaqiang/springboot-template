package com.jikewang.send.utils;

import com.fr.base.FRContext;
import com.fr.dav.LocalEnv;
import com.fr.general.ModuleContext;
import com.fr.io.TemplateWorkBookIO;
import com.fr.io.exporter.ExcelExporter;
import com.fr.io.exporter.ImageExporter;
import com.fr.main.TemplateWorkBook;
import com.fr.main.workbook.ResultWorkBook;
import com.fr.stable.WriteActor;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.utils
 * @ClassName: MailUtil
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/13 16:17
 * @Version: 1.0
 */
public class MailUtil {
    private static final Logger log = LoggerFactory.getLogger(MailUtil.class);
    private static String MAIL_SMTP_HOST = "smtp.163.com";
    private static Session session = null;
    private static Transport transport = null;
    private static String SENDER_ADDRESS = "15639928163@163.com";

    private static String SENDER_PASSWORD = "yaqiang1";

    private static Properties props = new Properties();

    static  {
        props.setProperty("mail.transport.protocol", "smtp");

        props.setProperty("mail.smtp.host", MAIL_SMTP_HOST);

        FRContext.setCurrentEnv(new LocalEnv(Consts.CPT_PATH));
    }

    public static void sendCpt(String subject, String content, String recipientTo, String recipientCc, String recipientBcc, String cptName, Map<String, String> cptParams, boolean show) throws Exception {
        ModuleContext.startModule(com.fr.report.module.EngineModule.class.getName());
        TemplateWorkBook workbook = TemplateWorkBookIO.readTemplateWorkBook(FRContext.getCurrentEnv(), cptName + ".cpt");
        ResultWorkBook result = workbook.execute(cptParams, new WriteActor());

        String midPath = cptName + "/" + TimeUtil.format(new Date(), null) + "/";
        File file = new File(Consts.DW_PATH + midPath);
        if (!file.exists()) {
            boolean mkdirs = file.mkdirs();
            if (mkdirs) {
                log.info("创建文件{%s}完成!", file.getAbsolutePath());
            }
        }
        String excelName = Consts.DW_PATH + midPath + subject + ".xlsx";
        List<File> attachments = new ArrayList<File>();
        File excelFile = new File(excelName);
        OutputStream outputstream = new FileOutputStream(excelFile);
        attachments.add(excelFile);
        ExcelExporter excelexporter = new ExcelExporter();
        excelexporter.export(outputstream, result);
        String imageFileName = Consts.DW_PATH + midPath + subject + ".jpg";
        List<File> images = null;
        if (show) {
            images = new ArrayList<File>();
            File imageFile = new File(imageFileName);
            OutputStream out = new FileOutputStream(imageFile);
            ImageExporter imageexporter = new ImageExporter();
            imageexporter.export(out, result);
            images.add(imageFile);
            out.close();
        }
        sendMail(subject, content, recipientTo, recipientCc, recipientBcc, attachments, images, show);
        outputstream.close();
        ModuleContext.stopModules();
    }

    public static void sendMail(String subject, String content, String recipientTo, String recipientCc, String recipientBcc, List<File> attachments, List<File> images, boolean show) {
        transport = null;
        try {
            session = Session.getInstance(props);
            session.setDebug(true);
            MimeMessage mimeMessage = getMimeMessage(session, subject, content, recipientTo, recipientCc, recipientBcc, attachments, images, show);
            transport = session.getTransport("smtp");
            transport.connect(MAIL_SMTP_HOST, SENDER_ADDRESS, SENDER_PASSWORD);
            transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
            transport.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (transport != null) {
                try {
                    transport.close();
                } catch (MessagingException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static MimeMessage getMimeMessage(Session session, String subject, String content, String recipientTo, String recipientCc, String recipientBcc, List<File> attachments, List<File> images, boolean show) throws Exception {
        MimeMessage msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(SENDER_ADDRESS));
        Optional.ofNullable(recipientTo).ifPresent(to -> {
            try {
                InternetAddress[] addresses = InternetAddress.parse(to);
                msg.setRecipients(MimeMessage.RecipientType.TO, addresses);
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        });
        Optional.ofNullable(recipientCc).ifPresent(cc -> {
            try {
                InternetAddress[] addresses = InternetAddress.parse(cc);
                msg.setRecipients(MimeMessage.RecipientType.CC, addresses);
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        });
        Optional.ofNullable(recipientBcc).ifPresent(bcc -> {
            try {
                InternetAddress[] addresses = InternetAddress.parse(bcc);
                msg.setRecipients(MimeMessage.RecipientType.BCC, addresses);
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        });

        String charset = "UTF-8";
        msg.setSubject(subject, charset);
        MimeMultipart multipart = new MimeMultipart("mixed");
        MimeBodyPart contentPart = new MimeBodyPart();
        multipart.addBodyPart(contentPart);
        MimeMultipart bodyMultipart = new MimeMultipart("related");
        contentPart.setContent(bodyMultipart);
        MimeBodyPart bodyPart = new MimeBodyPart();
        bodyMultipart.addBodyPart(bodyPart);
        if (images != null && !images.isEmpty()) {
            for (File img : images) {
                MimeBodyPart image = new MimeBodyPart();
                image.setDataHandler(new DataHandler(new FileDataSource(img)));
                String contentId = img.getName() + "_" + System.currentTimeMillis() + "_img";
                System.out.println(contentId);
                image.setContentID(contentId);
                multipart.addBodyPart(image);
                if (show) {
                    content = StringUtils.isEmpty(content) ? ("<img src=\"cid:" + contentId + "\">") : (content + "<br/><img src=\"cid:" + contentId + "\">");
                }
            }
        }

        bodyPart.setContent(content, "text/html;charset=" + charset);

        if (attachments != null && !attachments.isEmpty()) {
            for (File attachment : attachments) {
                MimeBodyPart mimeBodyPart = new MimeBodyPart();
                mimeBodyPart.setDataHandler(new DataHandler(new FileDataSource(attachment)));
                mimeBodyPart.setFileName(MimeUtility.encodeWord(attachment.getName()));
                multipart.addBodyPart(mimeBodyPart);
            }
        }
        msg.setContent(multipart);
        msg.saveChanges();
        return msg;
    }

    public static void main(String[] args) throws Exception {
        HashMap<String,Object> params = new HashMap<>();
        File parentFile = new File("D://" + TimeUtil.format(new Date(), "yyyyMMdd") + "/");
        List<File> attachments = null;
        if (parentFile.exists()) {
            File[] files = parentFile.listFiles();
            if (files != null && files.length > 0) {
                String fileCnt = (String)params.get("fileCnt");
                attachments = (List) Arrays.stream(files).sorted(Comparator.comparing(File::lastModified).reversed()).limit(StringUtils.isEmpty(fileCnt) ? files.length : Long.valueOf(fileCnt).longValue()).collect(Collectors.toList());
            }
        }

        File parentFile2 = new File("D://imgs/" + TimeUtil.format(new Date(), "yyyyMMdd") + "/");
        List<File> images = null;
        if (parentFile2.exists()) {
            File[] imgfiles = parentFile2.listFiles();
            if (imgfiles != null && imgfiles.length > 0) {
                String fileCnt = (String)params.get("imgfilecnt");
                images = (List) Arrays.stream(imgfiles).sorted(Comparator.comparing(File::lastModified).reversed()).limit(StringUtils.isEmpty(fileCnt) ? imgfiles.length : Long.valueOf(fileCnt).longValue()).collect(Collectors.toList());
            }
        }
        String subject = "邮件测试";
        String content = "email test successful";
        String recipientTo = "15639928163@163.com,2259196468@qq.com";
        String recipientCc = "wangyaqiang@youxin.com";
        String recipientBcc = "15912128112@163.com";
        sendMail(subject, content, recipientTo, recipientCc, recipientBcc, attachments, images, true);
    }
}
