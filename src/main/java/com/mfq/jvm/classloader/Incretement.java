package com.mfq.jvm.classloader;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/22 17:46
 * @description：
 * @modified By：
 * @version: $
 */
public class Incretement {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        System.out.println(i);
    }
}
