package com.lzlk.Ch1_java_base;

/**
 * TODO: 用于在Java控制台打印文本的程序
 *
 * 类名：HelloWorld
 * 函数名：main
 * 访问修饰符：public  修饰类名：表示该class是公开的。
 * 返回值：void  表示该函数没有任何返回值
 *
 * 类名要求：
 *
 *     类名必须以英文字母开头，后接字母，数字和下划线的组合
 *     习惯以大写字母开头
 *     要注意遵守命名习惯
 *
 *     好的类命名：
 *          Hello
 *          NoteBook
 *          VRPlayer
 *     不好的类命名：
 *          hello
 *          Good123
 *          Note_Book
 *          _World
 *
 * 函数/方法名也有命名规则，命名和class一样，但是首字母小写：
 *
 * 好的方法命名：
 *          main
 *          goodMorning
 *          playVR
 *
 * 不好的方法命名：
 *          Main
 *          good123
 *          good_morning
 *           _playVR
 *
 * 新手可下载阿里巴巴代码规范插件，若写出了不规范命名，插件会有提醒与指正建议，非常方便。
 *
 * @Created by 湖南爱豆
 * @Date 2020/5/21 11 34
 * @Author: 邻座旅客
 */
public class HelloWorld {

    public static void main(String[] args) {
        // 向控制台输出文本:
        System.out.println("Hello, world!");

        // 单行注释

        /* 多行注释开始
        注释内容
        注释结束 */

        /** 文档注释开始
         *  注释内容
         注释结束 */
    }
}