package com.example.demo1;

/* *
 *  对属性的赋值操作
 *      1 默认初始化
 *      2 显示初始化 / 3 代码块中初始化(考虑非静态)
 *      4 构造器中初始化
 *      5 对象.方法/属性 赋值
 *
 *  执行顺序: 1 --> 2 --> 3 --> 4 --> 5
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId); // 17
        order.orderId = 18 ;
        System.out.println(order.orderId); // 18
    }
}

class Order{

    int orderId = 15;
    {
        orderId = 16 ;
    }
    public Order(){
        orderId = 17;
    }
}
