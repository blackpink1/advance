package com.hmy.advance.service.impl;

import com.hmy.advance.service.Animal;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    @Override
    public void use() {
        System.out.println("狗可以看门");
    }
}
