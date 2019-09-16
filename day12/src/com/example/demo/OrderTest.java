package com.example.demo;

/**
 *  体会四种不同的权限修饰符的范围
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.order2 = 2;
        order.order3 = 3;
        order.order4 = 4;

        order.getOrder2();
        order.getOrder3();
        order.getOrder4();

        //同一个包下面，OderTest类不能访问Order类中的private 修饰的结构
//        order.order1 = 1;
//        order.getOrder1();

    }
}
