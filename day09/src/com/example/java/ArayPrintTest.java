package com.example.java;

/**
 *
 */
public class ArayPrintTest {


    /**
     * 为什么两个输出的结果不一样呢？ 一个是地址值，一个是字符串
     * 原因是 println的重载方法中调用的print 和 newLine ，其中print 的重载方法中也不一样
     * 因此输出的结果不一样
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println(arr); // [I@4554617c

        char[] arr2 = new char[]{'A','B','C','D','E'};
        System.out.println(arr2);//ABCDE



    }

}
