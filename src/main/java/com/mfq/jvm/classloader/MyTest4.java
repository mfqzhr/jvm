package com.mfq.jvm.classloader;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/14 10:31
 * @description：
 * @modified By：
 * @version: $
 * 对于数组实例来说,其类型是由JVM在运行期动态生成的,表示为[com.mfq.jvm.classloader.MyParent4
 * 动态生成的类型,其父类就是Object
 * 对于数组来说,javaDoc经常将构成数组的元素为Component,实际上就是将数组降低一个维度的类型
 * 助记符:
 * anewarray: 表示创建一个引用类型的数组,并将其引用值压入栈顶
 * newarray: 表示创建一个指定的如原始类型的数组,并将其引用值压入栈顶
 */
public class MyTest4 {
    public static void main(String[] args) {
        MyParent4 myParent4 = new MyParent4();
        System.out.println("======");
        MyParent4 myParent41 = new MyParent4();
        MyParent4[] myParent4s = new MyParent4[1];
        System.out.println(myParent4s.getClass());
        System.out.println(myParent4.getClass().getSuperclass());
        MyParent4[][] myParent4s1 = new MyParent4[1][1];
        System.out.println(myParent4s1.getClass());
        System.out.println(myParent4s1.getClass().getSuperclass());
        System.out.println("=====");
        int[] ints = new int[1];
        System.out.println(ints.getClass());
        System.out.println(ints.getClass().getSuperclass());

    }
}

class MyParent4 {
    static {
        System.out.println("MyParent4 static block");
    }
}
