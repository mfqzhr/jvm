package com.mfq.jvm.classloader;

import java.util.Random;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/21 13:38
 * @description： 当一个接口在初始化时 ,并不要求其父接口都完成了初始化,只有真正使用到父接口的时候,才会初始化
 * @modified By：
 * @version: $
 */
public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(MyChild5.b);
    }
}

interface MyParent5 {
    public static int a = 5;
}

interface MyChild5 extends MyParent5 {
    public static final int b = 3;
}
