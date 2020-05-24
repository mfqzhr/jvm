package com.mfq.jvm.bytecode;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/24 19:22
 * @description：
 * @modified By：
 * @version: $
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("From real subject");
    }
}
