//package com.nongkeezhan.nkez.constants;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//@Configuration
//public class MyStaticResource extends WebMvcConfigurerAdapter {
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        //addResourceHandler中的是访问路径，可以修改为其他的字符串
//        //addResourceLocations中的是实际路径
//
////        将html中对/assets路径下的请求转移到/templates/assets下
//        registry.addResourceHandler("/nkezApi/**").addResourceLocations("http://localhost:8080/");
//        super.addResourceHandlers(registry);
//    }
//}