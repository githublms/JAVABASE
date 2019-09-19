package com.example.demo;

// static 关键字的使用

/**
 * 运行结果
 c1的id：1001
 c2的id：1002
 c3的id：1003
 创建的圆的个数为：3
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(3.4);
        System.out.println("c1的id：" + c1.getId() );
        System.out.println("c2的id：" + c2.getId() );
        System.out.println("c3的id：" + c3.getId() );

        System.out.println("创建的圆的个数为：" + Circle.getTotal());
    }
}

class Circle {
    private  double radius;
    private int id;

    private static int total;// 记录圆的总个数
    private static int init = 1001; // static 修饰的属性被所有对象共享

    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }

}