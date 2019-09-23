package com.example.exer;

/**
 * @author lms
 * @create 2019-09-23 15:54
 */
public class ThreadTest {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
        MyThread myThread = new MyThread();
        myThread.start();
    }

}

class MyThread  extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}