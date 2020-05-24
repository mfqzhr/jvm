package com.mfq.jvm.bytecode;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/22 14:57
 * @description：
 * @modified By：
 * @version: $
 *
 * 方法的动态分派:
 * 方法的动态分派涉及到一个重要的概念: 方法接收者.
 * invokevirtual字节码指令的多态查找流程
 * 比较方法重载与方法重写,我们可以得到这样一个结论:
 * 方法重载是静态的,是编译期行为;方法重写是动态的,是运行期的行为
 */
public class MyTest6 {
    public static void main(String[] args) {
        Fruit fruit = new Apple();
        Orange orange = new Orange();
        fruit.test();
        orange.test();

        fruit = new Orange();
        fruit.test();
    }
}

class Fruit {
    public void test() {
        System.out.println("Fruit");
    }
}

class Apple extends Fruit {
    @Override
    public void test() {
        System.out.println("Apple");
    }
}

class Orange extends Fruit {
    @Override
    public void test() {
        System.out.println("Orange");
    }
}
