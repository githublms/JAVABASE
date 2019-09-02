package com.example.demo;

import org.junit.Test;

/**
 * 二维数组的使用:
 *      二维数组的元素分为  外层数组  的元素和  内层数组  的元素
 *      int[][] arr = new int[4][3];
 *      外层数组中的元素:arr[0],arr[1]等
 *      内层数组中的元素:arr[0][1] ,arr[1][2]等
 *
 *  二维数组中元素的默认值(两种初始化方式)
 *      初始化方式一: int[][] arr = new int[4][3];
 *          外层元素的默认值是: 地址值
 *          内存元素的默认值是: 与一维数组的元素默认值一样
 *      初始化方式二: int[][] arr = new int[4][];
 *          外层元素的默认值是: null
 *          内层元素的默认值时: 不能调用，否则会出现空指针异常
 *
 *
 */
public class ArrayTest3 {


    /**
     * 二维数组的内存分析
     *  int[][] arr = new int[4][];
     *  arr[1] = new int[]{1,2,3};
     *  arr[2] = new int[3];
     *  arr[2][1] = 30;
     *  解释：
     *        ① 栈空间中创建一个arr变量
     *          堆空间中创建一个四个长度的二维数组，二维数组中的元素是一个int型的一维数组,所以外层元素的值是 null
     *          因为null下面并没有创建新的数，因此调用内层元素的出现空指针异常
     *        ② 创建一个新的数组，将其赋值给外层元素的的arr[1]
     *        ③ 创建一个新的数组，将其赋值给外层元素的的arr[2]
     *        ④ 将二维数组中的一个具体的位置的元素赋值为 30
     */
    @Test
    public void test3(){

        int[][] arr = new int[4][];
        arr[1] = new int[]{1,2,3};
        arr[2] = new int[4];
        arr[2][1] = 30;
        for (int i = 0; i < arr.length; i++) {//遍历的时候出现空指针异常
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    @Test
    public void test1(){
        String[][] arr = new String[4][3];
        System.out.println(arr); //[[Ljava.lang.String;@5d6f64b1
        System.out.println(arr[0]);//[Ljava.lang.String;@32a1bec0
        System.out.println(arr[0][1]);//null

        String[][] arr2 = new String[4][];
        System.out.println(arr2);//[[Ljava.lang.String;@22927a81
        System.out.println(arr2[0]);//null
        System.out.println(arr2[0][1]);//空指针异常


    }






}
