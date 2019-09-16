package com.example.demo;

/**
 *  体会四种权限符
 *  private，缺省 ，protected public
 *  当前类 ，当前包。当前包的子包，整个工程
 *
 *  在不同包下面能够访问的权限修饰符只有：
 *      pulbic 与protected，
 *      但是 protected 必须要有继承的关系才能够访问
 */
public class Order {

    private int order1;
    int order2;
    protected int order3;
    public int order4;

    private int getOrder1(){
        return order1;
    }
    int getOrder2(){
        return order2;
    }
    protected int getOrder3(){
        return order3;
    }
    public int getOrder4(){
        return order4;
    }


}
