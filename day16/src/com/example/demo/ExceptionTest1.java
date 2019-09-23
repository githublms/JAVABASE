package com.example.demo;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *  异常处理: 抓抛模型
 *
 *  抛: 程序在运行过程中，有可能出现异常，
 *      一旦出现异常，就会在异常代码处产生一个异常类的对象，并将此异常类的对象抛出
 *
 *      关于异常对象的产生:
 *          系统自动生成的异常对象
 *          手动的生成异常对象，并抛出 throw
 *
 *  抓: 可以理解为异常的处理方式， 有两种方式 try -catch -finally 和 throws
 *
 * try-catch-finaly
 *     try{
 * 		//可能出现异常的代码
 *
 * }catch(异常类型1 变量名1){
 * 		//处理异常的方式1
 * }catch(异常类型2 变量名2){
 * 		//处理异常的方式2
 * }catch(异常类型3 变量名3){
 * 		//处理异常的方式3
 * }
 * ....
 * finally{
 * 		//一定会执行的代码
 * }
 *
 *  说明 ：
 *      1 finally 是可选的
 *      2 使用try 将可能出现异常的代码包装起来，在执行过程中，一旦出现了异常，就会生成一个异常类对象，根据此对象的异常类型，
 *      去catch中匹配，一旦与catch中的某一个匹配成功后，就会进入该catch 中进行处理，
 *      一旦处理完成（在没有写finally的情况），就会继续执行后续代码，
 *          如果有finally,就不会继续执行后续代码
 *      3 catch 中的异常类型，如果没有子父类关系，谁上谁下并无关系
 *      4 catch 中的异常类型，如果满足子父类关系，那么子类就必须在父类上面，否则报错
 *
 *      5 try 结构中声明的变量，出了try之后，就不能再被调用了
 *
 *      6 try-catch -finally 结构是可以相互嵌套的
 *
 *  使用体会:
 *
 *      使用try- catch -finally 结构处理编译时异常，使得程序在编译时不在报错，但是在运行时，仍有可能报错。
 *      这样操作，相当于将编译时异常延迟到运行时异常
 *
 *      开发中，由于运行时比较常见，所以我们通常就不针对运行时异常编写try-catch-finally了。
 *      但是针对编译时异常，我们就一定要使用try -catch -finally 进行处理
 */
public class ExceptionTest1 {

    //java.io.FileNotFoundException: hello.txt (系统找不到指定的文件。)
    @Test
    public void test2(){
        try{
            File file = new File("hello.txt");
            FileInputStream fis = new FileInputStream(file);

            int data = fis.read();
            while(data != -1){
                System.out.print((char)data);
                data = fis.read();
            }

            fis.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     String string = "ABC"; 的运行结果:
     出现了数字转换异常
     0
     hello - 2

     string = "123"; 的运行结果  --》》 处理了异常，程序继续执行后面的代码
     hello - 1
     123
     hello - 2
     */
    @Test
    public void test1(){
        String string = "ABC";
//        string = "123";
        int num = 0;
        try {
            num = Integer.parseInt(string);
            System.out.println("hello - 1");
        }catch (NumberFormatException e){
            System.out.println("出现了数字转换异常");
        } catch (NullPointerException e){
            System.out.println("出现了空指针异常");
        } catch (Exception e){
            System.out.println("出现了异常");
        }

        System.out.println(num);
        System.out.println("hello - 2");

    }
}
