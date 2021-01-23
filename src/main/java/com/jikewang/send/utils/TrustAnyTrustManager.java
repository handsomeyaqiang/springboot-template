package com.jikewang.send.utils;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.utils
 * @ClassName: TrustAnyTrustManager
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/15 17:28
 * @Version: 1.0
 */
public class TrustAnyTrustManager implements X509TrustManager
{
    public TrustAnyTrustManager() {}

    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {

    }

    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {

    }

    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
