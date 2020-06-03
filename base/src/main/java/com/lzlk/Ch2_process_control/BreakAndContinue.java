package com.lzlk.Ch2_process_control;

/**
 * TODO: break 和 continue关键字的使用
 *
 * 无论是while循环还是for循环，有两个特别的语句可以使用，就是break语句和continue语句。
 *
 * break语句可以跳出当前循环；
 *
 * break语句通常配合if，在满足条件时提前结束整个循环；
 *
 * break语句总是跳出最近的一层循环；
 *
 * continue语句可以提前结束本次循环；
 *
 * continue语句通常配合if，在满足条件时提前结束本次循环。
 *
 * @Created by 湖南爱豆
 * @Date 2020/6/3 17 08
 * @Author: 邻座旅客
 */
public class BreakAndContinue {

    public static void main(String[] args) {
        useBreak();
    }

    /**
     * break的使用
     *
     * 在循环过程中，可以使用break语句跳出当前循环。
     */
    private static void useBreak() {
        int sum = 0;
        for (int i=1; ; i++) {
            sum = sum + i;
            if (i == 100) {
                break;
            }
        }
        System.out.println(sum);
        // 使用for循环计算从1到100时，我们并没有在for()中设置循环退出的检测条件。
        // 但是，在循环内部，我们用if判断，如果i==100，就通过break退出循环。

        // 因此，break语句通常都是配合if语句使用。要特别注意，break语句总是跳出自己所在的那一层循环。例如：
        for (int i=1; i<=10; i++) {
            System.out.println("i = " + i);
            for (int j=1; j<=10; j++) {
                System.out.println("j = " + j);
                if (j >= i) {
                    break;
                }
            }
            // break跳到这里
            System.out.println("breaked");
        }
        // 上面的代码是两个for循环嵌套。因为break语句位于内层的for循环，因此，它会跳出内层for循环，但不会跳出外层for循环。
    }

    /**
     * continue的使用
     * break会跳出当前循环，也就是整个循环都不会执行了。而continue则是提前结束本次循环，直接继续执行下次循环。
     */
    private static void useContinue() {
        int sum = 0;
        for (int i=1; i<=10; i++) {
            System.out.println("begin i = " + i);
            if (i % 2 == 0) {
                continue; // continue语句会结束本次循环
            }
            sum = sum + i;
            System.out.println("end i = " + i);
        }
        System.out.println(sum); // 25
        // 注意观察continue语句的效果。当i为奇数时，完整地执行了整个循环，因此，会打印begin i=1和end i=1。
        // 在i为偶数时，continue语句会提前结束本次循环，因此，会打印begin i=2但不会打印end i = 2。
        // 在多层嵌套的循环中，continue语句同样是结束本次自己所在的循环。
    }
}
