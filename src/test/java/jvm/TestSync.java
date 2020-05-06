package jvm;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/6 14:04
 * @description：
 * @modified By：
 * @version: $
 */
public class TestSync {
    // acc_synchronized
    synchronized void n() {

    }

    // monitorenter monitorexit monitorexit
    void m() {
        synchronized (this) {
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        for (int i = 0; i < 5; i++) {
            Thread a = new Thread(new Runnable() {
                @Override
                public void run() {
                    demo.setText("aaa");
                }
            });
            a.start();
        }
    }

}

class Demo {
    private java.lang.String text;

    public java.lang.String getText() {
        return text;
    }

    public void setText(java.lang.String text) {
        this.text = text;
    }
}
