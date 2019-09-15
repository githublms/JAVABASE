package com.example.java2;

import com.example.demo.Order;

/**
 * 测试 private 和 缺省 的权限 范围大小
 */
public class OrderTest {

    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic = 5 ;
//        order.orderPrivate = 15; //出了 Order 所在类的包，private 和 缺省 都无法使用
//        order.orderDefault = 16;

        order.methodPublic();
//        order.methodPrivate();//出了 Order 所在类的包，private 和 缺省 都无法使用
//        order.methodDefault();
    }
}
