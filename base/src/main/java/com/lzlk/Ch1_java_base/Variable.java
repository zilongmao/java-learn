package com.lzlk.Ch1_java_base;

/**
 * TODO: 变量
 *
 * Q：什么是变量？ A：变量就是一个可以变的量。
 * 在Java中，变量分为两种：基本类型的变量和引用类型的变量。
 *
 * 本章节先讨论基本类型的变量。
 *
 * 在Java中，变量必须先定义后使用，在定义变量的时候，可以给它一个初始值。例如：
 * int i = 1;
 *
 * 上述语句定义了一个整型int类型的变量，名称为i，初始值为1。
 *
 * 不写初始值，就相当于给它指定了默认值。默认值总是0。
 *
 * @Created by 湖南爱豆
 * @Date 2020/5/21 14 26
 * @Author: 邻座旅客
 */
public class Variable {

    public static void main(String[] args) {
        // 定义int类型变量x，并赋予初始值100
        int x = 100;
        // 打印该变量的值
        System.out.println(x); // 100


        // 变量的一个重要特点是可以重新赋值。例如，对变量y，先赋值100，再赋值200，观察两次打印的结果：
        int y = 100;
        System.out.println("y = " + y); // 100
        // 给y赋值为200
        y = 200;
        System.out.println("y = " + y); // 200


        // 变量不但可以重新赋值，还可以赋值给其他变量。让我们来看一个例子：
        int i = 10;
        System.out.println("i = " + i); // 10
        int j = i;
        System.out.println("j = " + j); // 10
    }
}
