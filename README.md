# jvm

#### GC的基础知识

1. 什么是垃圾:
   - c语言申请内存: malloc free
   - c++: new delete
   - java: new
     - 自动内存回收,编程上简单,系统不容易出错,手动释放内存,容易出两类型错误:
       1. 忘记回收
       2. 多次回收
   - which instance are root?
     - jvm stack
     - native method stack
     - run-time
     - constant pool
     - static references in method area
     - Clazz
   
2. 常见的垃圾回收算法:

   - Mark-Sweep(标记清除)
     - 位置不连续,产生碎片
   - Copying(拷贝)
     - 没有碎片,但是浪费空间
   - Mark-Compact(标记压缩)
     - 效率比较低,没有碎片

3. JVM分代算法

   - new - young
     - 存活对象少
     - 使用copy算法,效率高
   - old
     - 垃圾少
     - 一般使用mark compact
     - g1使用copy
   - MethodArea逻辑概念: 永久代(1.7)  元数据(1.8)
     - 方法区是sun公司虚拟机定义的规范。
     - 永久代是方法区的一个实现。
     - 元空间是方法区的一个实现，是永久代的一种替换。
     - jdk1.6及以前stringpool在方法区中，jdk1.7在堆中，
     - jdk1.8在元空间中。jdk1.8元空间维护的是一个StringTable
     - 哈希类，stringpool记录的是引用，实例还是在堆中。
   - 新生代 = eden + 2个suvivor
     1. YGC回收之后,大多数的对象会被回收,活着的进入s0
     2. 再次YGC回收,活着的对象 包括 **eden + s0 -> s1**
     3. 再次YGC,活着的对象 **eden + s1 -> s0**
     4. 年龄足够 -> old
   - 老年代满了
     - FGC Full GC
   - GC Tuning
     1. 尽量减少FGC
     2. MinorGC = YGC
     3. MajorGC = FGC

4. 常见的垃圾回收算法

   1. serial 

      1. 年轻代
      2. 单线程的垃圾回收,串行回收

   2. parnew

      1. 年轻代
      2. 配合cms的并行回收

   3. parallel scavenge

      1. 年轻代
      2. 并行回收

   4. cms

      1. ConcurrentMarkSweep: 并发的,垃圾回收和应用程序同时运行,降低STW的时间(200ms)
      2. 老年代

   5. G1(10ms)

   6. ZGC(1ms pk c++)

   7. Shenandoah

   8. eplison

   9. serial old

   10. parallel old

       1.8默认的垃圾回收: PS + Parallel

#### class文件格式

1. java从编码到执行的过程:

   

   ![](https://github.com/mfqzhr/jvm/blob/master/images/a.png)

2. jvm和java无关:

   

   ![](https://github.com/mfqzhr/jvm/blob/master/images/b.png)

3. jvm是一种规范

#### JDK JRE JVM

​		![](https://github.com/mfqzhr/jvm/blob/master/images/c.png)

#### class file format

- 二进制字节流
- 数据类型: u1 u2 u4 u8 和 _info(表类型)
  - _info的来源是hotspot源码中的写法
- 可以观察ByteCode的方法:
  - javap
  - JBE - 可以直接改
  - JClassLib - IDEA的插件
- 

```java
package com.mfq.jvm.bytecode;

public class T0100_ByteCode01 {
	

}

/**
cafe babe 0000 0031 0010 0700 0201 0025
636f 6d2f 6d66 712f 6a76 6d2f 6279 7465
636f 6465 2f54 3031 3030 5f42 7974 6543
6f64 6530 3107 0004 0100 106a 6176 612f
6c61 6e67 2f4f 626a 6563 7401 0006 3c69
6e69 743e 0100 0328 2956 0100 0443 6f64
650a 0003 0009 0c00 0500 0601 000f 4c69
6e65 4e75 6d62 6572 5461 626c 6501 0012
4c6f 6361 6c56 6172 6961 626c 6554 6162
6c65 0100 0474 6869 7301 0027 4c63 6f6d
2f6d 6671 2f6a 766d 2f62 7974 6563 6f64
652f 5430 3130 305f 4279 7465 436f 6465
3031 3b01 000a 536f 7572 6365 4669 6c65
0100 1554 3031 3030 5f42 7974 6543 6f64
6530 312e 6a61 7661 0021 0001 0003 0000
0000 0001 0001 0005 0006 0001 0007 0000
002f 0001 0001 0000 0005 2ab7 0008 b100
0000 0200 0a00 0000 0600 0100 0000 0300
0b00 0000 0c00 0100 0000 0500 0c00 0d00
0000 0100 0e00 0000 0200 0f
*/

```

​		![](https://github.com/mfqzhr/jvm/blob/master/images/d.png)

#### jvm工具使用

- jconsole
- jvisualvm

#### 类加载机制

- 在java代码中,类型的加载,连接与初始化工程都是在程序运行期间完成的

  - 加载: 从磁盘到内存的时候完成(查找并加载类的二进制数据)

  - 连接: 

    - 验证: 确保被加载的类的正确性

    - 准备: 为类的静态变量分配内存,并将其初始化为默认值

      ```java
      class Test {
      	public static int a = 1
      }
      // 上面代码中在连接在准备阶段 a = 0
      ```

    - 解析: 把类中的符号引用转换为直接引用

      - 符号引用: 和内存没有多大关系
      - 直接引用: 直接指向内存

  - 初始化:  为类的静态变量赋值为正确的初始值 

- 提供了更大的灵活性,增加了更多的可能性

- java虚拟机与程序的生命周期

  - 执行了System.exit()方法
  - 程序正常执行结束
  - 程序在执行过程中遇到了异常或者错误而异常终止
  - 由于操作系统错误而导致java虚拟机进程终止

  

  

#### 类的加载,连接与初始化

- java程序对类的使用方式可分为两种
  - 主动使用:
  - 被动使用
- 所有的java虚拟机实现必须在每个类或接口被java程序首次主动使用时才初始化他们

主动使用:(七种)

- 创建类的实例
- 访问某个类或接口的静态变量,或者对改静态变量赋值
- 调用类的静态方法
- 反射
- 初始化一个类的子类
- java虚拟机启动时被标明为启动类的类
- jdk1.7开始提供的动态语言支持
- 除了上面七种情况,其他使用java类都不是主动使用,不会初始化
- 类的加载指的是将类的.class分拣中的二进制数据读入到内存中,将其放在运行时数据区的方法区中,然后在内存中创建一个java.lang.Class对象用来封装类在方法区内的数据结构 

#### 类的加载

- 加载.class文件的方式
  - 从本地系统中直接加载
  - 通过网络下载.class文件
  - 从zip.jar等归档文件中加载.class文件
  - 从转悠数据库中提取.class文件
  - 将java源文件动态编译为.class文件