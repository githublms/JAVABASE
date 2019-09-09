package com.example.exer;

import java.util.Arrays;

/*
1.编写程序，定义三个重载方法并调用。方法名为mOL。
	三个方法分别接收一个int参数、两个int参数、一个字符串参数。
	分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
	在主类的main ()方法中分别用参数区别调用三个方法。

	2.定义三个重载方法max()，
	第一个方法求两个int值中的最大值，
	第二个方法求两个double值中的最大值，
	第三个方法求三个double值中的最大值，
	并分别调用三个方法。
 */
public class OverLoadExer {
    public static void main(String[] args) {
        OverLoadExer loadExer = new OverLoadExer();
        System.out.println(loadExer.mol(5));
        System.out.println(loadExer.mol(5,2));
        loadExer.mol("ABC");

        loadExer.max(5,3);
        loadExer.max(2.05,2.06);
        loadExer.max(2.09,2.78,2.65);
    }
    public int mol(int i){
        return i * i;
    }
    public int mol(int m ,int n){
        return m * n ;
    }
    public void mol(String string){
        System.out.println(string);
    }

    public void max(int m,int n){
        if (m > n ){
            System.out.println("int型参数比较中,m 比较大");
        }else{
            System.out.println("int型参数比较中,n 比较大");
        }
    }
    public void max(double m,double n){
        if (m > n ){
            System.out.println("int型参数比较中,m 比较大");
        }else{
            System.out.println("int型参数比较中,n 比较大");
        }
    }
    public void max(double m,double n,double x){
        double[] arr = new double[3];
        arr[0] = m;
        arr[1] = n;
        arr[2] = x;
        Arrays.sort(arr);
        System.out.println("大小顺序是:" + Arrays.toString(arr));
    }
}
