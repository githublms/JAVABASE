package com.example.exer;

/*
 *  定义类KidsTest，
 *  在类的main方法中实例化Kids的对象someKid，
 *  用该对象访问其父类的成员变量及方法。
 */
public class KidsTest {
    public static void main(String[] args) {

        Kids someKid  = new Kids(12);

        someKid.printAge(); //I am 12 years old.

        someKid.setSalary(1);
        someKid.setSex(0);
        System.out.println("父类中的性别属性为:" + someKid.getSex()); // 0
        System.out.println("父类中的工资属性为:" + someKid.getSalary()); // 1

        someKid.manOrWoman(); //woman
        someKid.employeed(); // job



    }
}
