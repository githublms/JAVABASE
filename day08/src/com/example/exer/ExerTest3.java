package com.example.exer;

/*
 * 3.1 编写程序，声明一个method方法，在方法中打印一个10*8 的*型矩形，在main方法中调用该方法。
 * 3.2 修改上一个程序，在method方法中，除打印一个10*8的*型矩形外，再计算该矩形的面积，
 * 并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
 *
 * 3.3 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个m*n的*型矩形，
 * 并计算该矩形的面积， 将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。

 */
public class ExerTest3 {
    public static void main(String[] args) {
        ExerTest3 test3 = new ExerTest3();
//        test3.method();
//        int area = test3.method2();
//        System.out.println("矩形的面积是:" + area);

        int area = test3.method3(5,4);
        System.out.println("矩形的面积是:" + area);

    }

    public int method3(int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
        return m * n;
    }




    public void method(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print('*' + "\t");
            }
            System.out.println();
        }
    }
    public int  method2(){
        for (int i = 0 ; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
        return 10 * 8;
    }
}












