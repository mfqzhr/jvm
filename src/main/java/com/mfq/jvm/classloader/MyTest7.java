package com.mfq.jvm.classloader;

import sun.misc.Launcher;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/28 11:36
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest7 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            System.out.println(clazz.getClassLoader());
            Class<?> aClass = Class.forName("com.mfq.jvm.classloader.C");
            System.out.println(aClass.getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class C {

}
