package com.example.exer;

/**
 * @author lms
 * @create 2019-09-15 20:53
 */
public class CircleTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setRadius(2.1);
        cy.setLength(2.5);

        double volume = cy.findVolume();
        System.out.println("圆柱的体积是:" + volume);

        //没有重写findArea()时：
//		double area = cy.findArea();
//		System.out.println("底面圆的面积：" + area);
        //重写findArea()以后：
        double area = cy.findArea();
        System.out.println("圆柱的表面积：" + area);

        System.out.println("******************");
        Cylinder cy1 = new Cylinder();
        double volume1 = cy1.findVolume();
        System.out.println("圆柱的体积为：" + volume1);
    }
}
