package com.example.demo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 *  接口的使用
 *  接口使用 interface 来定义
 *  java中 接口和类是两个并列的结构 。 引用类型有三个: 类 数组，接口
 *
 *  如何定义类中的成员呢？分 java7 和 java8 两种
 *      java7 接口中可以定义
 *          全局常量(public static final 修饰)
 *          抽象方法(public abstract 修饰) 两个
 *
 *      java8 接口出了上述两个，还可以定义 静态方法 和 默认方法
 *
 *  接口中不能定义构造器，意味着接口不能实例化， 抽象类也不能实例化，但是抽象类中有构造器，是为了子类实例化时调用
 *
 *  java开发中，类 使用 implements 来实现 接口 ，
 *      类如果实现了接口中的所有抽象方法，那么类便可以实例化
 *      类如果没有实现接口中的所有抽象方法，那么此类仍然是一个抽象类
 *          -- 》》 为什么是抽象类呢？因为接口中的方法 都是抽象方法，含有抽象方法都是抽象类，抽象类中不一定有抽象方法
 *
 *  java 中类可以多实现接口，弥补了 类单继承的局限性
 *      格式为: class A implements BB,CC,DD{}
 *
 *  接口与接口之间可以多继承
 *
 *  接口的具体使用 -->>体现多态性
 *  接口实际上可以看做是一种规范
 *
 *  面试题:接口和抽象类的异同？
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED); //因为全局常量使用 public static final 修饰，所以可直接调用
        Blue blue = new Blue(); //子类对象只能调用方法，不能调用全局常量
        blue.eat();
    }
}

//接口使用 interface 来修饰
interface Flyable {
    //全局常量
    public static final int MAX_SPEED = 20;
    int MIN_SPEED = 10; // 省略 public static final

    //抽象方法
    public abstract void eat();
    void show(); // 省略  public abstract
}

// 类 实现接口中的所有抽象方法 ，此类可以实例化
class Plane implements Flyable {
    @Override
    public void eat() {

    }

    @Override
    public void show() {

    }
}

// 类没有实现接口中所有的抽象方法，那么此类便为抽象类，抽象类不能实例化，但是有构造器
abstract class AA implements Flyable{
    public  AA(){}
    @Override
    public void eat() {

    }
}


interface DD {
    void method();
}

interface EE {
    void method2();
}

interface FF extends DD,EE {
    void method3();
}

class Blue extends Object implements FF,Flyable{
    @Override
    public void eat() {

    }

    @Override
    public void show() {

    }

    @Override
    public void method() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}