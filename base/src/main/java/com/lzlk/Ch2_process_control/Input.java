package com.lzlk.Ch2_process_control;

import java.util.Scanner;

/**
 * TODO: 输入
 *
 * @Created by 湖南爱豆
 * @Date 2020/5/23 17 11
 * @Author: 邻座旅客
 */
public class Input {

    public static void main(String[] args) {

        /**
         * 和输出相比，Java的输入就要复杂得多。
         * 首先，我们通过import语句导入java.util.Scanner，import是导入某个类的语句，
         * 必须放到Java源代码的开头，后面我们在Java的package中会详细讲解如何使用import。
         *
         * 然后，创建Scanner对象并传入System.in。System.out代表标准输出流，而System.in代表标准输入流。
         * 直接使用System.in读取用户输入虽然是可以的，但需要更复杂的代码，而通过Scanner就可以简化后续的代码。
         *
         * 有了Scanner对象后，要读取用户输入的字符串，使用scanner.nextLine()，要读取用户输入的整数，
         * 使用scanner.nextInt()。Scanner会自动转换数据类型，因此不必手动转换。
         */
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
    }
}
