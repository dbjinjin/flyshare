package com.kakasys.flyshare.config;

import com.kakasys.flyshare.Interceptor.LogInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2019/1/7 11:08</p>
 * <p>类全名：com.kakasys.flyshare.config.LoginConfig</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
@Configuration
public class LoginConfig implements WebMvcConfigurer/*extends WebMvcConfigurationSupport*/
{
    //继承 WebMvcConfigurationSupport 会导致全局jakson配置无效
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(new LogInterceptor()).addPathPatterns("/**");
    }
}
