package jvm;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/2 20:50
 * @description：
 * @modified By：
 * @version: $
 */
public class ObjectTest {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        synchronized (o) {
        }
        System.out.println(ClassLayout.parseInstance(o).toPrintable());

    }
}
