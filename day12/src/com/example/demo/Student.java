package com.example.demo;

public class Student extends Person{

    String major;

    public Student(String major) {
        this.major = major;
    }
    public Student(){

    }

    public void study(){
        System.out.println("学习，专业是:" + major);
    }


    public void eat(){
        System.out.println("学生应该吃有营养的食物");
    }

    public void show(){
        System.out.println("我是一个学生");
    }

    public String info(){
        return "AA";
    }

    //类型必须与父类中的一致，否则编译不能通过
//    public int info1(){
//        return 2;
//    }

    public void walk(int walk){
        System.out.println("学生走路");
    }
}
