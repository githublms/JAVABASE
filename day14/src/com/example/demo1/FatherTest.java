package com.example.demo1;

/**
 7777777777777777

 11111111111111111 -- >> 父类静态代码块
 44444444444444  -- >> 子类静态代码块

 222222222222222222  -- >> 父类非静态代码块
 333333333333333333 -- >> 父类构造器

 55555555555555     --》》 子类非静态代码块
 666666666666666    --》》 子类构造器


 222222222222222222
 333333333333333333
 55555555555555
 666666666666666
 */
//执行顺序是: 由父即子 静态优先   静态代码块--》》非静态代码块 -- 》》 构造器
public class FatherTest {
    public static void main(String[] args) {

        System.out.println("7777777777777777");
        new Son();
        System.out.println();
        new Son();
    }
}


class Father {

    static {
        System.out.println("11111111111111111");
    }
    {
        System.out.println("222222222222222222");
    }
    public Father(){
        System.out.println("333333333333333333");
    }
}

class Son extends Father {
    static {
        System.out.println("44444444444444");
    }
    {
        System.out.println("55555555555555");
    }
    public Son(){
        System.out.println("666666666666666");
    }
}

