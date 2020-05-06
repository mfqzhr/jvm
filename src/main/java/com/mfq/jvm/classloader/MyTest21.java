package com.mfq.jvm.classloader;

import java.lang.reflect.Method;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/5 15:02
 * @description： 类加载器的双亲委托机制的好处:
 * 1. 可以确保java核心库的类型安全,所有的java应用都至少会引用java.lang.Object类,
 * 也就是说在运行期,java.lang.Object类会被加载到java虚拟机中,如果这个加载过程是由自己的类加载器
 * 所完成的,那么可能就会在JVM中存在多个版本的java.lang.Object类,而且这个类之间还是不兼容的,相互不可见的.
 * (正是命名空间在发挥着作用).借助于双亲委托机制,java核心类库中的加载操作都是在启动类加载器中同一完成,从而确保了
 * java应用所使用的都是同一个版本的java类库,他们之间都是相互兼容的
 * 2. 可以确保java核心类库所提供的类不会被自定义的类所替代
 * 3. 不同的类加载器可以被相同名称的类创建额外的命名空间.那么相同名称的类可以并存在java虚拟机中. 只需要用不通的类
 * 加载器来加载即可,.不同类加载器所加载的类时互不兼容的,这就相当于在Java虚拟机内部创建了一个又一个相互隔离的java
 * 类空间,这类技术在很多框架中都得到了实际应用
 * @modified By：
 * @version: $
 */
public class MyTest21 {
    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        MyTest16 loader2 = new MyTest16("loader2");
        loader1.setPath("E:/");
        loader2.setPath("E:/");
        Class<?> class1 = loader1.loadClass("com.mfq.jvm.classloader.MyPerson");
        Class<?> class2 = loader2.loadClass("com.mfq.jvm.classloader.MyPerson");
        System.out.println(class1 == class2);
        Object o = class1.newInstance();
        Object o1 = class2.newInstance();
        Method method1 = class1.getMethod("setMyPerson", Object.class);
        method1.invoke(o, o1);
    }
}
