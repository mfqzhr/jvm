package com.mfq.jvm.bytecode;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/24 18:32
 * @description：
 * @modified By：
 * @version: $
 * 现代JVM在执行代码的时候.通常都会将解释执行和编译执行二者结合起来,所谓解释执行就是通过解释器来读取字节码.遇到
 * 相应的指令就去执行该命令,
 * 所谓编译执行,是通过即时编译器(Just In Time) JIT将字节码转换为本地机器码执行,现代JVM会根据代码热点来生成相应的
 * 本地机器码
 * 基于栈的指令集与基于寄存器的指令集之间的关系:
 * 1.JVM执行指令时所采用的方式是基于栈的指令集
 * 2.基于栈的指令集的主要操作有入栈与出栈两种
 * 3.基于栈的指令集的优势在于他可以在不同平台之间移植,而基于寄存器的指令集是与硬件架构紧密相关的,无法做到可移植
 * 4.基于栈的指令集的缺点在于完成相同的操作,指令集的数量通常要比基于寄存器的指令集的数量要多;基于栈的指令集是在
 * 内存中完成的
 * 5.基于寄存器的指令集是直接有CPU执行的,他是在告诉缓冲区进行执行的,速度快很多.虽然虚拟机可以采用一些优化手段,,
 * 2 - 1: iconst_1 iconst_2 isub istore_0
 */
public class MyTest8 {
    public int myCalculate() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int result = (a + b - c) * d;
        return result;
    }

}
