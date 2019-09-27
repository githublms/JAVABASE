package com.example.demo;

/**
 */
public class WindowTest2 {
    public static void main(String[] args) {
        Window2 window2 = new Window2();
        Thread thread1 = new Thread(window2);
        Thread thread2 = new Thread(window2);
        Thread thread3 = new Thread(window2);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();

    }

}

class Window2  implements Runnable{
    //    Object obj = new Object();
//    Dog dog = new Dog();
    private static int ticket = 100;
    @Override
    public void run() {
        while (true){
            //        Object obj = new Object();
            synchronized (this) {//此时的this:唯一的Window2的对象   //方式二：synchronized (dog) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "-正在卖票，票号为:" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}



















