package com.example.demo3;

import jdk.nashorn.internal.ir.IfNode;

/**
 *  线程通信的应用：经典例题：生产者/消费者问题
 *
 *  生产者将产品交给店员 ，店员将产品交给消费者
 *  店员一次只能持有固定数量的产品 （最少0个，最多20个）
 *      如果店员手中的产品 大于20个 那么店员通知 生产者 暂停生产 ，并且会通知消费者来消费产品
 *      如果店员手中的产品 小于0个，那么店员通知生产者继续生产，并且会通知消费者等一下再来消费产品
 *
 *  分析这个案例
 *      是否是多线程问题? 是，生产者线程和消费者线程
 *      是否存在共享数据？ 店员或者店员手中的产品
 *      怎样解决线程的安全问题? 采用同步机制，有三种(锁，同步方法，同步代码块)
 *      是否涉及线程的通信？ 是
 *
 */
public class ProConTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Productor productor = new Productor(clerk);
        productor.setName("生产者");
        Consumer consumer = new Consumer(clerk);
        consumer.setName("消费者");

        productor.start();
        consumer.start();
    }
}

class Clerk {

    int product = 0;
    //生产者生产产品
    public synchronized void produceProduct(){
        if (product < 20 ){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            product++;
            System.out.println(Thread.currentThread().getName() + "-正在生产产品,产品编号为:" +product );
            notify();
        }else{
            try {
                //等待
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumerProduct (){
        if (product > 0 ){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在消费" + product +"个产品");
            product--;
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}

class Productor  extends Thread{

    private Clerk clerk ;

    public Productor(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }

    }
}


class Consumer  extends Thread {

    private Clerk clerk ;
    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumerProduct();
        }
    }
}











