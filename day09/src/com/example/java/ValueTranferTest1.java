package com.example.java;

/**
 * 方法形参的传递机制 : 值传递
 *  两个概念 ： --》》 两个的定义范围不一样
 *      形参: 方法定义时，声明在方法小括号中的参数
 *      实参: 方法调用时，实际传递给形参的数据
 *
 *  值传递机制：
 *      如果 形参参数 是 基本数据类型，那么 实参 赋值给 形参 的是 实参的 数据值
 *      如果 形参参数 是 引用数据类型，那么 实参 赋值给 形参 的是 实参的 地址值
 *
 *  详细案例：请看 ValueTranferTest2.java 文件
 */

/**
 * 运行结果

 普通调用, m = 10 ,n= 20
 ========基本数据类型=========
 普通调用, m = 10 ,n= 20

 */

public class ValueTranferTest1 {

    public static void main(String[] args) {

        int m = 10 ,n = 20 ;
        System.out.println("普通调用, m = " + m + " ,n= " + n);

        System.out.println("========基本数据类型=========");

        ValueTranferTest1 test1 = new ValueTranferTest1();
        test1.swap(m,n);
        System.out.println("普通调用, m = " + m + " ,n= " + n);

    }
    public void swap (int m,int n ){
        int temp = m;
        m = n;
        n = temp;
    }






}
