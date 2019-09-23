package com.example.demo;

import javax.activation.MailcapCommandMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *  异常处理方式二: throws + 异常类型
 *  throws + 异常类型 写在方法的声明处 ，表明方法执行时，可能抛出的异常类型
 *  一旦方法体在执行时，出现了异常，就会在异常代码处产生一个异常类的对象，此对象满足throws后面的异常
 *  就会被抛出，异常代码后面的代码，就不会在执行
 *
 *  体会:
 *      try -catch -finally 是将异常处理掉了，
 *      而throws是将异常抛给方法的调用者，并没有真正的处理异常
 *
 *  开发中如何选择 try-catch-finally 还是throws？
 *      如果父类中被重写的方法没有被throws 方式处理异常，那么子类中的重写方法也不能 throws
 *      意味着，子类重写方法如果产生了异常，必须使用try-catch-finally 来处理异常
 *
 *      执行的方法a中，又调用了其他的几个方法，这几个方法是递进关系，我们建议这几个方法使用throws 的方式来处理异常
 *      而执行的方法a中，则使用 try-catch-finally来处理异常
 */
public class ExceptionTest2 {

    public static void main(String[] args) {
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }

        method3();
    }
    public static void  method3(){
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method2() throws IOException {
        method1();
    }

    public static void method1() throws IOException {
        File file = new File("hello1.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while(data != -1){
            System.out.print((char)data);
            data = fis.read();
        }

        fis.close();

        System.out.println("hahaha!");
    }

}
