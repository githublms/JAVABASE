package com.example.demo;

/**
 *  关于 类中有属性和 接口中有属性同名是，如何取舍
 */
public class C extends B implements A {
    public static void main(String[] args) {
//        System.out.println(num);  //num 是模糊的，编译不通过
        //同名时，使用不同的方式进行调用
        System.out.println(new B().num); // 10
        System.out.println(A.num); // 20 //因为接口中的num 是全局常量 public static final ，所以可以通过 接口名.num 来调用
    }
}

class B {
    int num = 10;
}

interface A {
    int num = 20;
}