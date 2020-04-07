package com.hmy.advance.aspect;

import com.hmy.advance.pojo.User;
import com.hmy.advance.service.UserValidator;
import com.hmy.advance.service.impl.UserValidatorImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {

    /**
     * DeclareParents:引入新的来来加强服务，它有两个必需配置的属性
     * 1.value  被增强的目标对象
     * 2.defaultImpl 引入增强功能的类
     */
    @DeclareParents(
            value="com.hmy.advance.service.impl.UserServiceImpl",
            defaultImpl = UserValidatorImpl.class
    )
    public UserValidator userValidator;

    // * 表示任意返回类型 (..)任意参数匹配
    //定义切点
    @Pointcut("execution(* com.hmy.advance.service.impl.UserServiceImpl.save(..))")
    public void pointCut(){

    }

    @Before("pointCut() && args(user)")
    public void before(JoinPoint point, User user){
        System.out.println("before-----------------------");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("after-----------------------");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("afterReturning-----------------------");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing-----------------------");
    }

}
