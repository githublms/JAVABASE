package com.example.test;

public class Man {
    private String name;
    private int age;

    public void marry(Woman woman){
        if (woman.getName().equals("小红")){
            System.out.println("我不想娶小红为妻子");
        }else{
            System.out.println("我愿意娶" + woman.getName() + "为妻");
        }
    }


    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Man() {
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
