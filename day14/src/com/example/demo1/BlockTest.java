package com.example.demo1;

/**
 *  static 修饰的结构之代码块 {}
 *
 *  代码块 {} 如果要修饰的话，就只能使用static 来修饰
 *
 *  代码块的作用是用来 初始化类和对象的
 *
 *  代码块:可以分为 静态代码块 和 非静态代码块
 *
 *  静态代码块:
 *      内部可以输出语句，
 *      随着类的加载而加载，整个生命周期，只执行一次
 *
 *      作用: 初始化类的信息
 *
 *      如果一个类中定义了多个静态代码块，则按照先后顺序进行加载
 *      静态代码块的执行高于非静态代码块的执行
 *      静态代码块只能调用静态的属性和方法，不能调用非静态结构
 *
 *  非静态代码块
 *      内部可以输出语句
 *      随着对象的创建而创建，
 *      每创建一个对象，就执行一次非静态代码块中的内容
 *
 *      作用:可以再创建对象时，对对象的属性进行初始化
 *
 *      如果一个类中定义了多个非静态代码块，按照声明的先后顺序执行
 *      非静态代码块中，可以调用 静态/非静态 的属性和方法
 */

public class BlockTest {

    public static void main(String[] args) {

//        String desc = Person.desc;
//        System.out.println(desc);//我是一个人
        //================
        //hello static block-2 -- >>静态代码块
        //hello static block-1 -- >>静态代码块
        //我是一个人  -- >>静态代码块
        //我是一个快乐的人 -- >>静态代码块

        //hello block-2  -- >>创建对象时，调用非静态代码块
        //hello block-1  -- >>创建对象时，调用非静态代码块
        //人需要吃饭  -- >>创建对象时，调用非静态代码块
        //我是一个人 -- >>创建对象时，调用非静态代码块
        //我是一个快乐的人 -- >>创建对象时，调用非静态代码块
        //****************
        //hello block-2  -- >>创建对象时，调用非静态代码块
        //hello block-1 -- >>创建对象时，调用非静态代码块
        //人需要吃饭 -- >>创建对象时，调用非静态代码块
        //我是一个人 -- >>创建对象时，调用非静态代码块
        //我是一个快乐的人 -- >>创建对象时，调用非静态代码块

        //从结果上看，我们知道 静态代码块只执行一次，非静态代码块根据对象的创建而执行
        System.out.println("================");
        Person person1 = new Person();
        System.out.println("****************");
        Person person2 = new Person();
        System.out.println("----------------");
        System.out.println(person1.age);
        Person.info();


    }
}


class Person {

    String name;
    int age;
    static String desc = "我是一个人";


    public void eat(){
        System.out.println("人需要吃饭");
    }
    public static void info(){
        System.out.println("我是一个快乐的人");
    }
    //非静态代码块
    {
        System.out.println("hello block-2 ");
    }
    {
        System.out.println("hello block-1 ");
        //调用非静态的属性和方法
        name = "tom";
        eat();
        //调用静态属性和方法
        System.out.println(desc);
        info();
    }
    //静态代码块
    static {
        System.out.println("hello static block-2");
    }
    static {
        System.out.println("hello static block-1");
        //调用静态属性和方法
        System.out.println(desc);
        info();
        //不能调用非静态的属性和方法
//        eat();
    }


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}