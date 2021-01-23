package com.jikewang.send.utils;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.utils
 * @ClassName: TrustAnyHostnameVerifier
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/15 17:28
 * @Version: 1.0
 */
public class TrustAnyHostnameVerifier implements HostnameVerifier {
    public TrustAnyHostnameVerifier() {}

    public boolean verify(String hostname, SSLSession session) {
        return true;
    }
}
