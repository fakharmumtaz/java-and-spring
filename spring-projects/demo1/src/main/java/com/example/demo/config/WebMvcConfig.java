package com.example.demo.config;

import com.example.demo.interceptor.RequestLoggingInterceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebMvcConfig
        implements WebMvcConfigurer {

    private final RequestLoggingInterceptor interceptor;

    public WebMvcConfig(
            RequestLoggingInterceptor interceptor) {
        this.interceptor = interceptor;
    }

    @Override
    public void addInterceptors(
            InterceptorRegistry registry) {

        registry
                .addInterceptor(interceptor)
                .addPathPatterns("/api/**");
    }
}