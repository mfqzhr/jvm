package jvm;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/11 14:32
 * @description：
 * @modified By：
 * @version: $
 */
public class RecusionTest {
    public static void main(String[] args) {
        RecusionTest recusionTest = new RecusionTest();
        int i = recusionTest.m(3);
    }

    public int m(int n) {
        if (n == 1) {
            return 1;
        }
        return n * m(n - 1);
    }
}
