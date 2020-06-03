package com.lzlk.Ch2_process_control;

/**
 * TODO: If流程控制
 *
 * 在Java程序中，如果要根据条件来决定是否执行某一段代码，就需要if语句。
 *
 * if语句的基本语法是：
 *
 * if (条件) {
 *     // 条件满足时执行
 * }
 *
 * 根据if的计算结果（true还是false），JVM决定是否执行if语句块（即花括号{}包含的所有语句）。
 *
 * @Created by 湖南爱豆
 * @Date 2020/5/23 17 43
 * @Author: 邻座旅客
 */
public class If {

    public static void main(String[] args) {
        int age = 20;
        // 当条件age >= 18计算结果为true时，if语句块被执行，将打印"成年了"，否则，if语句块将被跳过。
        if (age >= 18) {
            System.out.println("成年了");
            // if代码块中也可包含多条语句
            System.out.println("可以去大保健了");
        }

        // 当if语句块只有一行语句时，可以省略花括号{}。但实际开发中，由于容易混淆其他语句的花括号{}，不建议使用该语法
        if (age == 0)
            System.out.println("刚出生");
        if (age == 70)
            System.out.println("老人家您好");
            System.out.println("老人家请坐"); // 若进入了if判断，实际只有"老人家您好"会被执行，"老人家请坐"实际上身处if代码块之外

        // if语句还可以编写一个else { ... }，当条件判断为false时，将执行else的语句块：
        if (age >= 90) {
            System.out.println("福如东海、寿比南山");
        } else {
            // 若age < 90，else中的代码块将被执行
            System.out.println("打扰了");
        }

        // 还可以用多个if ... else if ...串联。但在串联使用多个if时，要特别注意判断顺序
        if (age < 18) {
            System.out.println("未成年");
        } else if (age < 30) {
            System.out.println("青壮年");
        } else if (age < 45) {
            System.out.println("中年危机");
        } else {
            System.out.println("老啦");
        }
        // 执行发现，age = 29，满足条件age < 30，但输出的不是"中年危机"，而是"青壮年"，
        // 原因是if语句从上到下执行时，先判断age < 30成功后，后续else不再执行，因此，if (age < 45)没有机会执行了。
        System.out.println("END");

        // 前面讲过了浮点数在计算机中常常无法精确表示，并且计算可能出现误差，因此，判断浮点数相等用==判断不靠谱：
        double x = 1 - 9.0 / 10;
        boolean flag = x == 0.1;
        System.out.println("flag = " + flag); // flag = false
        // 正确的方法是利用差值小于某个临界值来判断：
        flag = Math.abs(x - 0.1) < 0.00001;
        System.out.println("flag = " + flag); // flag = true



        // 引用类型
        // 在Java中，判断值类型的变量是否相等，可以使用==运算符。
        // 但是，判断引用类型的变量是否相等，==表示“引用是否相等”，或者说，是否指向同一个对象。
        // 例如，下面的两个String类型，它们的内容是相同的，但是，分别指向不同的对象，用==判断，结果为false：

        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1); // hello
        System.out.println(s2); // hello
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2"); // 打印
        }

        // 要判断引用类型的变量内容是否相等，必须使用equals()方法：
        if (s1.equals(s2)) {
            System.out.println("s1 equals s2"); // 打印
        } else {
            System.out.println("s1 not equals s2");
        }
        // 注意：执行语句s1.equals(s2)时，如果变量s1为null，会报NullPointerException。
        // 因为equals是Object的方法，null无法使用equals
        // 要避免NullPointerException错误，可以利用短路运算符&&：
        s1 = null;
        if (s1 != null && s1.equals("hello")) {
            System.out.println("hello");
        } else {
            System.out.println("nothing"); // 打印
        }
    }
}
