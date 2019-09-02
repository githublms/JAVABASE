package com.example.demo;

import java.util.Scanner;

/*
题目：
    从键盘上输入整数，统计正数和负数的个数，当输入的数据=0时，我们就终止程序

说明：
    1. 不在循环条件部分限制次数的结构：for(;;) 或 while(true)
    2. 结束循环的方式：
        1 循环体中返回false
        2 执行到break

*/
public class ForWhileTest {

    public static void main(String[] args) {

        int num1 = 0 ;//统计正数个数的变量
        int num2 = 0 ;//统计负数个数的变量
        System.out.println("请输入数据");
        Scanner scanner = new Scanner(System.in);
        for(;;){
            int input = scanner.nextInt();
            if (input > 0 ){
                num1++;
            }else if (input < 0 ) {
                num2++;
            }else{
                break;
            }
        }
        System.out.println("总共输入" + num1 + "个正数");
        System.out.println("总共输入" + num2 + "个负数");
    }

}
