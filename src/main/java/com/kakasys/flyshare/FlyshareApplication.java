package com.kakasys.flyshare;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>版权： Copyright (c) 2018</p>
 * <p>创建日期：2018/12/13 20:55</p>
 * <p>类全名：com.kakasys.flyshare.FlyshareApplication</p>
 * <p>
 * 作者：wuxiaohai
 * 初审：
 * 复审：
 *
 * @version 1.0
 */
@SpringBootApplication
@MapperScan("com.kakasys.flyshare")
public class FlyshareApplication extends SpringBootServletInitializer
{
    private static Logger logger = LogManager.getLogger(FlyshareApplication.class);


    public static void main(String[] args)
    {
        SpringApplication.run(FlyshareApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(FlyshareApplication.class);
    }
}
