package com.lzlk.Ch3_array;


import java.util.Arrays;

/**
 * TODO: 对数组进行排序是程序中非常基本的需求。常用的排序算法有冒泡排序、插入排序和快速排序等。
 *
 * @Created by 湖南爱豆
 * @Date 2020/6/4 12 02
 * @Author: 邻座旅客
 */
public class ArraySort {

    public static void main(String[] args) {
        int[] arr = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        bubbleSort(arr);
        selectSort(arr);
        insertSort(arr);
    }

    /**
     * 冒泡排序
     *
     * 冒泡排序的原理其实就是每次大循环都把数值最大的一位往最后面放，同理，数值较小的元素就会慢慢往前面移动
     * 如同往一池水中扔入了一块石头，冒出了很多泡泡。
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        System.out.println("------ 冒泡排序 start ------");
        int[] bubbleArr = Arrays.copyOf(arr, arr.length);
        // 外循环只是循环几次
        for (int i = bubbleArr.length - 1; i > 1; i--) {
            // 内循环每循环一次就会把最大的一位往后位移
            System.out.println("第" + (bubbleArr.length - i) + "次循环");
            for (int j = 0; j < i; j++) {
                // 如果第一个比第二大，那就换位子
                if (bubbleArr[j] > bubbleArr[j + 1]) {
                    int temp = bubbleArr[j];
                    bubbleArr[j] = bubbleArr[j + 1];
                    bubbleArr[j + 1] = temp;
                }
                // 这个循环只用于打印
                for (int k = 0; k < bubbleArr.length; k++) {
                    System.out.print(bubbleArr[k] + " , ");
                }
                System.out.println();
            }
        }
        System.out.println("------ 冒泡排序 end ------");
    }

    /**
     * 选择排序
     * @param arr
     */
    public static void selectSort(int[] arr) {
        System.out.println("------ 选择排序 start ------");
        int[] selectArr = Arrays.copyOf(arr, arr.length);
        int min;
        for (int i = 0; i < selectArr.length - 1; i++) {
            min = i;
            // 内循环每循环一次就会把最小的一位往前位移
            System.out.println("第" + (i + 1) + "次循环");
            for (int j = i + 1; j < selectArr.length; j++) {
                // 如果后面的数中，有小于第一项（下标0）的，就调换下标
                if (selectArr[j] < selectArr[min]) {
                    min = j;
                }
            }
            int temp = selectArr[i];
            selectArr[i] = selectArr[min];
            selectArr[min] = temp;
            for (int k = 0; k < selectArr.length; k++) {
                System.out.print(selectArr[k] + " , ");
            }
            System.out.println();
        }
        System.out.println("------ 选择排序 end ------");
    }

    /**
     * 插入排序
     * @param arr
     */
    public static void insertSort(int[] arr) {
        System.out.println("------ 插入排序 start ------");
        int[] insertArr = Arrays.copyOf(arr, arr.length);
        int inner, outer;
        for (outer = 1; outer < insertArr.length; outer++) {
            int temp = insertArr[outer]; // 把第二项暂存
            inner = outer;
            // (第一项>第二项)
            while (inner > 0 && insertArr[inner - 1] > temp) {
                insertArr[inner] = insertArr[inner - 1];
                inner--;
            }
            insertArr[inner] = temp;
            for (int k = 0; k < insertArr.length; k++) {
                System.out.print(insertArr[k] + " , ");
            }
            System.out.println();
        }
        System.out.println("------ 插入排序 end ------");
    }
}
