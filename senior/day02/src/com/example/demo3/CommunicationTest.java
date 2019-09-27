package com.example.demo3;

/**
 *  线程通信的实例： 两个线程 ，交替打印1-100的数字
 *
 *  涉及到的三个方法:
 *      wait(): 执行这个方法，会使线程进入阻塞状态，并且释放同步监视器(锁)
 *      notify(): 执行这个方法，会唤醒等待中的线程，如果有多个线程，那么就唤醒优先级最高的线程
 *      notifyAll():执行这个方法，会唤醒所有等待的线程
 *  说明:
 *      wait notify notifyAll 三个方法必须使用在同步代码块或者同步方法中
 *      wait notify notifyAll 三个方法的调用者必须是同步代码块或者同步方法的锁 --同步监视器
 *       wait notify notifyAll 三个方法定义在java.lang.Object类中
 *
 *
 *  面试题：wait() 和 sleep() 中的比较
 *
 *      相同点:调用wait() 和 sleep() 都会使线程进入阻塞状态
 *      不同点:
 *          两个方法的声明位置不同。wait() 是在java.lang.Object类  sleep()  是在java.lang.Thread类中
 *          调用要求不同。 sleep 可以在任何需要的场景下使用 wait 必须要使用在同步方法 或者 同步代码块中
 *          是否释放锁？如果两个方法都在同步方法和同步代码块中使用，那么sleep 不会释放锁，wait 会释放锁
 */
public class CommunicationTest {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();
        Thread thread1 = new Thread(printNumber);
        Thread thread2 = new Thread(printNumber);

        thread1.setName("线程1");
        thread2.setName("线程2");

        thread1.start();
        thread2.start();
    }

}

class PrintNumber implements Runnable{

    private int num = 1;
//    Object object = new Object();
    @Override
    public void run() {
        while (true){
            synchronized(this){
//                object.notify();
                this.notify();
                if (num <= 100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "-正在执行,num为:" + num);
                    num++;

                    try {
//                        object.wait();
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }

            }
        }
    }
}