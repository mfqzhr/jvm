package com.mfq.jvm.bytecode;

public class MyTest2 {
    String str = "Welcome";

    private int x = 5;

    public static Integer in = 10;
    static {
        System.out.println("test");
    }

    private final Object object = new Object();

    public static void main(String[] args) {
        MyTest2 myTest2 = new MyTest2();

        myTest2.setX(8);

        in = 20;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void test() {
        synchronized (object) {
            System.out.println("1");
        }
    }

    public static synchronized void test2() {

    }

}
