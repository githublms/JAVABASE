package com.example.demo;

import java.util.Scanner;

/*
题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
比如：12和20的最大公约数是4，最小公倍数是60。

说明：break关键字的使用：一旦在循环中执行到break，就跳出循环

*/
public class ForTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个正整数:");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个正整数:");
        int num2 = scanner.nextInt();

        //求最大公约数
        int min = (num1 < num2 ) ? num1 : num2;
        for ( ; min >= 1; min--) {
            if ((num1 % min == 0) && (num2 % min == 0) ){
                System.out.println(num1 + "," + num2 + "的最大公约数是:"  + min );
                break;
            }
        }

        //求最小公倍数
        int max  = (num1 > num2) ? num1 : num2 ;
        for ( ;max > 0; max++){
            if ((max % num1 == 0) && (max % num2 == 0)){
                System.out.println(num1 + "," + num2 + "的最小公倍数是:"  + max );
                break;
            }
        }


    }







}
