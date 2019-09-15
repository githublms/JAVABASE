package com.example.java2;

/**
 *  this关键字的使用
 *
 *  this 可以用来修饰,调用，属性,方法 ,构造器
 *
 *  this 修饰属性和方法(this 可以理解为  当前正在创建的对象 或 当前对象)
 *
 *  在类的方法中，我们可以使用 this.属性，this.方法的方式，来调用属性和方法
 *      但是通常情况下，我们通常省略 this.
 *
 *  特殊情况下：我们不能省略this.
 *      如果方法的形参名和类的属性同名的时候，我们就不能省略this.
 *      必须使用  this.属性 的形式，来表明这是一个属性，而非形参
 *
 *  this调用构造器，说明
 *      在类的构造器中，我们可以显示的使用 this(形参列表) 的方式来调用本类中的其他构造器
 *      在类的构造器中，不能使用this(形参列表)的形式调用自己
 *      如果一个类中有n个构造器，那么就一定有n-1个构造器(形参列表)
 *      规定: this(形参列表); 必须放在首行
 *      构造器内部只能声明一个this(形参列表)，用来调用其他的构造器
 */
/*
运行结果:
Student正在初始化。。。
12
人可以学习
人可以吃东西
***************
Student正在初始化。。。
20
 */
public class ThisTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(12);
        System.out.println(student.getAge());
        student.eat();

        System.out.println("***************");

        Student student1 = new Student("Tom",20);
        System.out.println(student1.getAge());


    }


}

class Student {
    private  String name;
    private int age;

    public Student() {
        String info = "Student正在初始化。。。";
        System.out.println(info);

    }

    public Student(String name) {
        this();
        this.name = name;
    }

    public Student(int age) {
        this();
        this.age = age;
    }

    public Student(String name, int age) {
        this(age);
//        this.age = age;//可以替换成上面面这种
        this.name = name;
    }

    public void study (){
        System.out.println("人可以学习");
    }

    public void eat(){
        this.study();
        System.out.println("人可以吃东西");
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

























