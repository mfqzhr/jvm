package com.mfq.jvm.classloader;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/5 14:07
 * @description：
 * @modified By：
 * @version: v1$
 */
public class MyTest18_1 {
    public static void main(String[] args) {
        MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath("E:/");
        try {
            Class<?> aClass = loader1.loadClass("com.mfq.jvm.classloader.MyTest1");
            System.out.println(aClass.getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
