package com.example.demo2;

/**
 * 使用同步代码块的方式来解决继承Thread产生的线程安全问题
 */
public class ThreadLockTest {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();

        myThread1.setName("窗口1");
        myThread2.setName("窗口2");
        myThread3.setName("窗口3");

        myThread1.start();
        myThread2.start();
        myThread3.start();




    }
}

class MyThread extends Thread {
    public int ticket = 100 ;

    @Override
    public void run() {
        while (true){
//           synchronized(this){ // 同步代码块中使用this 不合适，这样多个线程用的不是同一把锁
            synchronized (MyThread.class){
              if (ticket > 0 ){
                  System.out.println(Thread.currentThread().getName() + "-正在卖票,票号为:" + ticket );
                  ticket--;
                }else{
                    break;
                }
            }
        }
    }
}

//同步方法来解决线程安全问题
class MyThread1 extends Thread {

    private int ticket = 100 ;

    @Override
    public void run() {
        while (true){
            show();
        }
    }

    public synchronized static void show(){

    }

}