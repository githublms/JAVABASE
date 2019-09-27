package com.example.demo3;

import java.util.concurrent.*;

/**
 *  创建线程的方式四: - 使用线程池 ，来创建线程
 *
 *  使用线程池的好处：
 *      可以减少线程的创建，不用每次都去创建
 *      重复利用线程，可以提高响应速度
 *      线程多了，便于线程管理
 *
 *  线程池主要关注以下几个参数
 *      核心线程数: corePoolSize
 *      最大的线程数:maxnuimPoolSize
 *      当线程池中的线程没有任务时，线程保持多长时间后终止: keepAliveTime
 */
public class PoolThreadTest {
    public static void main(String[] args) {

        //创建线程池
        ExecutorService service = Executors.newFixedThreadPool(10);

        //设置线程池的相关属性
        ThreadPoolExecutor pool = (ThreadPoolExecutor) service;
        pool.setCorePoolSize(15);
        pool.setKeepAliveTime(20, TimeUnit.DAYS);
        pool.setMaximumPoolSize(20);

        //执行线程池中的线程
        service.execute(new Number1()); // execute 执行的是runnable 接口
        service.execute(new Number2());

        //service.submit()   // <T> Future<T> submit(Callable<T> task); 执行的是Callable 接口

        //先吃池关闭
        service.shutdown();

    }

}
class Number1 implements Runnable{

    @Override
    public void run() {
        System.out.println("number1的线程被线程池利用了");
    }
}
class Number2 implements Runnable{

    @Override
    public void run() {
        System.out.println("number2的线程被线程池利用了");
    }
}