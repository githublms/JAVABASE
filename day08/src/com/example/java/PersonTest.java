package com.example.java;

/**
 * 面向对象一: 类和类的成员设计
 *    常用术语：
 *      属性 = 成员变量 = filed = 字段，域
 *      方法 = 成员方法 = 函数 = method
 *      创建类的对象 = 类的实例化 = 实例化类
 *
 *  类和对象的使用：(面向对象思想落地的具体体现)
 *      创建类，设计类的成员
 *      创建类的对象
 *      通过对象.属性，或对象.方法来调用类的结构
 *
 *  如果一个类创建了多个类的对象，那么每个对象都拥有一套该类的属性和方法(非static)
 *      这样，我们修改对象A中的属性，不会影响对象B中的属性
 *
 *  对象的内存解析
 *
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建类的对象
        Person person = new Person();

        //通过对象调用类的属性
        person.age = 10;
        person.isMale = false;
        person.name = "xiaoming";
        System.out.println(person.name);

        //通过对象调用类的方法
        person.eat();
        person.sleep();
        person.talk("中国");

        //**************
        Person person1 = new  Person();
        System.out.println(person1.name);//null
        System.out.println(person1.isMale);//false

        //将person的变量值(地址值)赋值给p3，使其指向同一个实例
        Person p3 = person;
        System.out.println(p3.name);
        p3.name = "Tom";
        System.out.println(p3.name);

    }

}

//创建类
class Person{

    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }

    public void talk(String language){
        System.out.println("人可以讲" + language + "话");
    }
}




























