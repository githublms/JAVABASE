package com.example.exer;

/*
 * 2.利用面向对象的编程方法，设计类Circle计算圆的面积。
 */
public class CirecleTest {
    public static void main(String[] args) {
        Cirecle cirecle = new Cirecle();
        cirecle.radius = 2.1;
//        cirecle.findArea();//方式一: 圆的面积是:13.854423602330987
        System.out.println(cirecle.findArea()); //方式二: 13.854423602330987

    }






}
class  Cirecle {

    double radius;

    //求圆的面积 -->> 方式一
//    public void findArea(){
//        double area = Math.PI * radius * radius;
//        System.out.println("圆的面积是:" + area);
//    }
    //求圆的面积 -->> 方式二
    public double findArea(){
        return  Math.PI * radius * radius;
    }

}
