package com.centime.hello.configuration;

import com.centime.util.aspect.LoggerAspect;
import com.centime.util.interceptor.AuthenticationRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class HelloConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    public AuthenticationRequestInterceptor authenticationRequestInterceptor() {
        return new AuthenticationRequestInterceptor();
    }

    @Bean
    public LoggerAspect loggerAspect() {
        return new LoggerAspect();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationRequestInterceptor()).addPathPatterns("/hello");
    }
}
