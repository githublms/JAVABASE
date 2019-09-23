package com.example.demo2;


/**
 进入方法A
 a方法的finally
 制造了一个异常
 进入方法B
 调用方法B的finally
 */
public class ReturnExceptionDemo {

    public static void main(String[] args) {

        try {
            methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        methodB();
    }

    public static void methodA() throws Exception {
        try {
            System.out.println("进入方法A");
            throw new Exception("制造了一个异常");
        }finally {
            System.out.println("a方法的finally");
        }
    }

    public static void  methodB(){
        try {
            System.out.println("进入方法B");
            return;
        }finally {
            System.out.println("调用方法B的finally");
        }
    }
}
