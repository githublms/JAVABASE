package com.example.demo;

/**
 *  主要用来测试权限修饰符的权限范围大小
 */
public class Order {

    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
    void methodDefault(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
    public void methodPublic(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }


}
