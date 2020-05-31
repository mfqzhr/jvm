package com.mfq.jvm.memory;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/31 21:05
 * @description：
 * @modified By：
 * @version: $
 * 虚拟机栈溢出
 */
public class MyTest2 {

    private int length;

    public int getLength() {
        return length;
    }

    public void test() {
        length++;

        test();
    }

    public static void main(String[] args) {

        MyTest2 myTest2 = new MyTest2();

        try {
            myTest2.test();
        } catch (Throwable throwable) {
            System.out.println(myTest2.getLength());
            throwable.printStackTrace();
        }
    }
}
