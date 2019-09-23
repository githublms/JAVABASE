package com.example.demo;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *  Finally 的使用
 *
 *  finally 是可选的
 *
 *  finally 中声明的代码是一定要执行的，即使try中 和 catch 中有return 语句，仍然需要执行
 *
 *  像数据库连接，输入输出流，网络编程socket 等资源，这些资源JVM 是不能回收的，
 *  我们需要手动的进行对这些资源的释放，此时的释放就必须放在 finally中
 *
 */
public class FinallyTest {


    /**
     * 运行结果
     出现了 数组下标越界
     我一定会执行的
     3
     */

    @Test
    public void testMethod(){
        int num = method();
        System.out.println(num);

    }
    public int method() {
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1 ;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("出现了 数组下标越界");
            return 2 ;
        } finally { // finally 中的代码一定会被执行的，无论try 和 catch 中有return，根据执行顺序，执行return
            System.out.println("我一定会执行的");
            return 3 ;
        }
    }


    // 运行结果
    //出现了算术异常
    //一定要执行的代码
    // java.lang.ArrayIndexOutOfBoundsException: 6
    @Test
    public void test1(){
        int a = 10 ;
        int b = 0 ;
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("出现了算术异常");
            int[] arr = new int[5];
            System.out.println(arr[6]); // 这里没有对异常进行处理，所以不能继续往下执行
        }catch (Exception e){
            System.out.println("出现了异常");
        }
        finally { // finally 一定要执行的代码
            System.out.println("一定要执行的代码");
        }
        System.out.println("我好帅啊");

    }

    //java.io.FileNotFoundException: hello1.txt (系统找不到指定的文件。)
    @Test
    public void test2(){
        FileInputStream fis = null;
        try {
            File file = new File("hello1.txt");
            fis = new FileInputStream(file);

            int data = fis.read();
            while(data != -1){
                System.out.print((char)data);
                data = fis.read();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
