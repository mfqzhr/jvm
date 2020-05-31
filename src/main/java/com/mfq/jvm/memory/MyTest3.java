package com.mfq.jvm.memory;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/31 21:19
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest3 {
    public static void main(String[] args) {
        new Thread(A::method).start();
        new Thread(B::method).start();

    }
}

class A {
    public static synchronized void method() {
        System.out.println("method from A");
        try {
            Thread.sleep(5000);
            B.method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class B {
    public static synchronized void method() {
        System.out.println("method from B");
        try {
            Thread.sleep(5000);
            A.method();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
