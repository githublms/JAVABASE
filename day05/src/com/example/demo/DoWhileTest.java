package com.example.demo;

import javax.jnlp.DownloadService;

/**
 * do-while 循环结构
 *     1 初始化条件
 *     2 循环条件--》》返回布尔类型
 *     3 循环体
 *     4 迭代条件
 *   ①
 *  do {
 *      ③
 *      ④
 *  }while(②)
 *  执行顺序: 134234234
 *
 *  开发中使用for  和 while 更多一点，使用 do -while 比较少
 *  do-while 循环结构中至少会执行一次循环体
 *
 */
public class DoWhileTest {

    public static void main(String[] args) {

        //计算1-100 以内的偶数，并统计偶数的个数和所有偶数的和

        int num = 0;
        int count = 0 ;
        int i = 0;
        do{
            if (i % 2 == 0 ){
                System.out.println(i);
                num++;
                count += i;
            }
            i++;
        }while (i <= 100);
        System.out.println("所有偶数的个数是:" + num);
        System.out.println("所有偶数的总和是:" + count);

        //*************体会do-while至少执行一次循环体***************
        int num1 = 10 ;
        while (num1 > 10){
            System.out.println("while");
        }

        int num2 = 10;
        do {
            System.out.println("do-while");
        }while (num2>10);



    }

}
