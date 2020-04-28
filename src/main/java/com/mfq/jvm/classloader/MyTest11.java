package com.mfq.jvm.classloader;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/29 0:40
 * @description：
 * @modified By：
 * @version: $
 */
class MyParent11 {
    static int a = 3;

    static {
        System.out.println("MyParent11 static block");
    }

    static void doSomething() {
        System.out.println("Do Something");
    }
}

class MyChild11 extends MyParent11 {
    static {
        System.out.println("MyChild11 static block");
    }
}

public class MyTest11 {
    public static void main(String[] args) {
        System.out.println(MyChild11.a);
        MyChild11.doSomething();
    }
}
