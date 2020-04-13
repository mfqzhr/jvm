package com.mfq.jvm.classloader;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/14 0:05
 * @description：
 * @modified By：
 * @version: $
 * 助记符:
 * ldc表示将int,float或者string类型的常量值从常量池中推送至栈顶
 * bipush表示将单字节(-128 ~127)的常量值从常量池中推送至栈顶
 * sipush表示将一个短整型(-32768 ~ 32767)的常量值从常量池中推送至栈顶
 */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyParent2.i);
    }
}


class MyParent2 {
    // 常量在编译阶段,会放在调用这个常量的方法
    // 所在类的常量池中, 本质上,调用类并没有直接引用
    // 到定义常量的类,因此并不会触发定义常量的类的初始化
    // 注意: 这里指的是将常量存放到了MyTest2的常量池中,之后MyTest2与MyParent2就没有任何关系了
    // 我们可以将MyParent2的class文件删除
    public static final String str = "hello world";
    public static final short s = 7;
    public static final int i = 128;

    static {
        System.out.println("MyParent2 static block");
    }
}

class MyChild2 {

}
