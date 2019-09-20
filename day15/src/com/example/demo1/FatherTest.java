package com.example.demo1;

/**
 *  当一个类实现了多个接口时，而每个接口中都有相同方法名的默认方法时，
 *  如何指定调用哪个接口中的哪个方法
 *      通过 接口名.super.方法名 实现对默认方法的调用
 */

/** 运行结果
 儿子，快来就妈妈
 老公，快来救我
 我应该救谁呢？

 */
public class FatherTest {
    public static void main(String[] args) {
        Father father = new Father();
        father.help();
        System.out.println("******************");
        Filial.method();//调用接口中的静态方法
    }
}

interface  Filial {//孝顺的
    public static void method(){
        System.out.println("静态方法");
    }
    public default void help(){
        System.out.println("儿子，快来就妈妈");
    }
}

interface Spoony {// 痴情的
    public default void help(){
        System.out.println("老公，快来救我");
    }
 }

 //实现类需要重写接口中的默认方法，才能正常，否则会造成接口冲突
class Father  implements  Spoony,Filial{

    @Override
    public void help() {
        Filial.super.help(); // 接口A 中的调用同名方法
        Spoony.super.help(); // 接口B 中的调用同名方法
        System.out.println("我应该救谁呢？");
    }
}
