package com.mfq.jvm.classloader;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/14 17:30
 * @description：
 * @modified By：
 * @version: $
 */
public class SingletonTest {

    private static SingletonTest singleton = new SingletonTest();
    public static int counter1;
    public static int counter2 = 0;

    private SingletonTest() {
        counter1++;
        counter2++;
    }

    public static SingletonTest getInstance() {
        return singleton;
    }

    Collection collection = new ArrayList();
}


class Test {

    public static void main(String[] args) {
        SingletonTest singleton = SingletonTest.getInstance();
        System.out.println("counter1 = " + singleton.counter1);
        System.out.println("counter2 = " + singleton.counter2);
    }
}
