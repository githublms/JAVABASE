package com.example.exer;

/*
    编写一个Employee类，声明为抽象类，
    包含如下三个属性：name，id，salary。
    提供必要的构造器和抽象方法：work()。
 */
public abstract  class Employee {

    String name;
    int id;
    double salary;

    abstract void work();
    public void eat(){
        System.out.println("吃饭");
    }

    public Employee(){

    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }



}
