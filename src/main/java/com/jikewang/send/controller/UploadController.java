package com.jikewang.send.controller;

import com.jikewang.send.utils.Consts;
import com.jikewang.send.utils.TimeUtil;
import com.jikewang.send.vo.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.controller
 * @ClassName: UploadController
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/15 15:02
 * @Version: 1.0
 */
@RestController
@RequestMapping({"/send/upload"})
public class UploadController {
    private static final Logger log = LoggerFactory.getLogger(UploadController.class);

    @RequestMapping({"/add"})
    public RestResult uploadTmp(@RequestParam("file") MultipartFile file, String type, String name) throws Exception {
        File tmpFile;
        if (file == null || StringUtils.isEmpty(name) || StringUtils.isEmpty(type)) {
            return RestResult.error();
        }
        String fileName = file.getOriginalFilename();
        if ("cpt".equals(type)) {
            if (!fileName.endsWith(".cpt")) {
                return RestResult.error("格式有误！");
            }
            tmpFile = new File(Consts.CPT_PATH + "reportlets");
        } else if ("dw".equals(type)) {
            if (fileName.endsWith(".cpt")) {
                return RestResult.error("格式有误！");
            }
            tmpFile = new File(Consts.DW_PATH + name + "/" + TimeUtil.format(new Date(), "yyyyMMdd") + "/");
        } else {
            tmpFile = new File(Consts.TMP_PATH);
        }
        if (!tmpFile.exists()) {
            tmpFile.mkdirs();
        }
        File destFile = new File(tmpFile, fileName);
        if (destFile.exists()) {
            File bakFile = new File(tmpFile, System.currentTimeMillis() + "_" + fileName);
            destFile.renameTo(bakFile);
        }
        file.transferTo(destFile);
        Map<String, Object> data = new HashMap<String, Object>(3);
        data.put("imgName", fileName);
        data.put("imgUrl", "http://10.255.33.5/images/send/tmp/" + fileName);
        return RestResult.success(data);
    }
}
