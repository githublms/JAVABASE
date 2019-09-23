package com.example.demo;

/**
 *  测试Thread 中的常用方法
 * 1. start():启动当前线程；调用当前线程的run()
 * 2. run(): 通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 * 3. currentThread():静态方法，返回执行当前代码的线程
 * 4. getName():获取当前线程的名字
 * 5. setName():设置当前线程的名字
 * 6. yield():释放当前cpu的执行权
 * 7. join():在线程a中调用线程b的join(),此时线程a就进入阻塞状态，直到线程b完全执行完以后，线程a才
 *           结束阻塞状态。然后等待cpu分配，分配到了，才继续执行线程a中的逻辑
 * 8. stop():已过时。当执行此方法时，强制结束当前线程。
 * 9. sleep(long millitime):让当前线程“睡眠”指定的millitime毫秒。在指定的millitime毫秒时间内，当前
 *                          线程是阻塞状态。
 * 10. isAlive():判断当前线程是否存活
 *
 * 线程的优先级：
 * 1.
 * MAX_PRIORITY：10
 * MIN _PRIORITY：1
 * NORM_PRIORITY：5  -->默认优先级
 * 2.如何获取和设置当前线程的优先级：
 *   getPriority():获取线程的优先级
 *   setPriority(int p):设置线程的优先级
 *
 *   说明：高优先级的线程要抢占低优先级线程cpu的执行权。但是只是从概率上讲，高优先级的线程高概率的情况下
 *   被执行。并不意味着只有当高优先级的线程执行完以后，低优先级的线程才执行。
 *
 *
 */
public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread hello = new HelloThread();
        hello.setName("子线程");
        hello.setPriority(Thread.MAX_PRIORITY);
        hello.start();

        Thread.currentThread().setName("main");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "-" + Thread.currentThread().getPriority() + ":" + i);
            if (i == 5 ){
                try {
                    hello.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
class HelloThread extends Thread{


    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "-" + Thread.currentThread().getPriority() + ":" + i);
        }
    }
}