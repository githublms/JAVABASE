package com.example.exer;

//男大当婚
public class Boy {
    private String name;
    private int age;

    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void marry(Girl girl){
        System.out.println("我想娶" + girl.getName());
//        girl.marry(this);
    }
    public void shut(){
        if (age > 22){
            System.out.println("你可以去结婚登记了");
        }else{
            System.out.println("多谈谈恋爱，总是好的");
        }
    }

}
