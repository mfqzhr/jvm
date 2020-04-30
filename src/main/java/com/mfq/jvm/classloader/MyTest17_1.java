package com.mfq.jvm.classloader;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/1 0:42
 * @description： 子加载器加载的类能够访问父加载器加载的类
 * 父加载器加载的类不能够访问子加载器加载的类
 * @modified By：
 * @version: $
 */
public class MyTest17_1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyTest16 loader1 = new MyTest16("loader1");
        loader1.setPath("E:\\");
        Class<?> aClass = loader1.loadClass("com.mfq.jvm.classloader.MyTest1");
        System.out.println("class: " + aClass.hashCode());
        Object o = aClass.newInstance();
    }
}
