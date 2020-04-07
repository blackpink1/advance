package com.hmy.advance.interceptor;

import com.hmy.advance.service.HelloService;
import com.hmy.advance.service.impl.HelloServiceImpl;

public class Demo {

    public static void main(String[] args){

        HelloService helloService = new HelloServiceImpl();
        HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());
        proxy.sayHello("hmy");
    }
}
