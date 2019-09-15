package com.example.exer;

/**
 * @author lms
 * @create 2019-09-12 15:15
 */
public class BoyGirlTest {

    public static void main(String[] args) {
        Boy boy = new Boy("梁山伯",25);
        boy.shut(); //运行结果是--》》 你可以去结婚登记了
        Girl girl = new Girl("祝英台",16);
        boy.marry(girl); //运行结果是--》》 我想娶祝英台
        System.out.println("***********");
        girl.marry(boy); //运行结果是--》》我想嫁给梁山伯  我想娶祝英台

        //分析:girl.marry(boy)  女的想嫁给男的，需要知道男方的意思，
        // 因此:调用男方的方法，来回复女生 boy.marry(this); ，所以最后的结果如上

    }
}
