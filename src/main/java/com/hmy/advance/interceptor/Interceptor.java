package com.hmy.advance.interceptor;

import java.lang.reflect.InvocationTargetException;

public interface Interceptor {

    //事前方法
    public boolean before();

    //事后方法
    public boolean after();

    /*
     * 取代原有的事件方法
     */
    public Object around(Invocation invocation) throws InvocationTargetException,IllegalAccessException;

    //事后返回方法。事件无异常执行
    public void afterReturning();

    //事后返回方法。事件异常时执行
    public void afterThrowing();

    //是否让arround方法取代原有的方法
    boolean useAround();

}
