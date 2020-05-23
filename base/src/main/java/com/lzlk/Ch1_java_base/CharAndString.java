package com.lzlk.Ch1_java_base;

/**
 * TODO: 在Java中，字符和字符串是两个不同的类型。
 *
 * 字符类型char是基本数据类型，它是character的缩写。一个char保存一个Unicode字符：
 *
 * @Created by 湖南爱豆
 * @Date 2020/5/21 17 44
 * @Author: 邻座旅客
 */
public class CharAndString {

    public static void main(String[] args) {

        charType();

        stringType();

        immutable();

        nullType();
    }

    /**
     * 字符类型
     *
     * Java在内存中总是使用Unicode表示字符，所以，一个英文字符和一个中文字符都用一个char类型表示，它们都占用两个字节。
     */
    public static void charType() {
        // 要显示一个字符的Unicode编码，只需将char类型直接赋值给int类型即可：
        int n1 = 'A'; // 字母“A”的Unicodde编码是65
        int n2 = '中'; // 汉字“中”的Unicode编码是20013

        // 还可以直接用转义字符反斜杠u+Unicode编码来表示一个字符：
        char c3 = '\u0041'; // 'A'，因为十六进制0041 = 十进制65
        char c4 = '\u4e2d'; // '中'，因为十六进制4e2d = 十进制20013
        System.out.println(n1 == c3); // true
        System.out.println(n2 == c4); // true
    }

    /**
     * 字符串类型
     *
     * 和char类型不同，字符串类型String是引用类型，我们用双引号"..."表示字符串。一个字符串可以存储0个到任意个字符：
     */
    public static void stringType() {
        String s = ""; // 空字符串，包含0个字符
        String s1 = "A"; // 包含一个字符
        String s2 = "ABC"; // 包含3个字符
        String s3 = "中文 ABC"; // 包含6个字符，其中有一个空格

        // 字符串使用双引号"..."表示开始和结束，那如果字符串本身恰好包含一个"字符怎么表示？例如，"abc"xyz"，编译器就无法判断中间的引号究竟是字符串的一部分还是表示字符串结束。这个时候，我们需要借助转义字符\：
        String s4 = "abc\"xyz";
        System.out.println(s4); // abc"xyz

        // 因为\是转义字符，所以，两个\\表示一个\字符：
        String s5 = "abc\\xyz";
        System.out.println(s5); // abc\xyz

        /*
         常见的转义字符包括：
         \" 表示字符"
         \' 表示字符'
         \\ 表示字符\
         \n 表示换行符
         \r 表示回车符
         \t 表示Tab
         反斜杠u#### 表示一个Unicode编码的字符
         */
        String s6 = "ABC\n\u4e2d\u6587"; // 包含6个字符: A, B, C, 换行符, 中, 文

        // Java的编译器对字符串做了特殊照顾，可以使用+连接任意字符串和其他数据类型
        String str1 = "Hello";
        String str2 = "world";
        String str = str1 + " " + str2 + "!";
        System.out.println(str); // Hello world!

        // 如果用+连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串，再连接
        int age = 25;
        String strAge = "age is " + age;
        System.out.println(strAge); // age is 25
    }

    /**
     * 不可变特性
     *
     * Java的字符串除了是一个引用类型外，还有个重要特点，就是字符串不可变。
     * 基本类型的变量是“持有”某个数值，引用类型的变量是“指向”某个对象。
     */
    public static void immutable() {
        String s = "hello";
        System.out.println(s); // 显示 hello
        s = "world";
        System.out.println(s); // 显示 world

        /**
         * 在上述代码中，字符串 s 是没有变过的，变的是变量s的“指向”。
         * 执行String s = "hello";时，JVM虚拟机先创建字符串"hello"，然后，把字符串变量s指向它：
         *       s
         *       │
         *       ▼
         * ┌───┬───────────┬───┐
         * │   │  "hello"  │   │
         * └───┴───────────┴───┘
         * 执行s = "world";时，JVM虚拟机先创建字符串"world"，然后，把字符串变量s指向它：
         *       s ──────────────┐
         *                       │
         *                       ▼
         * ┌───┬───────────┬───┬───────────┬───┐
         * │   │  "hello"  │   │  "world"  │   │
         * └───┴───────────┴───┴───────────┴───┘
         * 原来的字符串"hello"还在，只是我们无法通过变量s访问它而已。因此，字符串的不可变是指字符串内容不可变。
         */

        String v = "hello";
        String t = v;
        v = "world";
        System.out.println("t = " + t); // t是"hello"还是"world"?
    }

    /**
     * 空值 null
     *
     * 引用类型的变量可以指向一个空值null，它表示不存在，即该变量不指向任何对象。
     * 要注意区分空值null和空字符串""。
     */
    public static void nullType() {
        String s1 = null; // s1是null
        String s2; // 没有赋初值值，s2也是null
        String s3 = s1; // s3也是null
        String s4 = ""; // s4指向空字符串，不是null
        // 注意要区分空值null和空字符串""，空字符串是一个有效的字符串对象，它不等于null
        System.out.println(s1 == s3); // true
        System.out.println(s1 == s4); // false
    }
}
