package com.example.demo;

import java.util.Arrays;

/*
 * 数组的冒泡排序的实现
 * 思想：两个相邻的元素相互进行比较，进行排序
 *
 *
 */
public class BubbleSortTest {

    public static void main(String[] args) {

        int[] arr = new int[]{12,15,16,18,79,85,96,34,75};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] < arr[j]){ // < 从小到大进行排序，反之亦然
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));





    }

}
