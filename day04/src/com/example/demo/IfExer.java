package com.example.demo;

import org.junit.Test;

/**
 * @author lms
 * @create 2019-08-28 18:34
 */
public class IfExer {

    //如何获取一个随机数的值，范围 (10 -99]
    @Test
    public void test2(){
        double random = Math.random();
        System.out.println("math工具类自己产生的随机数是:" + random); // 0.661454176130717

        //  (0.0 ,1.0] -->>(0.0,90.0] -->>  (10.0 ,100.0] -->> (10,99]
        // int num = (int) (Math.random() * (b-a + 1)) + a   === [a,b]

        int a = 10,b = 100;
        int num5 = (int) (Math.random() * ( b - a + 1)) + a ;
        System.out.println("通过公式产生的随机数:" + num5);
    }


    public static void main(String[] args) {

        int x = 4;
        int y = 1;
        if (x > 2)
            if (y > 2)
                System.out.println("x+y=" + x+y);
            else //采取就近原则
                System.out.println("x is " + x);
        int dogAge = 6;
        if (dogAge > 0 && dogAge < 2){
            System.out.println("相当于人类的年龄" + dogAge * 10.5);
        }else if (dogAge > 2 ){
            System.out.println("相当于人类年龄的" + dogAge * 20);
        }else{
            System.out.println("狗狗还没有出生呢");
        }

    }


}
