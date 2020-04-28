package com.mfq.jvm.classloader;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/29 1:11
 * @description：
 * @modified By：
 * @version: $
 */
class CL {
    static {
        System.out.println("Class CL");
    }
}

// 调用classloader类的loadClass方法加载一个类,并不是对类的主动使用,不会导致类的初始化
public class MyTest12 {
    public static void main(String[] args) {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        try {
            Class<?> aClass = loader.loadClass("com.mfq.jvm.classloader.CL");
            System.out.println(aClass);
            System.out.println("-----------");
            aClass = Class.forName("com.mfq.jvm.classloader.CL");
            System.out.println(aClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
