package com.mfq.jvm.classloader;

import java.util.Random;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/28 23:43
 * @description：
 * @modified By：
 * @version: $
 */
class FinalTest{
    public static final int x = 3;
    static {
        System.out.println("FinalTest static block");
    }
}
public class MyTest8 {
    public static void main(String[] args) {
        System.out.println(FinalTest.x);
    }
}
