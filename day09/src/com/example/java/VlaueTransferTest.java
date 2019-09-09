package com.example.java;

/*
 * 关于变量的赋值：
 *
 *  如果变量是基本数据类型，此时赋值的是变量所保存的    数据值。
 *  如果变量是引用数据类型，此时赋值的是变量所保存的    数据的地址值。
 */
public class VlaueTransferTest {
    public static void main(String[] args) {

        System.out.println("====基本数据类型变量赋值====");
        int m = 10 ;
        int n = m;
        System.out.println("m = " + m + ", n = " + n);
        n = 20 ;
        System.out.println("m = " + m + ", n = " + n);

        System.out.println("====引用数据类型变量赋值====");

        Order o1 = new Order();
        o1.orderId = 1002;
        Order o2 = o1; //赋值以后，o1 和 o2 指向了堆空间中的同一个对象实体
        System.out.println("o1.orderId = " + o1.orderId + " ,o2.orderId =" + o2.orderId );
        o2.orderId = 1003;
        System.out.println("o1.orderId = " + o1.orderId + " ,o2.orderId =" + o2.orderId );



    }




}

class  Order{
    int orderId;
}