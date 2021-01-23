package com.jikewang.send.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.utils
 * @ClassName: FileUtil
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/13 16:11
 * @Version: 1.0
 */
public class FileUtil {
    public static String getImageStr(File imgFile) {
        InputStream inputStream = null;
        byte[] data = null;
        try {
            inputStream = new FileInputStream(imgFile);
            data = new byte[inputStream.available()];
            inputStream.read(data);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(data);
    }
    public static void main(String[] args) {
        File file = new File("D://w10.png");
        String imageStr = getImageStr(file);
        System.out.println(imageStr);
    }
}