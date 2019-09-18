package com.example.exer1;

/*
 * 编写Order类，有int型的orderId，String型的orderName，
 * 相应的getter()和setter()方法，两个参数的构造器，
 * 重写父类的equals()方法：public boolean equals(Object obj)，
 * 并判断测试类中创建的两个对象是否相等。
 */
public class OrderTest {
    public static void main(String[] args) {

        Order  order1 = new Order(1001,"AA");
        Order  order2 = new Order(1001,new String("BB"));
        Order  order3 = new Order(1001,"BB");

        System.out.println(order1.equals(order2));//false
        System.out.println(order2.equals(order3));//true
    }
}
class Order{
    private int orderId;
    private String orderName;

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj instanceof Order){
            Order order = (Order) obj; //orderName 为 String 类型，所以用equals 比较内容，如果用 == ，那么比较的是地址
            if (order.orderId == this.orderId && order.orderName.equals(this.orderName)){ //正确的写法
//            if (order.orderId == this.orderId && order.orderName == this.orderName){ //错误的写法
                return true;
            }
        }
        return false;
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}