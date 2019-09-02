package com.example.demo;

import org.junit.Test;

/**
 * 数组中元素的，默认初始值
 *  数组元素是 整型 ，默认初始值 0
 *  数组元素是 浮点型，默认初始值 0.0
 *  数组元素是 布尔类型 ，默认初始值 false
 *  数组元素是 char ，默认初始值 0 或者'\u0000' 不是'0'
 *  数组元素是 引用数据类型 ，默认初始值 null
 *
 *  数组的内存解析
 *      内存的简化结构: jvm主题分为3个部分
 *          栈:主要存放局部变量 stack
 *          堆：主要存放new 出来的结构，包含数组和对象
 *          方法区: 分为两个部分：静态域（用来存放static 修饰的结构和类加载的信息） 和 常量池（用于存放字符串的）
 *
 */
public class ArrayTest1 {

    /**
     * 内存解析：
     *      静态初始化：
     *          栈空间 创建 变量arr ,堆空间创建 一个int 型的数组 (创建的这个数组在内存中是连续的) ，
     *          栈和堆如何联系起来呢？将数组的首地址赋值给变量arr。通过操作变量，就可以操作数组
     *      动态初始化:
     *          栈 创建一个变量arr2,堆空间创建一个String类型的数组，也是将堆空间的数组首地址赋值给变量arr2.
     *          通过安然然来实现操作数组
     *          后面 arr2 = new String[3]; 创建一个新的数组，并将新的数组的地址赋值给arr2，使arr2指向新的数组，
     *          这时候数组中的元素没有赋值，元素类型是String ，因此默认值是 null
     *          arr2 指向原来的数组，就断开了
     *          经过gc后，堆空间和栈空间的内存就会被清理
     *
     */
    @Test
    public void test2(){
        int[] arr = new int[]{12,13,14};
        String[] arr2 = new String[5];
        arr2[1] = "刘德华";
        arr2[2] = "张学友";
        arr2 = new String[3];
        System.out.println(arr2[1]);//null
    }

    public static void main(String[] args) {

        int[] arr = new int[2];
        System.out.println(arr[0]);

        short[] arr2 = new short[12];
        System.out.println(arr2[0]);

        double[] doubles = new double[2];
        System.out.println(doubles[1]);

        System.out.println("===========");

        char[] arr4 = new char[4];
        System.out.println("111" + arr4[0] + "222");

        if (arr4[0] == 0 && arr4[2] == '\u0000'){
            System.out.println("hello"); //输出hello
        }
        if (arr4[2] == '0' ){
            System.out.println("good"); //什么也不输出，证明char[] 的数组元素的默认值是 0 或者是'\u0000'
        }

        System.out.println("-------------");
        boolean[] bool = new boolean[2];
        System.out.println(bool[1]);

        String[] str = new String[2];
        System.out.println(str[0]);
        if (str[0] == null){
            System.out.println("best");
        }























    }


}
