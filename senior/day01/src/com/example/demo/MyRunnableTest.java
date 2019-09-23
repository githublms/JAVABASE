package com.example.demo;

/**
 *  线程的创建方式二: 实现 Runnable 接口
 *  步骤:
 *      1 创建一个类，使其实现 Runnable 接口，
 *      2 使实现类去实现Runnable中的run（）
 *      3 创建实现类的对象
 *      4 将此对象传入Thread的构造器中，创建Thread的对象
 *      5 通过Thread 对象，调用 start() 启动线程
 *
 *  比较两种线程方式:
 *      开发中，优先选择，实现Runnable的方式
 *      原因是:
 *          实现的方式没有类 单继承的局限性
 *          实现的方式更适合用来处理多个线程有共享数据的情况
 *
 *  两种创建线程方式的联系：
 *      public class Thread implements Runnable {}
 *      两种方式都需要重写 run() ,将线程需要执行的操作声明在 run() 中
 */
public class MyRunnableTest {
    public static void main(String[] args) {

        //3 创建实现类的对象
        MyRunnable myRunnable = new MyRunnable();
        //4 将此对象传入Thread的构造器中，创建Thread的对象
        Thread thread = new Thread(myRunnable);
        thread.setName("线程1");
        //5. 通过Thread类的对象调用start():① 启动线程 ②调用当前线程的run()-->调用了Runnable类型的target的run()
        thread.start();

        Thread thread2 = new Thread(myRunnable);
        thread2.setName("线程2");
        //5 通过Thread 对象，调用 start() 启动线程
        thread2.start();
    }
}

//1 创建一个类，使其实现 Runnable 接口
class MyRunnable implements Runnable{

    //2 使实现类去实现Runnable中的run（）
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() +  ":" + i);
        }
    }
}