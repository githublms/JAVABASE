package com.example.demo1;

import com.example.demo.Order;

public class OrderTest {
    public static void main(String[] args) {

        //不同包下面的类，调用Order 类，除了public 修饰的结构，其他的都不能调用
        Order order = new Order();
        order.order4 = 4;
        order.getOrder4();
    }
}
