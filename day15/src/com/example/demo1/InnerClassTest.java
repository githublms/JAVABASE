package com.example.demo1;

/**
 *  类的成员之五 - 内部类
 *  java 允许一个类A 声明在另外一个类B中，类A 为内部类，类B为外部类
 *
 *  内部类的分类:
 *      成员内部类(静态 / 非静态) VS 局部内部类(声明在 方法内，代码块内，构造器内)
 *
 *  成员内部类:
 *      作为一个外部类的成员: (将成员内部类当做一个属性 --》》 int number  )
 *          可以调用外部类的成员
 *          可以被static 修饰
 *          可以被四种权限修饰符修饰
 *
 *      作为一个类:
 *          可以声明属性，方法，构造器等
 *          可以被final 修饰，表示此类不能被继承，反之，没有用final修饰，那么就能被继承
 *          可以被abstract 修饰
 *
 *  开发中，关于内部类主要关注下面三个问题:
 *
 *      如何实例化内部类的对象
 *          静态成员内部类的实例化
 *          非静态成员内部类的实例化
 *
 *      如何在成员内部类区分调用外部类的结构
 *          原则是先在本地找，本地找到属性，
 *              就可以直接使用 使用 this.属性 或者this.方法 直接调用
 *              要调用外部类的属性和方法，使用Person.this.属性和方法
 *
 *      开发中局部内部类的使用 -- 》》 键InnerClassTest1.java
 */

/** 运行结果
 小红
 小明
 这是一个学生
 **************************
 我是一只小小鸟
 人吃饭
 123
 30
 ----------------------
 xiaoguang
 小明
 小白
 */


public class InnerClassTest {
    public static void main(String[] args) {
        Person.Studnet studnet = new Person.Studnet(); // 静态成员内部类的对象实例化
        System.out.println(studnet.name); // 小红 --》》 调用的是自己的属性
        System.out.println(new Person().name); // 小明 ：调用外部类的同名属性 name
        studnet.show(); // 这是一个学生

        System.out.println("**************************");
//        Person.Dog dog = new Person.Dog();//非静态成员内部类的对象实例化，这样写是错误的
        Person person = new Person();
        Person.Dog dog = person.new Dog() ; //费静态成员内部类的对象实例化。这是正确的
        dog.sing();
        System.out.println("----------------------");
        dog.display("xiaoguang");

    }
}

class Person{

    String name = "小明";
    int age;

    public void eat(){
        System.out.println("人吃饭");
    }

    //静态内部类
    static class Studnet{
        String name = "小红";
        int age = 20;

        public void show(){
            System.out.println("这是一个学生");
//            eat(); // 静态类中的方法不可以调用费静态结构
        }
    }

    //非静态内部类
    class Dog {

        String name = "小白";
        int  age = 30;

        public Dog(){

        }

        public void sing(){  //先从内部找对相应的属性，如果没有，就调用外部的属性或者方法
            System.out.println("我是一只小小鸟");
            Person.this.eat(); //调用外部类的非静态属性和方法 -->> 人吃饭
            this.eat(); //调用自己内部的方法 -->> 123
            System.out.println(age); // 30
        }

        public void display(String name){
            System.out.println(name); // 方法的形参 -- 》》 小光
            System.out.println(Person.this.name); // 调用外部类的费静态属性
            System.out.println(this.name); // 调用自己类的属性
        }
        public void eat(){
            System.out.println(123);
        }
    }


    public void method(){
        class Cat { //局部内部类

        }
    }

    {
        class Animal { // 局部内部类

        }
    }
    public Person (){
        class Bird { //局部内部类

        }
    }
}

