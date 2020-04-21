package com.mfq.jvm.classloader;

import jdk.internal.org.objectweb.asm.commons.JSRInlinerAdapter;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/21 14:00
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest6 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println("counter1: " + Singleton.counter1);
        System.out.println("counter2: " + Singleton.counter2);
    }
}

class Singleton {
    public static int counter1;
    private static Singleton singleton = new Singleton();
    public static int counter2 = 0;
    private Singleton() {
        counter1++;
        counter2++;
    }

    public static Singleton getInstance() {
        return singleton;
    }


}
