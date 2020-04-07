package com.hmy.advance.interceptor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Invocation {

    private Object[] params;

    private Method method;

    private Object target;

    public Invocation(Object target,Method method,Object[] params){
        this.params = params;
        this.method = method;
        this.target = target;
    }

    //反射方法
    public Object proceed() throws InvocationTargetException,IllegalAccessException{
        return method.invoke(target,params);
    }
}
