package com.mfq.jvm.classloader;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/13 23:32
 * @description：
 * @modified By：
 * @version: $
 * 对于静态字段来说,只有直接定义了该字段的类才会被初始化
 * 昂一个类在初始化时,要求其父类全部都初始化完毕
 * -XX:+TraceClassLoading,用于追踪类的加载信息并打印出来
 */
public class MyTest1 {
    public static void main(String[] args) {
        //System.out.println(MyChild1.str1);//MyParent1 static block   hello world
        System.out.println(MyChild1.str2);
        /*  MyParent1 static block
            MyChild1 static block
            welcome
         */
    }
}

class MyParent1 {
    public static String str1 = "hello world";

    static {
        System.out.println("MyParent1 static block");
    }
}

class MyChild1 extends MyParent1 {
    public static String str2 = "welcome";

    static {
        System.out.println("MyChild1 static block");
    }
}


