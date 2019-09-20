package com.example.demo;

/**
 *  抽象类的匿名子类
 */
public class PersonTest {

    public static void main(String[] args) {
        PersonTest test = new PersonTest();
        test.method( new Student());  //匿名对象
        Worker worker  = new Worker();// worker == 非匿名的类的非匿名对象
        test.method1(worker); // 非匿名的类 非匿名的对象
        test.method1( new Worker()); // 非匿名的类 匿名的对象

        System.out.println("********************");

        // 创建 匿名子类的对象 person 或者 下面的一种写法
        Person person = new Person() {
            @Override
            public void walk() {

            }

            @Override
            public void breath() {

            }
        };
        test.method1(person);
        test.method1(new Person() {
            @Override
            public void walk() {

            }

            @Override
            public void breath() {

            }
        });


    }

    public void method1(Person person){
        person.eat();
        person.walk();
    }
    public void method(Student student){
    }
}

class Worker extends Person{
    @Override
    public void eat() {
        System.out.println("工人吃午饭");
    }

    @Override
    public void walk() {
        System.out.println("工人威猛的走路");
    }

    @Override
    public void breath() {
        System.out.println("工人愉快的呼吸");
    }
}

