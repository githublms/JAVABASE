package com.example.demo1;

/**
 运行结果:
 Root的静态代码块
 Mid的静态代码块
 Leaf的静态初始化块

 Root的普通代码块
 Root的无参构造器
 Mid的普通代码块
 Mid的无参构造器
 Mid的有参构造器，参数是：尚硅谷
 Leaf的普通初始化块
 Leaf 的构造器
 *********************
 Root的普通代码块
 Root的无参构造器
 Mid的普通代码块
 Mid的无参构造器
 Mid的有参构造器，参数是：尚硅谷
 Leaf的普通初始化块
 Leaf 的构造器
 */

//总结: 由父即子 ,静态先行 也可以看出，非静态代码块的执行早于构造器

public class LeafTest {
    public static void main(String[] args) {
        new Leaf();
        System.out.println("*********************");
        new Leaf();

    }
}
class Root {

    static {
        System.out.println("Root的静态代码块");
    }
    {
        System.out.println("Root的普通代码块");
    }
    public Root() {
        System.out.println("Root的无参构造器");
    }
}

class Mid extends Root {

    static {
        System.out.println("Mid的静态代码块");
    }
    {
        System.out.println("Mid的普通代码块");
    }
    public Mid(){
        super();
        System.out.println("Mid的无参构造器");
    }
    public Mid(String msg){
        this();
        System.out.println("Mid的有参构造器，参数是：" + msg);
    }
}

class Leaf  extends Mid {
    static{
        System.out.println("Leaf的静态初始化块");
    }
    {
        System.out.println("Leaf的普通初始化块");
    }

    public Leaf(){
        super("尚硅谷");
        System.out.println("Leaf 的构造器");
    }
}

