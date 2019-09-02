package com.example.demo;


import java.util.Arrays;
import java.util.Scanner;

/*
 * 2. 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
		成绩>=最高分-10    等级为’A’
		成绩>=最高分-20    等级为’B’
		成绩>=最高分-30    等级为’C’
		其余                               等级为’D’

		提示：先读入学生人数，根据人数创建int数组，存放学生成绩。

 *
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的个数:");
        int number = scanner.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("请输入第" + i + "个学生的成绩:");
            int score = scanner.nextInt();
            arr[i] = score;
        }
        Arrays.sort(arr);
        System.out.println("最高分是:" +arr[arr.length-1]);

        for (int i = 0; i < arr.length; i++) {
          //这里 使用if-else，不能使用switch-case,这里说的是范围
        }

    }

}




