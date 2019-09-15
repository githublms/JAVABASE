package com.example.test;


public class Woman {
    private  String name;
    private int age;

    public void marry(Man man){
        System.out.println("我想嫁给" + man.getName());
        man.marry(this);
    }

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Woman() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
