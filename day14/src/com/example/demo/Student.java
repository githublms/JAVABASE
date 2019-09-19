package com.example.demo;


public class Student  extends Person {

    public void earnMoney(){
        System.out.println("男人挣钱养家");
    }

    public void walk(){
        System.out.println("男人霸气的走路");
    }
    public void eat(){
        System.out.println("男人要吃肉");
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
