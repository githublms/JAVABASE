package com.example.demo;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author lms
 * @create 2019-08-28 14:17
 */
public class ScannerTest {
    /**
     * 使用Scanner 从键盘上获取输入的值
     * Scanner 的使用步骤和方法
     * 1 导入Scanner包，此包位于java.util.Scanner
     * 2 获取Scanner的一个实例 ，使用 Scanner scan = new Scanner(System.in);
        public Scanner(InputStream source) { //调用的构造器源码是：
            this(new InputStreamReader(source), WHITESPACE_PATTERN);
        }
     * 3 通过调用对象的next() 或者nextXXX()方法，来获取从键盘上输入的值
     *      如果输入的类型与要获取的类型不匹配就会报异常：java.util.InputMismatchException
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int  num  = scanner.nextInt();
        System.out.println("你输入的整数是:" + num) ;

        System.out.println("请输入一个姓名:");
        String  name = scanner.next();
        System.out.println("你输入的名字是：" + name);


        System.out.println("请输入一个分数:");
        double score = scanner.nextDouble();
        System.out.println("你输入的分数是：" + score);

        System.out.println("请输入一个boolean类型的变量");
        boolean bool = scanner.nextBoolean();
        System.out.println("你输入的Boolean类型的变量是:" + bool);

        //Scanner 只能获取字符串，没有提供获取字符的相关方法
        System.out.println("请输入你的性别");
        String sex = scanner.next();
        char gender = sex.charAt(0);
        System.out.println("你获取的到的第一个字符是:" + gender);

        System.out.println("请输入连续的数据");
        while (scanner.hasNext()){
            System.out.println("你输入的数据是:" + scanner.next());
            if (scanner.next().equals("20")) {
                break;
            }
        }
    }

}
