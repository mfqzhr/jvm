package com.mfq.jvm.bytecode;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/22 11:03
 * @description：
 * @modified By：
 * @version: $
 * 栈帧(stack frame)
 * 栈帧是一种用于帮助虚拟机执行方法调用与方法执行的数据结构.
 * 栈帧是一种数据结构,封装了方法的局部变量表,动态链接信息,方法的返回地址以及操作数栈等信息.
 * 符号引用,直接引用
 * 有些符号引用是在类加载阶段或者是第一次使用时就会转换为直接引用,这种转换叫做静态解析; 另外一些符号引用则是在每次
 * 运行期转换为直接引用,这种转换叫做动态链接,这体现了java的多态性
 *
 */
public class MyTest4 {
    public void test() {
        int a = 3;

        if (a < 4) {
            int b = 4;
            int c = 5;
        }
        int d = 6;
        int e = 7;
    }
}
