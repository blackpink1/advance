package com.hmy.advance.test;


import com.hmy.advance.config.AppConfig;
import com.hmy.advance.pojo.User;
import com.hmy.advance.scope.ScopeBean;
import com.hmy.advance.service.impl.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(IocTest.class);

     public static void main(String[] args){
         ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
         ScopeBean bean = ctx.getBean(ScopeBean.class);
         ScopeBean bean2 = ctx.getBean(ScopeBean.class);
         System.out.println(bean==bean2);
     }

}
