package com.mfq.jvm.classloader;

import sun.misc.Launcher;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/11 13:04
 * @description：
 * @modified By：
 * @version: $
 * 在运行期一个java类是由该类的完全限定名(binary name, 二进制名) 和用于加载该类的
 * 定义类加载器(defining loader) 所共同决定的.
 * 如果同样名字(即相同的完全限定名)的类是由两个不同的加载器所加载,那么这些类就是不同的,即使.class文件的字节码
 * 完全一样,并且从相同的位置加载也是如此
 * 在Oracle的Hotspot实现中,系统属性sun.boot.class.path如果修改错误了,则会运行出错,提示如下错误信息:
 */
public class MyTest23 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
        /*
            内建于jvm中的启动类加载器会加载java.lang.ClassLoader以及其他的java平台类,当JVM启动时,
            一块特殊的机器码会运行,它会加载扩展类加载器与系统类加载器,
            这块特殊的机器码叫做启动类加载器(Bootstrap)

            启动类加载器并不是Java类,而其他的加载器都是Java类.
            启动类加载器是特定于平台的机器指令,他负责开启整个加载过程
         */
        System.out.println(ClassLoader.class.getClassLoader());
        // 扩展类加载器与系统类加载器也是有启动类加载器加载的
        System.out.println(Launcher.class.getClassLoader());
        System.out.println(System.getProperty("java.system.class.loader"));
    }
}
