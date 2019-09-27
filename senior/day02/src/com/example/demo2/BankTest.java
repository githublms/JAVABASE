package com.example.demo2;

/**
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2 );


    }

}

class Bank {

    private Bank(){

    }

    public static Bank instance = null;

//    public synchronized static Bank getInstance(){
//    public static Bank getInstance(){
//        if (instance == null){ // 效率稍高
//            synchronized (Bank.class) {
//                instance = new Bank();
//            }
//        }
//        return instance;
//    }

    public static Bank getInstance(){
        synchronized (Bank.class){ //效率稍差
            if (instance == null){
                instance = new Bank();
            }
        }
        return instance;
    }

}

