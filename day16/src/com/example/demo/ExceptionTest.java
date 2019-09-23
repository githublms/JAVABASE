package com.example.demo;

import org.junit.Test;

import java.util.Date;

/**
 *  java 异常体系结构
 *  java.lang.Throwable
 *      -->> java.lang.Error: 错误，一般不编写针对性的代码进行处理
 *      -->> java.lang.Exception: 异常：
 *          -->> 编译时异常（checked）
 *              -->> IOException
 *                      FileNotFoundException
 *              -->> ClassNotFoundException
 *          -->> 运行时异常（unchecked / RuntimeException） 也叫运行异常
 *              -->> NullPointException
 *              -->> ArrayIndexOutOfBoundException
 *              -->> ClassCastException
 *              -->> NumberFormatException
 *              -->> InputMisMatchException
 *              -->> ArithmeticException
 *
 *   异常体系分为Error 和Exception
 *      Exception 又分为 编译时异常和运行时异常 举例如下：
 *
 *    面试题：常见的异常都有哪些？举例说明
 */
public class ExceptionTest {

    //测试编译时异常 -- ClassNotFoundException
    @Test
    public void test1(){
//        Object object = new Person(); //找不到这个类，所以报异常
//        System.out.println(object);
    }

    //测试 java.lang.NullPointerException
    @Test
    public void test2(){
        String str = null;
        System.out.println(str.toString());
    }

    //java.lang.ArrayIndexOutOfBoundsException: 6
    @Test
    public void test3(){
        int[] arr = new int[5];
        System.out.println(arr[6]);
    }

    //java.lang.ClassCastException: java.util.Date cannot be cast to java.lang.String
    @Test
    public void test4(){
        Object object = new Date();
        String string = (String) object;
    }

    //ava.lang.NumberFormatException: For input string: "12abc"
    @Test
    public void test5(){
        String string = "12abc";
        int num = Integer.parseInt(string);
    }

    //java.lang.ArithmeticException: / by zero
    @Test
    public void test6(){
        int num = 5/0;
    }

}
