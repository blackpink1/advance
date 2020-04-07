package com.hmy.advance;

import com.hmy.advance.aspect.MyAspect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.hmy.advance.mapper")
public class AdvanceApplication {

    @Bean
    public MyAspect initMyAspect(){
        return new MyAspect();
    }


    public static void main(String[] args) {
        SpringApplication.run(AdvanceApplication.class, args);
    }

}
