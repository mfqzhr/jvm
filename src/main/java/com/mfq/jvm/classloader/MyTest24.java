package com.mfq.jvm.classloader;

import java.sql.Driver;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/13 13:04
 * @description：
 * @modified By：
 * @version: $
 * 当前类加载器(Current ClassLoader)
 * 每个类都会使用自己的类加载器来去加载其他类
 * 如果Classx引用了ClassY那么 ClassX的类加载器就会去加载ClassY(前提是ClassY尚未加载)
 * <p>
 * 线程上下文类加载器 (Context Classloader)
 * 从jdk1.2开始引用的,类Thread中的getContextClassloader 与 setContextClassloader
 * 分别用于获取和设置上下文加载器.
 * <p>
 * 如果没有通过setContextClassloader进行设置的话,线程将继承其父类的上下文类加载器
 * java应用运行时的初始线程的上下文加载器是系统类加载器. 在线程中运行的代码可以通过类加载器来加载类与资源
 * <p>
 * 线程上下文类加载器的重要性:
 * SPI( service provider interface)
 * 父Classloader可以使用当前线程Thread.currentThread().getContextLoader()
 * 所指定的classloader加载的类
 * 这就改变了父classloader不能使用子classloader或者其他没有直接父子关系的classloader加载的类的情况,
 * 即改变了双亲委托模型
 * 线程上下文类加载器就是当前线程的Current Classloader
 * 在双亲委托模型下,类加载器 是有上至下的,即下层的类加载器会委托上层进行加载. 但是对于SPI来说,有些接口是java
 * 核心库所提供的,而java核心库是由启动类加载器来加载的,而这些接口的实现却来自于不同的jar包,java的启动类加载器
 * 是不会加载其他来源的jar包, 这样传统的双亲委托模型就无法满足SPI的要求. 而通过给当前线程设置上下文加载器,就可以
 * 由设置的上下文加载器来实现对于接口实现类的加载.
 */
public class MyTest24 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println(Thread.class.getClassLoader());
    }
}
