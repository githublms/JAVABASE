package com.example.demo;
/*
编写程序：从键盘上输入2019年的“month”和“day”，要求通过程序输出输入的日期为2019年的第几天。

2  15:  31 + 15

5 7: 31 + 28 + 31 + 30 + 7
....

说明:break在switch-case中是可选的
*/


import java.util.Scanner;

public class SwitchTest2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入2019年的月份:");
        int month = scanner.nextInt();
        System.out.println("请输入2019年的日期:");
        int day = scanner.nextInt();

        /**
         * 方式一：逐渐累加，不推荐 这种方式太过冗余，不推荐|
         */
      /*  switch (month){
            case 1:
                System.out.println("2019年的"+ month + "月的" + day + "号，是2019年的第" + day + "天");
                break;
            case 2:
                System.out.println("2019年的"+ month + "月的" + day + "号，是2019年的第" + (31 + day) + "天");
                break;
            case 3:
                System.out.println("2019年的"+ month + "月的" + day + "号，是2019年的第" + (31 + 28+  day) + "天");
                break;
            case 4:
                System.out.println("2019年的"+ month + "月的" + day + "号，是2019年的第" + (31 +  28 + 30 + day)+ "天");
                break;
            case 5:
                System.out.println("2019年的"+ month + "月的" + day + "号，是2019年的第" + (31 +  28 + 30 + 31 + day) + "天");
                break;*/

            //方式二：采用倒序的方式进行天数的累计，这样可以快速的计算这是今年的某一天
            int sumDays = 0;
            switch(month){
                case 12:
                    sumDays += 30;
                case 11:
                    sumDays += 31;
                case 10:
                    sumDays += 30;
                case 9:
                    sumDays += 31;
                case 8:
                    sumDays += 31;
                case 7:
                    sumDays += 30;
                case 6:
                    sumDays += 31;
                case 5:
                    sumDays += 30;
                case 4:
                    sumDays += 31;
                case 3:
                    switch (2020 % 4){
                        case 0:
                            sumDays += 29;
                            break;
                            default:
                                sumDays +=28;
                    }
                case 2:
                    sumDays += 31;
                case 1:
                    sumDays += day;
            }
        System.out.println("2019年的"+ month + "月" + day + "号，是2019年的第" + sumDays+ "天");
    }
}
