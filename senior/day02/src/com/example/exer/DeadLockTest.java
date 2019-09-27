package com.example.exer;

/**
 *  死锁的测试
 *
 *  死锁:
 *      含有锁，所以使用synchronzied 关键字 在同步的时候，没有处理好
 *      含有死，因为都想要对方的资源，又没有谁先给出，所以造成了线程的相互等待的情况，也就是死锁
 *
 */
public class DeadLockTest {

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        new Thread(){
            @Override
            public void run() {
                synchronized (sb1){
                    sb1.append(1);
                    sb2.append("a");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (sb2){
                        sb1.append(2);
                        sb2.append("b");
                    }

                    System.out.println(sb1);
                    System.out.println(sb2);
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                synchronized (sb2){
                    sb1.append(3);
                    sb2.append("c");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (sb1){
                        sb1.append(4);
                        sb2.append("d");
                    }
                    System.out.println(sb1);
                    System.out.println(sb2);
                }


            }
        }.start();
    }
}
