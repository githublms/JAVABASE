package com.example.demo;

/**
 *  创建多线程的方式一: 继承于 Thread 类
 *  步骤:
 *      1 创建一个类A，这个类需要继承 Thread类
 *      2 重写Thread类中的 run()
 *      3 创建 线程子类A 的实例对象
 *      4 通过此子类对象来调用start() 来启动线程
 *
 *  实例:
 *      遍历100以内的所有偶数
 */

public class MyThreadTest {
    public static void main(String[] args) {
        // 创建线程子类的实例对象
        MyThread myThread = new MyThread();
        //调用线程对象的start（）
        // start() 两层作用: ① 启动线程 ② 调用当前线程的run()
        myThread.start();

        //问题一:我们可以直接调用run方法来启动线程吗？ 答案是不能
//        myThread.run(); //虽然也输出了结果，但是，他的线程名是 main 意味着 这是在main 中执行的程序
                        //相当于子类对象调用重写方法，并不是多线程

        //问题二：是否可以让同一个线程多次启动？答案是不能，让同一个线程去在同一时间执行，会报错。
        //myThread.start(); //Exception in thread "main" java.lang.IllegalThreadStateException
        //我们需要重新创建一个对象，然后启动线程
        MyThread myThread1 = new MyThread();
        myThread1.start();


        //如下的代码仍然在main线程中执行
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }

    }

}


// 创建一个类，使其继承与Thread 类
class MyThread  extends  Thread{

    //重写run 方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}














