package com.example.exer;

//考查多态的一道笔试题目：
public class InterviewTest {
    public static void main(String[] args) {

        //输出结果：
        // sub1  -- 》》 多态性，编译看左边，运行看右边，int ... arr 与 int[] arr 一致
        // sub2  -- 》》 子类调用方法，有具体的参数就调用具体的参数，没有在是调用可变形参
        Base1 base1 = new Sub1();
        base1.add(1,2,3); //sub1

        Sub1 sub1 = (Sub1) base1;
        sub1.add(1,2,3);// sub2

        sub1.add(1,new int[]{1,2}); //sub1 子类对象调用自己的方法
    }
}

class Base1 {
    public void add(int a ,int... arr){
        System.out.println("base1");
    }
}

class  Sub1 extends  Base1{
    public void add(int a , int[] arr){
        System.out.println("sub1");
    }
    public void add (int a ,int b ,int c){
        System.out.println("sub2");
    }
}







