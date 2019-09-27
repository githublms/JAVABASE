package com.example.exer;

import java.util.concurrent.locks.ReentrantLock;

/**
 *  使用 Lock 的方式来处理 线程安全问题
 *  Lock 和 同步方式的比较
 *      相同点是: 都可以解决线程安全问题
 *      不同点是: Lock 需要手动来启动锁，执行完同步代码之后，也需要手动释放锁
 *              synchronized 方式在执行完同步代码块之后，会自动释放锁
 *
 *  使用顺序 lock 》 同步代码块 》 同步方法
 */
public class LockTest {
    public static void main(String[] args) {
        Window2 window2 = new Window2();

        Thread thread1 = new Thread(window2);
        Thread thread2 = new Thread(window2);
        Thread thread3 = new Thread(window2);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Window2 implements Runnable{

    private int ticket = 100 ;

    ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            try {
                reentrantLock.lock();
                if (ticket > 0 ){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-正在卖票，票号为:" + ticket);
                    ticket--;
                }else{
                    break;
                }
            }finally {
                reentrantLock.unlock();
            }



        }
    }
}

































