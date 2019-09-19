package com.example.demo;

import com.sun.webkit.ContextMenu;

/**
 *  static 关键字的使用
 *  static: 静态的
 *
 *  static 可以修饰 属性，方法 ，代码块，内部类
 *
 *  static 修饰属性:(称之为静态属性，或者类变量)
 *      属性：按照是否使用 static 修饰分为两类 ： 静态属性(静态变量) vs 非静态属性(实例变量)
 *          实例变量: 我们创建了一个类的多个对象，每个对象都拥有一套非静态的属性，
 *                      修改各自的费静态属性，不会影响其他对象的属性值
 *          静态变量: 我们创建了一个类的多个对象，多个对象共享一个静态变量，当某一个对象修改了静态变量的值，
 *                      其他对象来调用静态变量的值，是修改后的
 *
 *      static 修饰属性的其他说明：
 *          静态变量随着类的加载而加载的，可以通过 类名.静态属性 的方式，进行调用
 *          静态变量的创建早于对象的创建
 *          由于类只加载一次，所以静态变量在内存中也只有一份，存在于 方法区的 静态域中
 *              类变量    实例变量
 *          类   yes       no
 *          对象 yes       yes
 *
 *      静态类型举例:System.out Math.PI
 *
 *  static 修饰方法 静态方法
 *      随着类的加载而加载，可以通过 类名.静态方法 的形式来调用
 *              类方法     实例方法
 *         类    yes       no
 *         对象  yes        yes
 *
 *      静态方法中，只能调用静态的属性和方法
 *      非静态方法中，可以调用静态和非静态的属性和方法
 *
 *  static的 注意点
 *      在静态方法中，不能使用this super关键字
 *      关于静态属性和静态方法的使用，我们可以从生命周期去讨论
 *
 *   开发中，如何确定一个变量是否需要使用static来修饰呢？
 *      类中的常量是static的
 *      类中的属性是可以被多个对象共享，不会随着对象的不同而不同
 *
 *    开发中，如何确定一个方法是否需要使用static来修饰呢？
 *      操作静态属性的方法，通常定义为static的
 *      工具类中的方法，也可以用static来修饰，比如Arrays.toString()等
 */
public class StaticTest {

    /** 运行结果
     cna
     中国人吃大米
     name :姚明,age : 25
     name=姚明
     cna
     **********
     我是一个中国人
     cna
     */
    public static void main(String[] args) {
        Chinese.nation = "中国";

        Chinese chinese = new Chinese();
        chinese.name = "姚明";
        chinese.age = 25;
        chinese.nation = "chn";

        Chinese chi = new Chinese();
        chi.name = "姚明";
        chi.age = 25;
        chi.nation = "cna";

        System.out.println(Chinese.nation);// 结果为 cna
        //编译不通过
//        Chinese.name = "ASDF";
        chi.eat();
        System.out.println("**********");
        chinese.show();

    }
}

class Chinese {

    String name;
    int age;
    static String nation;


    public void eat(){
        System.out.println("中国人吃大米");
        //调用非静态结构
        this.info();
        System.out.println("name=" +name );

        //调用静态结构
        walk();
        System.out.println(Chinese.nation);
    }

    public static void show(){
        System.out.println("我是一个中国人");
        //不能调用非静态结构
//        eat();
//        name = "mm";
        //可以调用静态结构
        System.out.println(Chinese.nation);
    }

    public void info(){
        System.out.println("name :" + name +",age : " + age);
    }

    public static void walk() {

    }


}










