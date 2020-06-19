package com.mfq.jvm.gc;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/6/17 9:19
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest1 {
    public static void main(String[] args) {

        int size = 1024 * 1024;

        byte[] myAllocl1 = new byte[2 * size];
        byte[] myAllocl2 = new byte[2 * size];
        byte[] myAllocl3 = new byte[2 * size];

        for (byte b : myAllocl1) {
            System.out.println(b);
        }
    }
}
