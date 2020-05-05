package com.mfq.jvm.classloader;

import com.sun.crypto.provider.AESKeyGenerator;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/5 14:25
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest19 {
    public static void main(String[] args) {
        AESKeyGenerator aesKeyGenerator = new AESKeyGenerator();
        System.out.println(aesKeyGenerator.getClass().getClassLoader());
        System.out.println(MyTest19.class.getClassLoader());
    }
}
