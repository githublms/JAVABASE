package com.example.java2;

/**
 *  类的结构之三: 构造器(也被叫做构造方法，constructor)的使用
 *
 *  构造器的作用:
 *      创建对象
 *      初始化对象的信息
 *
 *  说明:
 *      如果没有显示的定义一个构造器，系统会默认提供一个无参的构造器
 *      如果我们显示了定义了一个构造器，那么系统就不会在提供默认的无参构造器了
 *      定义构造器的格式  权限修饰符 类名(形参列表){}
 *      一个类中至少会有一个构造器，
 *      一个类中有多个构造器时，构造器之间相互之间形成重载关系
 */
public class PersonTest {
    public static void main(String[] args) {

        //创建类的对象
        Person person = new Person();
        person.study();

        Person person1 = new Person("Tom",23);
        System.out.println(person1.name);
    }


}

class Person {
    //属性
    String name;
    int age;

    //构造器
    public Person(int n){
        age = n;
    }
    public Person(String string ,int num){
        System.out.println("有参构造器");
        name = string;
        age = num;
    }
    public Person(){
        System.out.println("person.......");
    }
    //方法
    public void eat(){
        System.out.println("人可以吃东西");
    }

    public void study(){
        System.out.println("人可以学习");
    }


}
