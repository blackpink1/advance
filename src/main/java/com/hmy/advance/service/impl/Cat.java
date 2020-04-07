package com.hmy.advance.service.impl;

import com.hmy.advance.service.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Cat implements Animal {

    @Override
    public void use() {
        System.out.println("猫会喵喵叫");
    }
}
