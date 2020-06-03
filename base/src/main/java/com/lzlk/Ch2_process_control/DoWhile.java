package com.lzlk.Ch2_process_control;

/**
 * TODO: do while循环的使用
 *
 * 在Java中，while循环是先判断循环条件，再执行循环。而另一种do while循环则是先执行循环，再判断条件，条件满足时继续循环，条件不满足时退出。它的用法是：
 *
 * do {
 *     执行循环语句
 * } while (条件表达式);
 *
 * 可见，do while循环会至少循环一次。
 *
 * @Created by 湖南爱豆
 * @Date 2020/6/3 16 50
 * @Author: 邻座旅客
 */
public class DoWhile {
    public static void main(String[] args) {
        // 我们把对1到100的求和用do while循环改写一下：
        int sum = 0;
        int n = 1;
        do {
            sum = sum + n;
            n ++;
        } while (n <= 100);
        System.out.println(sum);

        // 使用do while循环计算从x到y的和。
        sum = 0;
        int x = 20;
        int y = 100;
        do {
            sum = sum + x;
            x++;
        } while (x <= y);
        System.out.println(sum);
    }
}
