package com.example.demo;

/**
 *  main() 是一个程序的入口
 *  main() 也是一个静态的方法
 *  main() 可以作为与控制台交互的方式，之前使用的是Scanner ，这个请看MainDemo
 */
public class MainTest {
    public static void main(String[] args) { // 1 作为一个程序的入口
        Main.main(new String[20]); // 2 main 方法作为一个静态方法被调用

        MainTest test = new MainTest();
        test.show();
    }
    public void show(){

    }
}

class Main {
    //如果下面这个方法做为main，由于没有输入参数，所以什么也没有输出
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            args[i] = "args_" + i ;
            System.out.println(args[i]);
        }
    }
}

