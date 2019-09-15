package com.example.demo;

public class Student extends Person{

//    String name;
//    int age;
    String major;

    public Student() {
    }

    public Student(String name, int age, String major) {
        this.name = name;
        setAge(age);
//        this.age = age; //父类中age为私有属性，因此，使用setAge()来设置age值

        this.major = major;
    }

    public void study(){
        System.out.println("学习");
    }

    public void show(){
//        System.out.println("name="+ name + ",age=" + age);
        System.out.println("name="+ name + ",age=" + getAge());
    }

}
