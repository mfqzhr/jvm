package com.mfq.jvm.classloader;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/1 0:16
 * @description：
 * @modified By：
 * @version: $
 */
public class MyCat {
    public MyCat() {
        System.out.println("MyCat is loaded by: " + this.getClass().getClassLoader());
    }

}
