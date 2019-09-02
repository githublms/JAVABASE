package com.example.demo;

import org.junit.Test;


public class PrimeTest {

    @Test
    public void test1(){
        long start = System.currentTimeMillis();
        //遍历100以内的所有质数
        boolean flag = true;
        for (int i = 2; i <= 10000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0){ //如果 i 能够整除 j (余数为0) ，那么就不是质数
                    flag = false ;
                }
            }
            if (flag){
                System.out.println(i);
            }
            flag = true;
        }
        System.out.println("花费的时间是:" + (System.currentTimeMillis() - start));//183
    }

    @Test
    public void test2(){
        long start = System.currentTimeMillis();
        //遍历10000以内的所有质数
        boolean flag = true;
        for (int i = 2; i <= 10000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0){ //如果 i 能够整除 j (余数为0) ，那么就不是质数
                    flag = false ;
                    break;//优化一，对本身为非质数的自然数有效
                }
            }
            if (flag){
                System.out.println(i);
            }
            flag = true;
        }
        System.out.println("花费的时间是:" + (System.currentTimeMillis() - start));//37
    }

    @Test
    public void test3(){
        int count = 0;

        long start = System.currentTimeMillis();
        //遍历10000以内的所有质数
        boolean flag = true;
        for (int i = 2; i <= 10000; i++) {
            //优化二: 对本身是质数的自然数有效
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0){ //如果 i 能够整除 j (余数为0) ，那么就不是质数
                    flag = false ;
                    break;//优化一，对本身为非质数的自然数有效
                }
            }
            if (flag){
                System.out.println(i);
                count++;
            }
            flag = true;
        }
        System.out.println("count的个数是:" + count);
        System.out.println("花费的时间是:" + (System.currentTimeMillis() - start));//20
    }

    @Test
    public void test4() {
        long start = System.currentTimeMillis();
        int count = 0;
        //遍历10000以内的所有质数
        label:for (int i = 2; i <= 10000; i++) {
            //优化二: 对本身是质数的自然数有效
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0){ //如果 i 能够整除 j (余数为0) ，那么就不是质数
                    //break;//优化一，对本身为非质数的自然数有效
                    continue label;
                }
            }
            //能执行到下面的就一定是质数
            count++;
            System.out.println(i);
        }
        System.out.println("count的个数是:" + count);
        System.out.println("花费的时间是:" + (System.currentTimeMillis() - start));//20
    }

}
