package com.example.java2;
//①
public class JavaBean {

    /*
     * javabean 是一种可重用组件
     * 一般一个类被称之为一个javabean需要满足下面一些条件
     *      类是public 修饰的
     *      提供有无参的构造器
     *      有属性，并提供set/get方法
     */
    //②
    public JavaBean() {

    }

    private int age ;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
