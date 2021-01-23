package com.jikewang.send.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: send
 * @Package: com.jikewang.send.config
 * @ClassName: WebConfiguration
 * @Author: wangyaqiang
 * @Description:
 * @Date: 2021/1/13 15:04
 * @Version: 1.0
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer{
    @Value("${base.imagePath}")
    private String imagePath;

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(new SerializerFeature[] { SerializerFeature.PrettyFormat });

        List<MediaType> fastMediaTypes = new ArrayList<MediaType>();
        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        fastConverter.setSupportedMediaTypes(fastMediaTypes);
        fastConverter.setFastJsonConfig(fastJsonConfig);
        converters.add(fastConverter);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (StringUtils.isEmpty(this.imagePath)) {
            String imagesPath = WebConfiguration.class.getClassLoader().getResource("").getPath();
            if (imagesPath.indexOf(".jar") > 0) {
                imagesPath = imagesPath.substring(0, imagesPath.indexOf(".jar"));
            } else if (imagesPath.indexOf("classes") > 0) {
                imagesPath = "file:" + imagesPath.substring(0, imagesPath.indexOf("classes"));
            }
            imagesPath = imagesPath.substring(0, imagesPath.lastIndexOf("/")) + "/images/";
            this.imagePath = imagesPath;
        }
        LoggerFactory.getLogger(WebConfiguration.class).info("imagesPath=" + this.imagePath);
        registry.addResourceHandler(new String[] { "/images/**" }).addResourceLocations(new String[] { "file:" + this.imagePath });
        registry.addResourceHandler(new String[] { "*" }).addResourceLocations(new String[] { "classpath:/META-INF/resources/", "classpath:/resources/", "classpath:/static/", "classpath:/public/" });
    }
}
