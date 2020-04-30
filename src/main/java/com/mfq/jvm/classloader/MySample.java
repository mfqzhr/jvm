package com.mfq.jvm.classloader;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/1 0:18
 * @description：
 * @modified By：
 * @version: $
 */
public class MySample {
    public MySample() {
        System.out.println("MySample is loaded by: " + this.getClass().getClassLoader());
        new MyCat();
    }
}
