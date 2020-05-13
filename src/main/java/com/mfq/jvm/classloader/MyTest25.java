package com.mfq.jvm.classloader;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/13 14:23
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest25 implements Runnable {
    private Thread thread;

    public MyTest25() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        ClassLoader classLoader = thread.getContextClassLoader();

        thread.setContextClassLoader(classLoader);

        System.out.println("Class: " + classLoader.getClass());
        System.out.println("Parent: " + classLoader.getParent().getClass());
    }

    public static void main(String[] args) {
        new MyTest25();
    }
}
