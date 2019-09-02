package com.example.demo;


import java.util.Scanner;

/**
 * 从键盘上输入 年 月 日， 通过程序来判断输入的数据是这一年的 第多少天
 * 判断 闰年的标准
 *      可以被4整除。但是不能被100整除
 *      或者
 *      可以被400整除
 *
 *  switch-case 可以用if-else 来代替，反之不能
 *  在有限个的情况下，既可以使用switch-case 又可以使用if-elselse 的情况下，
 *  建议使用 switch -case ，这个效率稍高
 *
 */

public class SwitchExer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = scanner.nextInt();
        System.out.println("请输入月份:");
        int month = scanner.nextInt();
        System.out.println("请输入日期:");
        int day = scanner.nextInt();

        int sumDay = 0;
        switch (month) {
            case 12:
                sumDay += 30;
            case 11:
                sumDay += 31;
            case 10:
                sumDay += 30;
            case 9:
                sumDay += 31;
            case 8:
                sumDay += 31;
            case 7:
                sumDay += 30;
            case 6:
                sumDay += 31;
            case 5:
                sumDay += 30;
            case 4:
                sumDay += 31;
            case 3:
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    sumDay += 29;
                } else {
                    sumDay += 28;
                }
            case 2:
                sumDay += 31;
            case 1:
                sumDay += day;

        }
        System.out.println( year + "年的" + month + "月份的" +day+ "号是今年的第" + sumDay  + "天" );
    }




}











