package com.example.demo;

import java.util.Arrays;
import java.util.Scanner;

/*
编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，
对它们进行排序(使用 if-else if-else),并且从小到大输出。

说明：
1. if-else结构是可以相互嵌套的。
2. 如果if-else结构中的执行语句只有一行时，对应的一对{}可以省略的。但是，不建议大家省略。
*/
public class IfTest2 {

    public static void main(String[] args) {

        Integer[] arr = new Integer[3];

        System.out.println("请输入第一个整数:");
        Scanner scanner = new Scanner(System.in);
        int num1 = arr[0] = scanner.nextInt();


        System.out.println("请输入第二个整数");
        int num2 =  arr[1] = scanner.nextInt();

        System.out.println("请输入第三个整数");
        int num3 = arr[2] = scanner.nextInt();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        if (num1 > num2 ){
            if (num2 > num3){
                System.out.println("大小顺序是:" + num1 + "," +  num2  + ","+ num3);
            }else if (num1 > num3){
                System.out.println("大小顺序是:" + num1 + "," +  num3  + ","+ num2);
            }else{
                System.out.println("大小顺序是:" + num3 + "," +  num1  + ","+ num2);
            }
        }else{
            //另外一种不用写了
        }





    }


}
