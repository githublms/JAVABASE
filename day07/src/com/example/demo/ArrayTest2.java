package com.example.demo;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.junit.Test;

import java.util.Arrays;

/*
 * 算法的考查：数组的复制、反转、查找(线性查找、二分法查找)
 */
public class ArrayTest2 {


    /**
        二分法查找
            数组必须有序，将数组进行中间切分，循环条件 startIndex <= endIndex 并且使用flag 来做循环的判断条件
            如果要查找的数 大于 中间索引对应的数 ，那么 开始索引 就变成 startIndex = mid + 1 ;
            如果要查找的数 小于 中间索引对应的数 ，那么 开始索引 就变成 endIndex = mid - 1 ;
            如果要查找的数 等于 中间索引对应的数 ，那么 就直接输出;

     */
    /**
     161
     排序后的数组元素是:[12, 12, 15, 16, 35, 36, 48, 56, 58, 74, 89]
     很遗憾，没有找到元素

     排序后的数组元素是:[12, 12, 15, 16, 35, 36, 48, 56, 58, 74, 89]
     目标元素16数组中的位置是:3
     */
    @Test
    public  void test2(){

        int[] arr = new int[]{12,15,56,36,89,74,58,12,16,35,48};
        Arrays.sort(arr);
        System.out.println("排序后的数组元素是:" + Arrays.toString(arr));
        int dest = 16 ;
        int start = 0 ;
        int end = arr.length - 1;
        boolean flag = true;
        while (start <= end){
            int mid = (start + end ) / 2;
            if (arr[mid] == dest){
                System.out.println("目标元素"+ dest  + "数组中的位置是:" + mid);
                flag = false;
                break;
            } else if (arr[mid] < dest ){
                start = mid + 1;
            }if(arr[mid] > dest){
                end = mid -1 ;
            }
        }
        if (flag){
            System.out.println("很遗憾，没有找到元素");
        }




    }

    public static void main(String[] args) {

        //数组的复制(区别于数组变量的赋值：arr1 = arr)
        //数组元素的复制，和 数组变量的复制

        int[] arr = new int[]{12,116,15,42,36,48,52,76,93,45};
        int[] arr1 = arr;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));
        //数组元素的复制 ，需要采用的循环复制(两个变量名指向两个不同的堆空间地址)， 数组变量的复制 两个变量名指向同一个堆空间地址
        System.out.println(arr == arr1); // true
        System.out.println(arr == arr2); //false

        int[] arr4 = new int[arr.length];
        //数组的赋值 放入一个新的数组，方向循环赋值，这个应该叫赋值，不叫反转

//        for (int i = 0; i < arr.length; i++) {
//            arr4[i] = arr[arr.length -1 - i];
//        }
//        System.out.println(Arrays.toString(arr4));

//        数组的反转 方式一 ，以中间为结点，采用中间变量的方式，分为两半 A和B A，B 对挑
//        for (int i = 0; i < arr.length / 2 ; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length -1 -i ] ;
//            arr[arr.length -1 -i ] = temp;
//        }
//        System.out.println("数组反转后:" + Arrays.toString(arr));

        //数组的反转 方式二 利用中间变量，循环赋值，进行数组的反转
        for (int i = 0,j = arr.length - 1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("数组反转后:" + Arrays.toString(arr));


        System.out.println("*************");

        //查找：线性查找，顺着线一个一个的对比查找
        String[] strings = new String[]{"AA","BB","CC","DD"};
//        String  dest =  "BB";
        String  dest =  "BB";
        boolean  flag = false;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(dest)){
                System.out.println("找到了，元素所在的下标:" + i);
                flag = true;
                break;
            }
        }
        if (flag == false){
            System.out.println("很遗憾没有找到你所说的元素");
        }

        System.out.println("----------");
        //二分法查找 前提是: 查找的数组必须有序 -->>使用arr数组进行代替
        Arrays.sort(arr);
        System.out.println("排序后的数组顺序是:" + Arrays.toString(arr));

        int startIndex = 0;
        int endIndex = arr.length - 1 ;
        int num = 42;
        boolean  isFind = true;
        while (startIndex <= endIndex){
            int mid = (startIndex + endIndex ) / 2 ;
            if (arr[mid] == num){
                System.out.println("很高兴，找到了" + num + "在数组中的下标位置是在:" + mid );
                isFind = false;
                break;
            } else if (arr[mid] < num){
                startIndex = mid + 1;
            }else{
                endIndex = mid -1;
            }
        }
        if (isFind){
            System.out.println("很遗憾，没有找到");
        }








    }









}
