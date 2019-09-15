package com.example.test;

/**
 我想嫁给小张
 我不想娶小红为妻子
 ==========================
 我想嫁给小张
 我愿意娶小何为妻
 */
public class WomanTest {

    public static void main(String[] args) {
        Man man = new Man("小张",25);
        Woman woman = new Woman("小红",26);
        woman.marry(man);
        System.out.println("==========================");
        Woman woman1 = new Woman("小何",26);
        woman1.marry(man);
    }
}
