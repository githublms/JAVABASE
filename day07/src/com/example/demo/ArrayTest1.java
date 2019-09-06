package com.example.demo;

import java.util.Arrays;
import java.util.SimpleTimeZone;

/*
 * 算法的考查：求数值型数组中元素的最大值、最小值、平均数、总和等
 *
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
 * 然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
 * 要求：所有随机数都是两位数。
 *
 * [10,99]
 * 公式：(int)(Math.random() * (99 - 10 + 1) + 10) //因为随机数是两位
 *
 */
public class ArrayTest1 {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (99-10 + 1)+10);
        }
//        System.err.println(Arrays.toString(arr));
        //遍历数组中的元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]  + "\t");
        }

        System.out.println("=============");

        //求数组元素的最大值 --->> 假设第一个数是最大的，然后循环这个数组，依次比较，如果有数据比预先的第一个大，那么就替换，依次，知道循环结束
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("数组中最大的数是:" + max);

        //求数组中最小的数
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("数组中最小的数是:" + min);

        //求数组元素的总和
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组元素的总和是:" + sum);

        //求数组元素的平均数
//        double avg = (sum + 0.0) / 10; //结果是61.1
        double avg = sum  / 10; //结果是61.0
        System.out.println("平均数是:" + avg);



    }





}









