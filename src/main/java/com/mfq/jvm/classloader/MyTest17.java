package com.mfq.jvm.classloader;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/1 0:20
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest17 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyTest16 loader1 = new MyTest16("loader1");
        Class<?> aClass = loader1.loadClass("com.mfq.jvm.classloader.MySample");
        System.out.println(aClass.hashCode());
        Object o = aClass.newInstance();
        System.out.println(o);
    }
}
