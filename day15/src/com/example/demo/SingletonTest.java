package com.example.demo;

/**
 *  单例模式 -->> 简化版
 *  使用final来修饰 static final 全局常量
 *
 *  使用static 来修饰这个变量，这个变量在内存中只加载一次，但是他的值是可以改变的，可以在静态代码块中对其值重新赋值为null
 *  我明明想要的就是这个Bank 这个对象，不是 null ，所以我们要加上final，使其不能修改他的值，我们要的是对象
 *
 */
public class SingletonTest {

    public static void main(String[] args) {

        Bank bank1 = Bank.instance;
        Bank bank2 = Bank.instance;
        System.out.println(bank1 == bank2); // 结果为 true
    }
}

class Bank {

    private Bank(){

    }

    public static final Bank instance = new Bank();
    static  {
//        instance = null; // 当没有final修饰的时候成立
    }
}