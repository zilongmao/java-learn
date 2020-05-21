package com.lzlk.Ch1_java_base;

/**
 * TODO: 基本数据类型介绍
 *
 * 基本数据类型是CPU可以直接进行运算的类型。Java定义了以下几种基本数据类型：
 *
 * 整数类型：byte，short，int，long
 *
 * 浮点数类型：float，double
 *
 * 字符类型：char
 *
 * 布尔类型：boolean
 *
 * Java定义的这些基本数据类型有什么区别呢？要了解这些区别，我们就必须简单了解一下计算机内存的基本结构。
 *
 * 计算机内存的最小存储单元是字节（byte），一个字节就是一个8位二进制数，即8个bit。它的二进制表示范围从00000000~11111111，换算成十进制是0~255，换算成十六进制是00~ff。
 *
 * 内存单元从0开始编号，称为内存地址。每个内存单元可以看作一间房间，内存地址就是门牌号。
 *
 * 一个字节是1byte，1024字节是1K，1024K是1M，1024M是1G，1024G是1T。一个拥有4T内存的计算机的字节数量就是：
 *
 * 4T = 4 x 1024G
 *    = 4 x 1024 x 1024M
 *    = 4 x 1024 x 1024 x 1024K
 *    = 4 x 1024 x 1024 x 1024 x 1024B
 *    = 4398046511104
 *
 * 不同的数据类型占用的字节数不一样。下列是Java基本数据类型占用的字节数：
 *
 * 整型：
 *      byte：1
 *      short：2
 *      int：4
 *      long：8
 * 浮点数：
 *      float：4
 *      double：8
 * 字符类型：
 *      char：2
 * 布尔类型：
 *      boolean：1
 *
 * @Created by 湖南爱豆
 * @Date 2020/5/21 14 37
 * @Author: 邻座旅客
 */
public class DataType {

    /**
     * main函数中也可以引用其他被static关键字修饰的静态方法
     * @param args
     */
    public static void main(String[] args) {
        // 调用该class下的integerType函数
        integerType();
        // 同上，以下同理
        floatType();

        booleanType();

        charType();
    }

    /**
     * 整型
     *
     * 对于整型类型，Java只定义了带符号的整型，因此，最高位的bit表示符号位（0表示正数，1表示负数）。各种整型能表示的最大范围如下：
     *
     * byte：-128 ~ 127
     * short: -32768 ~ 32767
     * int: -2147483648 ~ 2147483647
     * long: -9223372036854775808 ~ 9223372036854775807
     */
    public static void integerType() {
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512
        long l = 9000000000000000000L; // long型的结尾需要加L，也可加小写l，但大写L更便于识别，不与数字1混淆

        // 特别注意：同一个数的不同进制的表示是完全相同的，例如15=0xf＝0b1111。
        int j1 = 15;
        int j2 = 0xf;
        int j3 = 0b1111;
        System.out.println(j1 == j2); // true
        System.out.println(j1 == j3); // true
    }

    /**
     * 浮点型
     *
     * 浮点类型的数就是小数，因为小数用科学计数法表示的时候，小数点是可以“浮动”的，如1234.5可以表示成12.345x100，也可以表示成123.45x10，所以称为浮点数。
     *
     * 对于float类型，需要加上f后缀。
     * 浮点数可表示的范围非常大，float类型可最大表示3.4x10^38，而double类型可最大表示1.79x10^308。
     *
     * 下面是定义浮点数的例子：
     */
    public static void floatType() {
        float f1 = 3.14f;
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
    }

    /**
     * 布尔类型
     *
     * 布尔类型boolean只有true和false两个值，布尔类型总是关系运算的计算结果：
     * Java语言对布尔类型的存储并没有做规定，因为理论上存储布尔类型只需要1 bit，但是由于内存对齐，通常JVM内部会把boolean表示为4字节整数。
     */
    public static void booleanType() {
        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 5 > 3; // 计算结果为true
        System.out.println("isGreater = " + isGreater);
        int age = 12;
        boolean isAdult = age >= 18; // 计算结果为false
        System.out.println("isAdult = " + isAdult);
    }

    /**
     * 字符类型
     * 字符类型char表示一个字符。Java的char类型除了可表示标准的ASCII外，还可以表示一个Unicode字符：
     */
    public static void charType() {
        char a = 'A';
        char zh = '中';
        System.out.println(a); // A
        System.out.println(zh); // 中
        // 注意char类型使用单引号'，且仅有一个字符，要和双引号"的字符串类型区分开。
    }

    /**
     * 引用类型
     *
     * 除了上述基本类型的变量，剩下的都是引用类型。例如，引用类型最常用的就是String字符串。
     * 引用类型的变量类似于C语言的指针，它内部存储一个“地址”，指向某个对象在内存的位置
     */
    public static void referenceType() {
        // s只是一个引用
        String s = "hello";
    }

    /**
     * 常量
     *
     * 定义变量的时候，如果加上final修饰符，这个变量就变成了常量
     *
     * 常量在定义时进行初始化后就不可再次赋值，再次赋值会导致编译错误。
     *
     * 常量的作用是用有意义的变量名来避免魔法值（Magic number），例如，不要在代码中到处写3.14，而是定义一个常量。如果将来需要提高计算精度，我们只需要在常量的定义处修改，例如，改成3.1416，而不必在所有地方替换3.14。
     *
     * 根据习惯，常量名通常全部大写。
     */
    public static void constant() {
        final double PI = 3.14; // PI是一个常量
        double r = 5.0;
        double area = PI * r * r;
//        PI = 300; // 编译异常
    }
}
