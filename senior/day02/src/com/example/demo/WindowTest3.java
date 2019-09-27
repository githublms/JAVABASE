package com.example.demo;

/**
 * 使用同步方法解决实现Runnable接口的线程安全问题
 *
 *  关于同步方法的总结：
 *  1. 同步方法仍然涉及到同步监视器，只是不需要我们显式的声明。
 *  2. 非静态的同步方法，同步监视器是：this
 *     静态的同步方法，同步监视器是：当前类本身
 *
 */
public class WindowTest3 {
    public static void main(String[] args) {
        Window3 window3 = new Window3();

        Thread thread1 = new Thread(window3);
        Thread thread2 = new Thread(window3);
        Thread thread3 = new Thread(window3);

        thread1.setName("窗口1");
        thread2.setName("窗口1");
        thread3.setName("窗口1");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

/** 普通方式运行的结果
 * 窗口1-正在卖票，票号为: 100
 窗口1-正在卖票，票号为: 100
 窗口1-正在卖票，票号为: 99
 */
class Window3 implements Runnable{

    private int ticket = 100;
    private static int num = 100;
    @Override
    public void run() {
        while (true){
//            show();
            display();
        }

    }
    public synchronized void show(){ //非静态方法 --》》 锁是this
        if (ticket > 0 ){
            System.out.println(Thread.currentThread().getName() + "-正在卖票，票号为: " + ticket);
            ticket--;
        }
    }
    public static synchronized void display(){ //静态方法的锁是当前类对象
        if (num > 0 ){
            System.out.println(Thread.currentThread().getName() + "-正在卖num，票号为: " + num);
            num--;
        }
    }

}
