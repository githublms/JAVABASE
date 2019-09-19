package com.example.demo;


/**
 * 单例模式中的 懒汉式
 * 目前的写法是线程不安全的
 */
public class SingletonTest2 {

    public static void main(String[] args) {
        Dog dog1 = Dog.getInstance();
        Dog dog2 = Dog.getInstance();
        System.out.println(dog1.equals(dog2)); //返回的结果也为true
    }
}

class Dog {

    // 私有化构造器
    private Dog (){

    }

    // 初始化对象，不给其赋值
    private static Dog instance = null;

    //提供静态的公共的方法，用于返回对象
    public static Dog getInstance(){
        if (instance == null ){ // 如果对象为null ,那么就new 一个，如果对象不为null ，那么直接返回对象
            instance = new Dog();
        }
        return instance;
    }

}
