package jvm;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/11 15:00
 * @description：
 * @modified By：
 * @version: $
 */
public class InvokeDynamic {
    public static void main(String[] args) {
        I i = C:: n;
        i.n();
        System.out.println(i.getClass());
    }
    @FunctionalInterface
    public interface I {
        void n();
    }

    public static class C {
        static void n() {
            System.out.println("hello");
        }
    }
}
