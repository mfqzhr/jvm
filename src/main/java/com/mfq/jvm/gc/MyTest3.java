package com.mfq.jvm.gc;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/6/18 8:55
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest3 {
    public static void main(String[] args) {
        int size = 1024 * 1024;

        byte[] myAlloc1 = new byte[2 * size];
        byte[] myAlloc2 = new byte[2 * size];
        byte[] myAlloc3 = new byte[2 * size];
        byte[] myAlloc4 = new byte[2 * size];

        System.out.println("hello world");
    }
}
