package com.example.demo1;

/**
 *  java8 中关于接口 新增的默认方法和静态方法
 *  更多的使用，请看 day15中 java8
 */
public interface Java8New {

    //jdk8 之前的接口中定义了 全局常量 和 抽象方法
    public static final int num = 25;
    int nuber = 78;

    public abstract  void eat();
    void show();

    // jdk8 新增的默认方法和静态方法
    //  -->> 正常的一个方法，方法体，只是增加了 default 和 static 来修饰 ，可以有多个

    //默认方法
    public default void method(){
        System.out.println("这是jdk 8 新增的 默认方法");
    }

    public default  String method1(){
        return null;
    }
    //静态方法
    public static void staticMethod(){
        System.out.println("这是一个静态方法");
    }

    public static String staticMethod2(){
        return null;
    }

}
