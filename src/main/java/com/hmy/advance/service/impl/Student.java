package com.hmy.advance.service.impl;

import com.hmy.advance.service.Animal;
import com.hmy.advance.service.Persion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student implements Persion {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(Student.class);

    @Autowired
    Animal animal;

    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
