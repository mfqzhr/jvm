package com.mfq.jvm.classloader;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/13 14:34
 * @description：
 * @modified By：
 * @version: $
 * 线程上下文类加载器的一般使用模式(获取 - 使用 - 还原)
 * <p>
 * ClassLoader classloader = Thread.currentThread.getContextClassloader();
 */
public class MyTest26 {
    public static void main(String[] args) {
        Thread.currentThread().setContextClassLoader(MyTest26.class.getClassLoader().getParent());
        ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = loader.iterator();
        while (iterator.hasNext()) {
            Driver driver = iterator.next();
            System.out.println("driver: " + driver.getClass() +
                    ", loader: " + driver.getClass().getClassLoader());
        }
        System.out.println("当前线程上下文加载器: " + Thread.currentThread().getContextClassLoader());
        System.out.println("ServiceLoader的类加载器: " + ServiceLoader.class.getClassLoader());

    }
}
