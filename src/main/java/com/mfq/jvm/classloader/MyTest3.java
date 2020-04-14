package com.mfq.jvm.classloader;

import java.util.UUID;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/14 10:20
 * @description：
 * @modified By：
 * @version: $
 * 当一个常量的值并非编译期间可以确定的,那么其值就不会放到调用类的常量池中,这是在程序
 * 运行期间会导致主动使用这个常量所在的类,显然会导致这个类初始化
 */
public class MyTest3 {
    public static void main(String[] args) {
        //yParent3 static code
        //ed0f2eba-034f-499a-a3c1-a2298d91546f
        System.out.println(MyParent3.str);
    }
}

class MyParent3 {

    public static final String str = UUID.randomUUID().toString();

    static {
        System.out.println("MyParent3 static code");
    }

}
