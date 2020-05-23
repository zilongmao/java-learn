package com.lzlk.Ch1_java_base;

/**
 * TODO: 布尔值运算
 *
 * 对于布尔类型boolean，永远只有true和false两个值。
 *
 * 布尔运算是一种关系运算，包括以下几类：
 *      比较运算符：>，>=，<，<=，==，!=
 *      与运算 &&
 *      或运算 ||
 *      非运算 !
 *
 * 关系运算符的优先级从高到低依次是：
 *      !
 *      >，>=，<，<=
 *      ==，!=
 *      &&
 *      ||
 *
 * @Created by 湖南爱豆
 * @Date 2020/5/21 17 37
 * @Author: 邻座旅客
 */
public class OperationBoolean {

    public static void main(String[] args) {
        boolean isGreater = 5 > 3; // true
        int age = 12;
        boolean isZero = age == 0; // false
        boolean isNonZero = !isZero; // true
        boolean isAdult = age >= 18; // false
        boolean isTeenager = age >6 && age <18; // true

        // 短路运算
        // 布尔运算的一个重要特点是短路运算。如果一个布尔运算的表达式能提前确定结果，则后续的计算不再执行，直接返回结果。
        // 因为false && x的结果总是false，无论x是true还是false，因此，与运算在确定第一个值为false后，不再继续计算，而是直接返回false。
        boolean b = 5 < 3;
        boolean result = b && (5 / 0 > 0);
        System.out.println("result = " + result); // false
        // 如果没有短路运算，&&后面的表达式会由于除数为0而报错，但实际上该语句并未报错，原因在于与运算是短路运算符，提前计算出了结果false。
        // 如果变量b的值为true，则表达式变为true && (5 / 0 > 0)。因为无法进行短路运算，该表达式必定会由于除数为0而报错，可以自行测试。

        // 类似的，对于||运算，只要能确定第一个值为true，后续计算也不再进行，而是直接返回true：
        boolean nothing = true || (5 / 0 > 0);
        System.out.println("nothing = " + nothing); // true


        // 三元运算符
        // Java还提供一个三元运算符b ? x : y，它根据第一个布尔表达式的结果，分别返回后续两个表达式之一的计算结果。示例：
        int n = -100;
        int x = n >= 0 ? n : -n;
        System.out.println("x = " + x); // 100
        // 上述语句的意思是，判断n >= 0是否成立，如果为true，则返回n，否则返回-n，负负得正即为100。这实际上是一个求绝对值的表达式。

        // 三元运算b ? x : y会首先计算b，如果b为true，则只计算x，否则，只计算y。此外，x和y的类型必须相同，因为返回值不是boolean，而是x和y之一。

        // 三元运算b ? x : y后面的类型必须相同，三元运算也是“短路运算”，只计算x或y。
    }
}
