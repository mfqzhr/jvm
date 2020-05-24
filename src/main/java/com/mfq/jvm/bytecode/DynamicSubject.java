package com.mfq.jvm.bytecode;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/24 19:23
 * @description：
 * @modified By：
 * @version: $
 */
public class DynamicSubject implements InvocationHandler {
    private Object sub;

    public DynamicSubject(Object o) {
        sub = o;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling: " + method);
        method.invoke(this.sub, args);
        System.out.println("after calling: " + method);
        return null;
    }
}
