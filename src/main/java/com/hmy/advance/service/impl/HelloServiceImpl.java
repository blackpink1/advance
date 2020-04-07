package com.hmy.advance.service.impl;

import com.hmy.advance.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello(String name) {
        if(name==null||name.trim()==""){
            throw new RuntimeException("param is null");
        }

        System.out.println("Hello!"+name);
    }
}
