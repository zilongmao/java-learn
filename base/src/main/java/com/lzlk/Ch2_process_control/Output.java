package com.lzlk.Ch2_process_control;

/**
 * TODO: 输出
 *
 * @Created by 湖南爱豆
 * @Date 2020/5/23 16 50
 * @Author: 邻座旅客
 */
public class Output {

    public static void main(String[] args) {

        output();

        formatOutput();
    }

    /**
     * 普通输出
     * 在前面的代码中，我们总是使用System.out.println()来向屏幕输出一些内容。
     * println是print line的缩写，表示输出并换行。因此，如果输出后不想换行，可以用print()：
     */
    public static void output() {
        System.out.print("A,");
        System.out.print("B,");
        System.out.print("C.");
        System.out.println();
        System.out.println("END");
    }

    /**
     * 格式化输出
     *
     * 计算机表示的数据不一定适合人来阅读，所以Java提供了格式化输出的功能
     *
     * Java的格式化功能提供了多种占位符，可以把各种数据类型“格式化”成指定的字符串：
     *
     * 占位符	说明
     * %d	格式化输出整数
     * %x	格式化输出十六进制整数
     * %f	格式化输出浮点数
     * %e	格式化输出科学计数法表示的浮点数
     * %s	格式化字符串
     *
     * 注意，由于%表示占位符，因此，连续两个%%表示一个%字符本身。
     */
    public static void formatOutput() {
        double d = 12900000;
        System.out.println(d); // 1.29E7

        // 如果要把数据显示成我们期望的格式，就需要使用格式化输出的功能。
        // 格式化输出使用System.out.printf()，通过使用占位符%?，printf()可以把后面的参数格式化成指定格式
        double db = 3.1415926;
        System.out.printf("%.2f\n", db); // 显示两位小数3.14
        System.out.printf("%.4f\n", db); // 显示4位小数3.1416

        // 占位符本身还可以有更详细的格式化参数。下面的例子把一个整数格式化成十六进制，并用0补足8位
        int n = 12345000;
        System.out.printf("n=%d, hex=%08x", n, n); // 注意，两个%占位符必须传入两个数
    }
}
