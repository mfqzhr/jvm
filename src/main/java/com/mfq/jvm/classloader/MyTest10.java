package com.mfq.jvm.classloader;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/29 0:26
 * @description：
 * @modified By：
 * @version: $
 */
class MyParent10 {
    static int a = 3;

    static {
        System.out.println("Parent10 static block");
    }
}

class Child10 extends MyParent10 {
    static int b = 4;

    static {
        System.out.println("Child10 static block");
    }
}

public class MyTest10 {
    static {
        System.out.println("MyTest10 static block");
    }

    public static void main(String[] args) {
        MyParent10 parent10;
        System.out.println("-------------");
        parent10 = new MyParent10();
        System.out.println("-------------");
        System.out.println(parent10.a);
        System.out.println("--------------");
        System.out.println(Child10.b);

    }
}
