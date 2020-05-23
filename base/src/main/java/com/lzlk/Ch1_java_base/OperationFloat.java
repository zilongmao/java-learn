package com.lzlk.Ch1_java_base;

/**
 * TODO: 浮点数运算
 *
 * 浮点数运算和整数运算相比，只能进行加减乘除这些数值计算，不能做位运算和移位运算。
 *
 * 浮点数常常无法精确表示，并且浮点数的运算结果可能有误差；
 *
 * 比较两个浮点数通常比较它们的绝对值之差是否小于一个特定值；
 *
 * 整型和浮点型运算时，整型会自动提升为浮点型；
 *
 * 可以将浮点型强制转为整型，但超出范围后将始终返回整型的最大值。
 *
 * @Created by 湖南爱豆
 * @Date 2020/5/21 17 24
 * @Author: 邻座旅客
 */
public class OperationFloat {

    public static void main(String[] args) {
        calculationError();

        typeConvert();

        overflow();
    }

    /**
     * 运算误差
     *
     * 在计算机中，浮点数虽然表示的范围大，但是，浮点数有个非常重要的特点，就是浮点数常常无法精确表示。
     *
     *  举个栗子：
     *  浮点数0.1在计算机中就无法精确表示，因为十进制的0.1换算成二进制是一个无限循环小数。
     *  很显然，无论使用float还是double，都只能存储一个0.1的近似值。但是，0.5这个浮点数又可以精确地表示。
     */
    public static void calculationError() {
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        System.out.println("x = " + x); // 0.1
        System.out.println("y = " + y); // 0.09999999999999998

        // 由于浮点数存在运算误差，所以比较两个浮点数是否相等常常会出现错误的结果。
        // 正确的比较方法是判断两个浮点数之差的绝对值是否小于一个很小的数：
        double r = Math.abs(x - y);
        // 再判断绝对值是否足够小:
        if (r < 0.00001) {
            System.out.println("可以认为相等");
        } else {
            System.out.println("不相等");
        }
    }

    /**
     * 浮点数的类型转换
     */
    public static void typeConvert() {
        // 如果参与运算的两个数其中一个是整型，那么整型可以自动提升到浮点型：
        int n = 5;
        double d = 1.2 + 24.0 / n;
        System.out.println("d = " + d); // 6.0

        // 需要特别注意，在一个复杂的四则运算中，两个整数的运算不会出现自动提升的情况。例如：
        double x = 1.2 + 24 / 5; // 5.2
        // 计算结果为5.2，原因是编译器计算24 / 5这个子表达式时，按两个整数进行运算，结果仍为整数4。

        // 强转
        // 可以将浮点数强制转型为整数。在转型时，浮点数的小数部分会被丢掉。如果转型后超过了整型能表示的最大范围，将返回整型的最大值。例如：
        int n1 = (int) 12.3; // 12
        int n2 = (int) 12.7; // 12
        int n3 = (int) -12.7; // -12
        int n4 = (int) (12.7 + 0.5); // 13
        int n5 = (int) 1.2e20; // 2147483647
        // 如果要进行四舍五入，可以对浮点数加上0.5再强制转型：
        double dx = 2.6;
        int nx = (int) (dx + 0.5);
        System.out.println("nx = " + nx); // 3
    }

    /**
     * 浮点数的溢出
     *
     * 整数运算在除数为0时会报错，而浮点数运算在除数为0时，不会报错，但会返回几个特殊值：
     *
     * NaN表示Not a Number
     * Infinity表示无穷大
     * -Infinity表示负无穷大
     */
    public static void overflow() {
        double d1 = 0.0 / 0;
        System.out.println("d1 = " + d1); // NaN
        double d2 = 1.0 / 0;
        System.out.println("d2 = " + d2); // Infinity
        double d3 = -1.0 / 0;
        System.out.println("d3 = " + d3); // -Infinity
    }

}
