package com.example.exer;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *  多线程的创建方式三: jdk 1.5 实现Callable方式
 *
 *  Callable 可以有返回值，支持泛型，可以抛出异常
 *
 *  结合FutrureTask 来使用
 *
 */
public class ThreadNewTest {
    public static void main(String[] args) {
        ThreadNew threadNew = new ThreadNew();
        FutureTask task = new FutureTask(threadNew);
        new Thread(task).start();

        try {
            Object sum = task.get();
            System.out.println("总和是:" + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}


class ThreadNew  implements Callable{

    int sum = 0;
    @Override
    public Object call() throws Exception {
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}




















