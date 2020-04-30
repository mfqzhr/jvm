package com.mfq.jvm.classloader;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/29 11:25
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest15 {
    public static void main(String[] args) {
        String[] strings = new String[2];
        System.out.println(strings.getClass().getClassLoader());
    }
}
