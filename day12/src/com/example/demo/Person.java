package com.example.demo;

public class Person {

    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void show(){
        System.out.println("我是一个人");
    }

    void eat(){
        System.out.println("吃饭");
    }

    public void walk(int instance){
        System.out.println("走路，走路的距离是:" + instance + "公里");
        show();
        eat();
    }

    public Object info(){
        return null;
    }
    public double info1(){
        return 0.1;
    }


}
