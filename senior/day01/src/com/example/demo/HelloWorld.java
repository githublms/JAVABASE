package com.example.demo;

/** 运行结果
 123
 123
 helloworld! main
 args=[Ljava.lang.String;@4554617c
 num=10
 */
public class HelloWorld {

    static int num = 10 ;
    public static final int NUMBER = 1; // 不要使用搜狗输入法，然后选中要修改的变量 ctrl + shift + y ，大小写相互转换

    public static void main(String[] args) {
        System.out.println(123);
        System.out.println(123);
        System.out.println("helloworld! main");
        System.out.println("args=" + args);
        System.out.println("num=" + num);

    }
}
