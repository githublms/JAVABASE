package com.example.exer;

import java.util.Arrays;

/*
 * 使用简单数组
 * 拓展：修改题目，实现array2对array1数组的复制
 */
public class ArrayExerTest3 {

    public static void main(String[] args) {

        int[] array1 = new int[]{2,3,5,7,11,13,17,19};
        int[] array2  = new int[array1.length];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }

        System.out.println(Arrays.toString(array2));


    }



}
