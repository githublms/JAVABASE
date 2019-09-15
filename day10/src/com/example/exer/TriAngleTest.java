package com.example.exer;

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle();
        triAngle.setBase(15);
        triAngle.setHeight(46);
        System.out.println("base=" + triAngle.getBase() + ",height=" + triAngle.getHeight());

        TriAngle triAngle1 = new TriAngle(20,34);
        System.out.println("base=" + triAngle1.getBase() + ",height=" + triAngle1.getHeight());

    }
}
