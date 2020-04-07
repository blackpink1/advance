package com.hmy.advance.test;

import com.hmy.advance.service.impl.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Method method = Cat.class.getDeclaredMethod("use");

        Object invoke = method.invoke(Cat.class.newInstance());

    }
}
