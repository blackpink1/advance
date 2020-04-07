package com.hmy.advance.config;

import com.hmy.advance.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ComponentScan  意味着会扫描
 * 默认情况下扫描被注解所在类的包和其子包
 *  basePackages 指定扫描的包
 *  basePackagesClasses  定义扫描的类
 *  includeFilters 满足条件扫描
 *  excludeFilters 满足条件不扫描
 *  lazyInit 是否延迟初始化
 */

@Configuration
//@ComponentScan("com.hmy.advance")
public class AppConfig {

//    @Bean
//    public User initUser(){
//        User user = new User();
//        user.setId(1);
//        user.setName("hmy");
//        return user;
//    }
}
