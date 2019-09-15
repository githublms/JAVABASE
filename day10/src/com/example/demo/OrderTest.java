package com.example.demo;


/**
 *  测试权限修饰符的大小范围
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic = 5 ;
        order.orderDefault = 15;
//        order.orderPrivate = 15;//出了order类的范围，私有的结构就不可以调用了

        order.methodDefault();
        order.methodPublic();
//        order.methodPrivate();//出了Order定义的范围，私有的结构就不可以调用了




    }
}
