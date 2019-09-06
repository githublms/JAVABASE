package com.example.demo;

/*
 * 数组中的常见异常：
 * 1. 数组角标越界的异常：ArrayIndexOutOfBoundsExcetion
 *
 * 2. 空指针异常：NullPointerException
 */
public class ArrayException {


    public static void main(String[] args) {

        int[] ints = new int[]{12,15,16,18,79,85,96,34,75};
        //1. 数组角标越界的异常：ArrayIndexOutOfBoundsExcetion
//        System.out.println(ints[15]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 15
//        System.out.println(ints[-2]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -2

        //2.2. 空指针异常：NullPointerException
        // 情况一
        int[] arr = new int[]{1,2,3};
        arr = null;
//        System.out.println(arr[0]); //Exception in thread "main" java.lang.NullPointerException

        // 情况二
        int[][] arr2 = new int[3][];
//        System.out.println(arr2[2][0]);//Exception in thread "main" java.lang.NullPointerException

        //情况三
        String[] strings = new String[]{"aa","bb","cc"};
        strings[0] = null;
//        System.out.println(strings[0].toString()); //Exception in thread "main" java.lang.NullPointerException


    }




}
