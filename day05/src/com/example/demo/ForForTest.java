package com.example.demo;

import javax.sound.midi.Soundbank;

/**
 *  嵌套循环，将一个循环结构A放到另外一个循环结构B中，就构成了嵌套循环
 *  内层循环：A
 *  外层循环：B
 *
 *  说明：
 *      内层循环执行一遍，相当于外层循环执行一次
 *      内层循环执行 m 次，外层循环执行 n 次，那么，这个循环结构总共需要执行 m * n 次
 *
 *  技巧：
 *      外层循环控制 行数 ，内层循环控制 列数
 *
 */
public class ForForTest {

    public static void main(String[] args) {

        System.out.println("-------------");
        for (int i = 0; i <6 ; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.println("-------------");

        /*
         ******
         ******
         ******
         ******
         */
        for (int i = 0; i < 4; i++) {
            System.out.println("******");
        }

        System.out.println("++++++++");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("[[[[[[[[[[[[[[[[[[[[");
        /*			i(行号)		j(*的个数)
         *			1			1
         **			2			2
         ***		3			3
         ****		4			4
         *****		5			5
         */
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("===================");
        
        /*			i(行号)		j(*的个数)   规律：i + j = 5 换句话说：j = 5 - i;
         ****		1			4
         ***			2			3
         **			3			2
         *			4			1
         */

        for (int i = 5; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("==========++++++=========");
        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
         */

        for (int i = 1; i <= 9; i++) {
            if (i <= 5){
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
            }else{
                for (int j = 9-i; j >= 0; j--) {
                    System.out.print(" * ");
                }
            }
            System.out.println();

        }

        System.out.println("22222222");
        /*

            *
           * *
          * * *
         * * * *
        * * * * *
         * * * *
          * * *
           * *
            *

        */
        // 上半部分
        for (int i = 0; i < 5; i++) {
            // 输出“-”
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }

            // 输出“* ”
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 下半部分
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 4 - i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }


}
