package com.example.demo;


/**
 * for 循环的使用
 * for 循环的四个要素:
 *  1:初始化条件
 *  2:循环条件 --》》 是一个boolean 类型的值
 *  3:循环体
 *  4:迭代体
 *      语法
 *      for(1;2;4){
 *          3
 *      }
 *
 *  执行顺序：1,2,3,4,2,3,4,2,3,4
 *
 */

public class ForTest {
    public static void main(String[] args) {

        /*System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");*/

        for (int i = 1; i <= 5; i++) { // 1,2,3,4,5
            System.out.println("hello");
        }
        //练习
        int num = 1;
        for (System.out.print('a'); num <= 3 ; System.out.print("c") ,num++) {
            System.out.print('b'); //输出结果: abcbcbc
        }
        System.out.println("**********");

        /**
         * 遍历100以内的整数，得到所有偶数的和，并统计所有的偶数个数
         */
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                sum += i ;
                count++;
            }
        }
        System.out.println("所有偶数的和:" + sum + ",所有偶数的个数是:" + count);


    }











}
