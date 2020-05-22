package jvm;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/21 9:34
 * @description：
 * @modified By：
 * @version: $
 */
public class HelloGC {
    public static void main(String[] args) {
        System.out.println("HelloGC");
        List list = new LinkedList();
        for (;;) {
            byte[] b = new byte[1024 * 1024];
            list.add(b);
        }
    }
}
