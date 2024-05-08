package com.example.securityspring2.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    public static final String FORWARD = "forward:/";

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/{spring:\\w+}")
                .setViewName(FORWARD);
        registry.addViewController("/**/{spring:\\w+}")
                .setViewName(FORWARD);
        registry.addViewController("/{spring:\\w+}/**{spring:?!(\\.js|\\.css)$}")
                .setViewName(FORWARD);
    }


}
