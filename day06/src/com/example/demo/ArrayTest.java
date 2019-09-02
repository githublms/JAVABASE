package com.example.demo;

/*
 * 一、数组的概述
 * 1.数组的理解：数组(Array)，是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名，
 * 并通过编号的方式对这些数据进行统一管理。
 *
 * 2.数组相关的概念：
 * >数组名
 * >元素
 * >角标、下标、索引
 * >数组的长度：元素的个数
 *
 * 3.数组的特点：
 * 1）数组是有序排列的
 * 2）数组属于引用数据类型的变量。数组的元素，既可以是基本数据类型，也可以是引用数据类型
 * 3）创建数组对象会在内存中开辟一整块连续的空间
 * 4）数组的长度一旦确定，就不能修改。
 *
 * 4. 数组的分类：
 *   ① 按照维数：一维数组、二维数组、。。。
 *   ② 按照数组元素的类型：基本数据类型元素的数组、引用数据类型元素的数组
 *
 * 5. 一维数组的使用
 *   ① 一维数组的声明和初始化
 *   ② 如何调用数组的指定位置的元素
 *   ③ 如何获取数组的长度
 *   ④ 如何遍历数组
 *   ⑤ 数组元素的默认初始化值 ：见ArrayTest1.java
 *   ⑥ 数组的内存解析 ：见ArrayTest1.java
 */

public class ArrayTest {

    public static void main(String[] args) {
        //变量的声明和初始化
        int num;//声明
        num = 10;//初始化
        int id = 1001;//声明和初始化

        //一维数组的声明和初始化
        int[] ids ; //声明
        //初始化分为静态初始化和动态的初始化
        //静态初始化: 数组的初始化和数组中的元素赋值是同时进行
        ids = new int[]{1001,1002,1003};
        //动态初始化: 数组的初始化和数组中的元素赋值是分开进行
        ids  = new int [5];

        //错误的写法
//        int[] arr = new int[];
//        int[2] arr = new int[2];
//        int[] arr = new int[3]{12,13,14};

        //正确的写法，进行了类型的推断
        int[] arr4 = {12,13,14};

        //总结: 数组一旦初始化完成，那么长度就固定了

        //如何调用数组中指定位置上的元素
        //通过角标来获取指定位置的元素；数组的角标从0 开始 ，到数组的长度 -1 结束

        String[] strings = new String[5];
        strings[0] = "王五";
        strings[1] = "李四";
        strings[2] = "赵六";
        strings[3] = "麻子";
        strings[4] = "麻子2号";

        //如何获取数组的长度，通过 length 属性
        System.out.println(strings.length);
        System.out.println(ids.length);

        //如何遍历数组
        /*System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings[2]);
        System.out.println(strings[3]);
        System.out.println(strings[4]);*/

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    }
}

































