package com.example.java2;

import com.example.java2.java3.Dog;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  package 的使用
 *      为了更好的实现项目，源码的管理，提供了包的概念
 *      声明package所在的类或接口，所属的包，声明在源文件的首行
 *      包，属于标识符，遵循标识符的命名规则
 *      没 . 一次，就是一层目录
 *  补充:
 *      在同一个包下面，不可以创建同名的类或者接口
 *      在不同的包下面，可以创建同名的类或者接口
 *
 *  import 的使用
 *      在源文件中使用import来显示的导入指定包下面的类或者接口
 *      声明在包和类之间，
 *      如果要导入多个包下面的内容，并列输出即可
 *      可以使用 xxx.* 的方式，可以直接导入 xxx包下面所有的类/接口
 *      如果使用的类是java.lang 下面的，则可以省略import结构
 *      在源文件中，导入不同包下面的同名的类，其中一个必须使用全类名（包名 + 类名）的方式，进行显示
 *      import static :导入指定包下面的指定静态结构，包括属性和方法
 */
public class PackageImportTest {

    public static void main(String[] args) {
        String info = Arrays.toString(new int[]{1,2,3}); //Arrays 是java.util下面的结构，需要导包
        System.out.println(info);//System是java.lang包下面的结构，直接省略import操作
        Scanner scanner = null;

        Dog dog = new Dog(); //com.example.java2.java3.Dog;
        com.example.java2.java3.Cat  cats = new com.example.java2.java3.Cat(); //全类名的形式，上面就不会导包
    }
}























