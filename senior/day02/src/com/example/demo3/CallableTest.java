package com.example.demo3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *  创建线程的方式三： jdk 1.5 新增  实现 Callable 接口
 *
 *  为什么说 使用Callable 接口的方式比 实现Runnable 的方式更加强大呢？
 *      原因如下：
 *          Callable 有返回值，可以抛出异常，calllable 支持泛型
 *
 *  Runnable 和 Callable 的相互联系
 *
 *      public class FutureTask<V> implements RunnableFuture<V> { }
 *
 *      public FutureTask(Runnable runnable, V result) {
             this.callable = Executors.callable(runnable, result);
             this.state = NEW;       // ensure visibility of callable
        }
         public FutureTask(Callable<V> callable) {
             if (callable == null)
             throw new NullPointerException();
             this.callable = callable;
             this.state = NEW;       // ensure visibility of callable
         }
 */
public class CallableTest {
    public static void main(String[] args) {

        //创建ThreadNew 的实例对象
        ThreadNew threadNew = new ThreadNew();

        // 将此Callable接口实现类的对象作为传递到FutureTask构造器中，创建FutureTask的对象
        FutureTask futureTask = new FutureTask(threadNew);
        //.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
        new Thread(futureTask).start();

        //获取返回值
        try {
            Object sum =  futureTask.get();
            System.out.println("总和是:" + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

// 类实现Callable 接口
class ThreadNew  implements Callable{

    int sum = 0;
    // 重写call 方法
    @Override
    public Object call() throws Exception {

        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}




































