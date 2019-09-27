package com.example.demo2;

import java.util.concurrent.locks.ReentrantLock;

/**
 *  解决线程安全的方式三 使用 Lock锁  jdk 1.5 新增
 *
 *  使用 Lock 锁和使用 同步机制来解决线程安全问题，有什么不同？
 *
 *  相同：
 *      两种方式都能解决线程安全问题
 *  不同：
 *      synchronized 方式执行完同步代码块后，会自动的释放同步监视器(锁)，
 *      Lock需要手动的启动同步（lock()），同时结束同步也需要手动的实现（unlock()）
 *
 *  优先使用顺序：
 *      Lock  同步代码块（已经进入了方法体，分配了相应资源）  同步方法（在方法体之外）
 *
 */
public class LockTest {
    public static void main(String[] args) {
        Window window = new Window();

        Thread thread1 = new Thread(window);
        Thread thread2 = new Thread(window);
        Thread thread3  = new Thread(window);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();


    }
}

//使用Lock的方式来启动，关闭锁
class Window implements Runnable{

    private int ticket = 100;

    private ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            try {
                reentrantLock.lock();

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (ticket > 0 ){
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