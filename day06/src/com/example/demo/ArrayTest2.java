package com.example.demo;

import org.junit.Test;


/*
 * 二维数组的使用
 *
 * 1.理解：
 *      二维数组:可以看做是一个一维数组arr1 又作为另外的一个一维数组中的某一个元素
 *      从数组的底层来看，并没有二维/多维的概念
 *
 * 2. 二维数组的使用:
 *   ① 二维数组的声明和初始化
 *   ② 如何调用数组的指定位置的元素
 *   ③ 如何获取数组的长度
 *   ④ 如何遍历数组
 *   ⑤ 数组元素的默认初始化值 :见 ArrayTest3.java
 *   ⑥ 数组的内存解析 :见 ArrayTest3.java
 */
public class ArrayTest2 {

    /**
     * 辨析数组，输出的结果是具体的数值还是数组地址值
     * 输出arr（数组名）得到的结果是数组的首地址值
     * 输出数组中指定位置的元素，得到的结果是具体的值
     */
    @Test
    public void  test2(){
        String[][] arr = new String[5][3];
        System.out.println(arr);//[[Ljava.lang.String;@5d6f64b1
        System.out.println(arr[0]); //[Ljava.lang.String;@32a1bec0
        System.out.println(arr[0][1]); //null
    }
    public static void main(String[] args) {
        //二维数组的声明和初始化
        int[] arr = new int[]{1,2,3};//一维数组
        //静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{7,8,9}};
        //动态初始化1
        int[][] arr2 = new int[3][];
        //动态初始化2
        int[][] arr3 = new int[3][2];

        //错误的情况
//        String[][] arr5 = new String[][3];
//        String[3][4] arr5 = new String[][];
//        String[][] arr5 = new String[4][3]{{1,2,3},{2,3}};

        //正确的写法
        int[][] arr6 = new int[][]{{1,2,3},{4,5,67},{8,9}};
        int[][] arr7 = {{1,1,2},{5,6,7},{6,3}};//同样有类型推断  算是一个二维数组的静态初始化

        //如何调用二维数组中指定位置中的元素
        System.out.println(arr1[2][1]);//8
        System.out.println(arr6[0][0]);//1

        String[][] strings = new String[3][2];
        System.out.println(strings[2]);//null
        System.out.println(strings[2][0]);//因为没有给元素赋值，所以报空指针异常

        //获取数组的长度
        System.out.println(strings.length);//3
        System.out.println(strings[0].length);//2

        //遍历二维数组
        for (int i = 0; i < arr6.length; i++) {
            for (int j = 0; j < arr6[i].length; j++) {
                System.out.print(arr6[i][j] + " " );
            }
            System.out.println();
        }

    }



}





























