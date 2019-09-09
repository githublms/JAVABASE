package com.example.exer;

/**
 * 重写OverLoadExer中的方法
 * 使用 三元运算符更加的简单 ，快速
 */
public class OverLoadExer1 {
    public static void main(String[] args) {
        OverLoadExer1 test = new OverLoadExer1();
        System.out.println("最大值是:" + test.max(5,6));
        System.out.println("最大值是:" + test.max(5.96,7.25));
        System.out.println("最大值是:" + test.max(52.63,15.26,56.25));

    }

    public int max(int m,int n){
        return m > n ? m : n ;

    }
    public double max(double m,double n){
        return m > n ? m : n ;

    }
    public double max(double m,double n,double x){
        double max = m > n ? m : n ;
        return max > x ? max : x;
    }
}
