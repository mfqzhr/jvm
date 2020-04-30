package com.mfq.jvm.classloader;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/29 1:40
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest14 {
    public static void main(String[] args) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(contextClassLoader);
        while (contextClassLoader != null) {
            contextClassLoader = contextClassLoader.getParent();
            System.out.println(contextClassLoader);
        }
    }
}
