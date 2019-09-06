package com.example.demo;

import java.util.Arrays;

/**
 * java.util.Arrays 是操作数组的一个工具类，里面定义了许多操作数组的方法
 */

public class ArraysTest {
    public static void main(String[] args) {

        //比较两个数组是否相等
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[] {1,3,2,4};
        boolean bool = Arrays.equals(arr1,arr2);
        System.out.println(bool); //false

        //输出数组信息
        System.out.println(Arrays.toString(arr2));//[1, 3, 2, 4]

        //将指定的值填充到数组中,这里的填充其实是将数组中的所有元素都替换成填充值
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));//[1, 3, 2, 4]

        //对数组进行排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));// [1, 2, 3, 4]

        //查找 -- 二分法查找 查询指定的元素是否在数组中
//        int[] arr3 = new int[]{12,36,45,-59,210,636,45};
//        int index =  Arrays.binarySearch(arr3,12);
//        System.out.println(index);

        //查找 -- 二分法查找 查询指定的元素是否在数组中，找到了，返回元素所在位置的下标，未找到，返回一个负数
        int[] arr3 = new int[]{-98,-34,2,34,54,66,79,105,210,333};
        int index = Arrays.binarySearch(arr3, 21);
        System.out.println(index);
        if(index >= 0){
            System.out.println(index);
        }else{
            System.out.println("未找到");
        }

    }



}
