package jvm;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/5 10:56
 * @description：
 * @modified By：
 * @version: $
 */
public class Singleton {
    private static volatile Singleton INSTANCE = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (null != INSTANCE) {

        } else {
            synchronized (Singleton.class) {
                if (null == INSTANCE) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
