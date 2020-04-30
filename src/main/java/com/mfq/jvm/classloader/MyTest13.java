package com.mfq.jvm.classloader;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/29 1:25
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest13 {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        while (null != systemClassLoader) {
            systemClassLoader = systemClassLoader.getParent();
            System.out.println(systemClassLoader);
        }
    }
}
