package com.example.demo;

/**
 *  abstract : 抽象的
 *  abstract 可以用来修饰 类和方法
 *
 *  abstract 修饰的类称之为 抽象类
 *      抽象类不能实例化，
 *      抽象类是类，所以一定会有构造器（便于子类实例化时调用父类构造器）
 *      开发中，都会提供抽象类的子类，让子类完成实例化，并完成相关的操作
 *
 *  abstract 修饰的方法称之为 抽象方法
 *      抽象方法只有方法的声明，没有方法体
 *      包含抽象方法的类一定是抽象类，反之，抽象类中不一定有抽象方法
 *      若子类重写了父类所有的抽象方法，那么子类可以实例化，
 *      如果子类没有完全重写父类的所有抽象方法，那么子类也是一个抽象类，需要使用abstract 来修饰
 *
 *  注意:
 *      abstract 不能用来修饰属性和构造器，原因是修饰了这些毫无意义
 *      abstract 不能用来修饰final 修饰的类 ，方法 （与final的含义相互冲突），私有方法 （毫无意义）
 *
 *   抽象方法的模板设计模式暂不考虑，有点深奥，另外 非匿名的类的匿名对象，也暂时不深究
 */

/**
 *  运行结果:
 this is a creature constructor
 0
 学生吃有营养的东西
 学生自信的走路
 学生正常呼吸
 */
public class AbstractTest {
    public static void main(String[] args) {
//        new Person();//'Person' is abstract; cannot be instantiate -->> 抽象类不能实例化
       Student student =  new Student();
        System.out.println(student.age);
        student.eat();
        student.walk();
        student.breath();
    }
}

//抽象类，使用abstract 修饰
abstract class Creature {
    public Creature() {
        System.out.println("this is a creature constructor");
    }
    //抽象方法
   public abstract  void breath();
   //普通方法
   public void eat(){
       System.out.println("生物可以吃东西");
   }
}

abstract  class Person extends Creature{

    String name;
    int age;

//    public abstract void breath();

    public void eat(){
        System.out.println("人吃肉");
    }

    public abstract  void walk();//有抽象方法的类一定是抽象类

}

class Student extends Person {
    @Override
    public void breath() {
        System.out.println("学生正常呼吸");
    }

    @Override
    public void eat() {
        System.out.println("学生吃有营养的东西");
    }

    @Override
    public void walk() {
        System.out.println("学生自信的走路");
    }
}





























