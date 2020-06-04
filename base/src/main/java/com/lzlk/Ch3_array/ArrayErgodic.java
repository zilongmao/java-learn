package com.lzlk.Ch3_array;

import java.util.Arrays;

/**
 * TODO: 我们在Java程序基础里介绍了数组这种数据类型。有了数组，我们还需要来操作它。而数组最常见的一个操作就是遍历。
 *
 * @Created by 湖南爱豆
 * @Date 2020/6/4 11 16
 * @Author: 邻座旅客
 */
public class ArrayErgodic {

    public static void main(String[] args) {
        int[] ns = {1, 4, 9, 16, 25};
        // 直接打印数组变量，得到的是数组在JVM中的引用地址
        System.out.println(ns); // 诸如 [I@4554617c 类的数据

        // 通过for循环就可以遍历数组。因为数组的每个元素都可以通过索引来访问，因此，使用标准的for循环可以完成一个数组的遍历
        for (int i = 0; i < ns.length; i++) {
            int n = ns[i];
            System.out.print(n + ",");
        }
        // 为了实现for循环遍历，初始条件为i=0，因为数组的索引总是从0开始。
        // 继续循环的条件为i<ns.length，因为当i=ns.length时，i已经超出了索引范围（索引范围是0 ~ ns.length-1），每次循环后，i++。

        // 第二种方式是使用for each循环，直接迭代数组的每个元素
        for (int n : ns) {
            System.out.println(n);
        }
        // 注意：在for (int n : ns)循环中，变量n直接拿到ns数组的元素，而不是索引。

        // 显然for each循环更加简洁。但是，for each循环无法拿到数组的索引，因此，到底用哪一种for循环，取决于我们的需要。

        // 使用for each循环打印也很麻烦。幸好Java标准库提供了Arrays.toString()，可以快速打印数组内容
        System.out.println(Arrays.toString(ns));

        // 按照倒序遍历并打印每个元素
        for (int i = ns.length - 1; i >= 0; i--) {
            int n = ns[i];
            System.out.print(n + ",");
        }
    }
}
