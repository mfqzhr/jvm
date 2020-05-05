package com.mfq.jvm.classloader;

import java.lang.reflect.Method;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/5 14:31
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest20 {
    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        MyTest16 loader2 = new MyTest16("loader2");
        Class<?> class1 = loader1.loadClass("com.mfq.jvm.classloader.MyPerson");
        Class<?> class2 = loader2.loadClass("com.mfq.jvm.classloader.MyPerson");
        System.out.println(class1 == class2);
        Object o = class1.newInstance();
        Object o1 = class2.newInstance();
        Method method1 = class1.getMethod("setMyPerson", Object.class);
        method1.invoke(o, o1);
    }
}

class MyPerson {
    private MyPerson myPerson;

    private MyPerson(Object o) {
        this.myPerson = (MyPerson) o;
    }
}
