package com.vita.config;/**
 * Created by tawift on 2018/11/21.
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * code is far away from bug with the animal protecting
 * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
 *
 * @Description :
 * ---------------------------------
 * @Author : tawift
 * @Date : Create in 2018/11/21 18:45
 */
//@Configuration
public class Config extends WebMvcConfigurerAdapter {

    //    @Bean(name = "mapperObject")
//    public ObjectMapper getObjectMapper() {
//        ObjectMapper om = new ObjectMapper();
//        Module module = new JsonComponentModule();
//        module.setupModule(LocalDateTime.class, new LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//        module.setupModule(LocalDate.class, new LocalDateSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//        module.setupModule(LocalTime.class, new LocalTimeSerializer(DateTimeFormatter.ofPattern("HH:mm:ss")));
//        om.registerModule(module);
//        return om;
//    }
    static final String ORIGINS[] = new String[]{"GET", "POST", "PUT", "DELETE", "OPTIONS"};

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*").allowCredentials(true).allowedMethods(ORIGINS)
                .maxAge(3600);
    }
}
