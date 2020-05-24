package com.mfq.jvm.bytecode;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/22 14:33
 * @description：
 * @modified By：
 * @version: $
 * 方法的静态分派.
 * Grandpa g1 = new Father();
 * 以上代码,g1的静态类型是Grandpa, 而g1的实际类型(真正指向的类型)是Father.
 *
 * 我们可以得出这样一个结论: 变量的静态类型是不会发生变化的,而变量的实际类型则是可以发生变化的(多态的一种体现),实际
 * 类型是在运行期可以确定的.
 */
public class MyTest5 {
    // 方法的重载, 是一种静态的行为
    public void test(Grandpa grandpa) {
        System.out.println("grandpa");
    }

    public void test(Father father) {
        System.out.println("father");
    }

    public void test(Son son) {
        System.out.println("son");
    }

    public static void main(String[] args) {
        Grandpa p1 = new Father();
        Grandpa p2 = new Son();

        MyTest5 myTest5 = new MyTest5();
        myTest5.test(p1);
        myTest5.test(p2);
    }
}

class Grandpa {

}

class Father extends Grandpa {

}

class Son extends Father {

}
