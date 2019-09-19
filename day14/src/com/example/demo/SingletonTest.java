package com.example.demo;

/**
 *  单例设计模式
 *      单例设计模式指的就是:采取一定的方法和措施，保证整个系统中 某个类的对象只有一个，不存在多个
 *
 *  如何实现:
 *      懒汉式 VS 饿汉式
 *
 *  区分 懒汉式 和 饿汉式
 *      （懒汉式:比较懒，要用的时候采取创建对象 ）
 *      （饿汉式:因为很饿，所以一上来就创建对象 ）
 *
 *      懒汉式:
 *          好处: 延迟对象的创建
 *          目前的写法存在坏处: 线程不安全
 *      饿汉式:
 *          好处: 线程安全
 *          坏处: 加载时间过长
 */
public class SingletonTest {

    public static void main(String[] args) {
        //Bank bank = new Bank();  //构造器被私有化了，所以不能直接创建对象
        Bank bank1  = Bank.getInstance();
        Bank bank2  = Bank.getInstance();
        System.out.println(bank1 == bank2); // 结果为: true 表明两个对象是一样的
    }
}

// 饿汉式

class  Bank {

    // 1 私有化类的构造器，使其不能通过 new 方式来进行 创建对象
    private Bank(){

    }

    // 2 内部创建类的对象，要求是static的 ，因为是 饿汉式，所以一上来就创建对象
    // 4 为什么 instance 是static 和 private 的 ？静态的方法只能调用静态属性 ，所以由 static 修饰，
    // 这个对象是private 不能是 public ，如果是public 就不能满足是单例的了

    private static Bank instance = new Bank();

    // 3 提供公共的静态方法，用于返回类的对象
    public static Bank getInstance (){
        return instance;
    }

}








