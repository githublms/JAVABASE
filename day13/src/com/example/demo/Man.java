package com.example.demo;

/**
 * @author lms
 * @create 2019-09-17 15:19
 */
public class Man extends Person{

    boolean isSmoking;
    int id = 1002;

    public void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }

    public void eat(){
        System.out.println("男人要吃肉，涨肌肉");
    }

    public void walk() {
        System.out.println("男人霸气的走路");
    }
}
