package com.example.demo1;

import com.example.demo.Order;

public class SubOrder  extends Order {

    // 获取不同包下面属性和方法，需要使用public 和 peotected ，
    // 但是调用 protected 修饰的属性和方法 必须具有子父类的关系，否则不能调用
    public void show(){
        order3 = 3;
        order4 = 4;

        getOrder3();
        getOrder4();

//        order1 = 1;
//        order2 = 2;
//        getOrder1();
//        getOrder2();
    }
}
