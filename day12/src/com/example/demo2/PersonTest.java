package com.example.demo2;

/**
 *  面向对象特征: 多态性
 *
 *  理解: 一种事物的多种形态
 *
 *  何为多态性：(指的是对象的多态性)
 *      对象的多态性：父类引用指向子类对象(或者子类对象赋值给父类引用)
 *      举例: A 是 B 的父类 对象的多态性体现--》》 A a = new B();
 *
 *  多态的使用：(虚拟方法的调用)
 *      有了对象的多态性以后，我们编译看左边，运行看右边
 *      编译看左边：创建的对象a为父类A的实例 ，这个对象属于 A 类型
 *      运行看右边: 对象.重写方法，表面上看是执行父类中被重写的方法，实际上是子类的重写方法
 *      因此有了一句总结的话： 编译看左边，执行看右边
 *
 *  多态性的适用前提:
 *      一: A 与 B 有继承关系 ，二: 重写方法
 *
 *  对象的多态性只适用于方法，不适用属性(属性是编译和运行都要看左边)
 */
public class PersonTest {

    public static void main(String[] args) {
        System.out.println("*******没有调用多态性之前*******");
        Person person = new Person();
        person.eat(); //人吃饭 调用的是Person 类中的方法
        person.walk();//人走路 调用的是Person 类中的方法

        Man man = new Man();
        man.earnMoney(); //男人负责挣钱养家
        man.eat(); // 男人要多吃肉，涨肌肉
        System.out.println("*******没有调用多态性之前*******");

        System.out.println("================");

        System.out.println("*******调用多态性之后*******");

        Person per = new Man();

        //当创建了父类对象，调用了父类中被重写的方法，实际上执行的是子类重写父类的方法 --》》 称之为虚拟方法的调用

        per.walk();//男人霸气的走路
        per.eat();//男人要多吃肉，涨肌肉

        //创建的这个对象的类型还是父类的 ，父类中没有 earnMoney()这个方法，因此无法调用
//        per.earnMoney();

        //对象的多态性，只对方法有用，对属性无效，因此输出结果仍然为 1001
        System.out.println(per.id);//1001
        System.out.println("*******调用多态性之后*******");
    }
}
