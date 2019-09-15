package com.example.demo;

/**
 *  面向对象特征之二: 继承性
 *  为什么要使用继承？这就要说明继承性的好处
 *
 *  继承性的好处:
 *      减少代码的冗余，提高代码的复用性
 *      便于功能的扩展
 *      为多态性的使用提供前提条件
 *
 *  语法:
 *      class A extends B {}
 *      A：子类，派生类，subclass
 *      B：父类，超类，superclass
 *
 *  体现:
 *      一旦子类继承了父类，那么就继承了父类的所有属性和方法
 *      特别的:父类中声明为private的属性或者方法，子类继承父类后，仍然认为子类获取了父类的私有结构
 *      只是由于封装性的影响，使子类不能调用父类的结构而已
 *
 *      子类继承父类后，还可以继续声明自己的属性和方法，实现功能的扩展
 *
 *  java中继承性的规定:
 *      一个类可以被多个子类继承，
 *      java中类是单继承的，一个类只能有一个父类
 *      子父类是相对的概念
 *      子类直接继承父类的称之为直接父类，子类间接继承的父类称之为间接父类
 *      子类继承父类后，就获取了直接父类和间接父类的所有属性和方法
 *
 *  如果一个类没有显示的定义继承的父类，那么此类默认继承是java.lang.Object类
 *  所有的类都直接或者间接继承java.lang.Object，意味着，所有的类都继承Object类声明的功能
 */
public class ExtendsTest {

    public static void main(String[] args) {
        Person person = new Person();
        person.eat();//吃饭
        person.breath();//  生物可以进行呼吸

        System.out.println("*********继承前********");
        Student student = new Student();
        student.study();//学习
        student.show();//name=null,age=0
        System.out.println("**********继承前*******");
        System.out.println("**********继承后*******");
        Student student1 = new Student();
        student1.breath();//生物可以进行呼吸
        student1.show();//name=null,age=0
        student1.study();//学习
        System.out.println("**********继承后*******");

        Creature creature = new Creature();
        creature.breath();//生物可以进行呼吸

    }

}


















