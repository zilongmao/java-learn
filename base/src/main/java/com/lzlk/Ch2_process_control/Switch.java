package com.lzlk.Ch2_process_control;

/**
 * TODO: Switch多重选择
 *
 * 除了if语句外，还有一种条件判断，是根据某个表达式的结果，分别去执行不同的分支。
 *
 * @Created by 湖南爱豆
 * @Date 2020/6/3 14 59
 * @Author: 邻座旅客
 */
public class Switch {

    public static void main(String[] args) {

        int option = 1;
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
        }

        // 修改option的值分别为1、2、3，观察执行结果。
        // 如果option的值没有匹配到任何case，例如option = 99，那么，switch语句不会执行任何语句。
        // 这时，可以给switch语句加一个default，当没有匹配到任何case时，执行default：

        switch (option) {
            case 1:
                System.out.println("Selected 1");
            default:
                System.out.println("nothing");
                break;
        }

        // 如果把switch语句翻译成if语句，那么上述的代码相当于：
        //if (option == 1) {
        //    System.out.println("Selected 1");
        //} else if (option == 2) {
        //    System.out.println("Selected 2");
        //} else if (option == 3) {
        //    System.out.println("Selected 3");
        //} else {
        //    System.out.println("Not selected");
        //}

        // 对于多个==判断的情况，使用switch结构更加清晰。
        // 同时注意，上述“翻译”只有在switch语句中对每个case正确编写了break语句才能对应得上。
        // 使用switch时，注意case语句并没有花括号{}，而且，case语句具有“穿透性”，漏写break将导致意想不到的结果：

        int age = 2;
        switch (age) {
            case 1:
                System.out.println("Selected 1");
            case 2:
                System.out.println("Selected 2");
            case 3:
                System.out.println("Selected 3");
            default:
                System.out.println("Not selected");
        }

        // 当age = 2时，将依次输出"Selected 2"、"Selected 3"、"Not selected"。
        // 原因是从匹配到case 2开始，后续语句将全部执行，直到遇到break语句。因此，任何时候都不要忘记写break。

        // 在JDK1.7后，switch语句还可以匹配字符串。字符串匹配时，是比较“内容相等”。例如：
        String fruit = "apple";
        switch (fruit) {
            case "apple":
                System.out.println("Selected apple");
                break;
            case "pear":
                System.out.println("Selected pear");
                break;
            case "mango":
                System.out.println("Selected mango");
                break;
            default:
                System.out.println("No fruit selected");
                break;
        }

        // switch语句还可以使用枚举类型，枚举类型我们在后面讲解。
    }
}
