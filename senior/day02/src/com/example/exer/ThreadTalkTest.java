package com.example.exer;

/**
 *  线程通信的实例 两个线程交替打印 1-100
 *
 *  这个实例涉及到的方法：wait notify notifyAll
 *
 *  wait:一旦执行这个方法，这个线程会进入阻塞状态，并释放锁
 *  notify ：一旦执行这个方法，会唤醒线程，如果有多个线程，则唤醒优先级最高的那个线程
 *  notifyAll: 唤醒所有的线程
 *
 *  使用说明
 *      wait notify notifyAll 这三个方法声明在java.lang.Object 类中
 *      wait notify notifyAll 这三个方法只能在同步代码块或者同步方法中被调用
 *      wait notify notifyAll 这三个方法的调用者是同步方法或者同步代码块的锁
 *
 *  面试题：wait 和 sleep 的比较
 *      相同点:调用这两个方法，会使线程进入阻塞状态
 *      不同点：
 *          两个方法的声明位置不一样: wait 是在java.lang.Object 中 sleep 是在 java.lang.Thread中
 *          调用场景不一样:sleep 在任何有需要的地方都可以被调用，wait 只能自同步方法或者同步代码块中被调用
 *          是否释放锁:在同步方法或者同步代码块中调用sleep 和 wait 方法 ，sleep 不会释放锁，wait 会释放锁
 */
public class ThreadTalkTest {
    public static void main(String[] args) {
        ThreadTalk talk = new ThreadTalk();
        Thread thread1 = new Thread(talk);
        Thread thread2 = new Thread(talk);

        thread1.setName("线程1");
        thread2.setName("线程2");

        thread1.start();
        thread2.start();


    }
}

class ThreadTalk  implements Runnable{

    int num = 1;
    Dog dog = new Dog();
    @Override
    public void run() {
        while (true){
            synchronized (dog){
                dog.notify();

                if (num < 100 ){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "-正在执行,num=" + num);
                    num++;

                    try {
                        dog.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else {
                    break;
                }


            }
        }


    }
}

class Dog {

}