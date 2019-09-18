package com.example.demo2;

import org.junit.Test;

/**
 *  包装类的使用
 *      每个基本数据类型都有其对应的包装类型，使得基本数据类型的变量拥有了类的属性
 *
 *  掌握 基本数据类型，包装类 String 三者的相互转换
 */
public class WrapperTest {

    //基本类型，包装类型--》》 String类型 ==== 调用String类的重载方法valueof()
    @Test
    public void test1(){

        //方式一: 使用 + 进行拼接
        String s1 = 12 + "";
        System.out.println(s1);//"12"

        //方式二: 调用String的valueof() , 可以使用 instanceof 来判断对象的实例
        String s2 = String.valueOf(15.56);
        System.out.println(s2);//"15.16"

        Double d2 = new Double(15.758);
        String s3 = String.valueOf(d2);
        System.out.println(d2); //"15.758"
    }

    //String 类型---》》基本类型 包装类型 === 调用包装类的parseXXX()方法
    @Test
    public  void  test2(){

        //错误的情况
        String s2 = "18";
//        Integer num = (Integer)s2;//编译不通过
        String s1 = "15.63";
        Double d1 = Double.parseDouble(s1);
        System.out.println(d1);//15.63

        //Boolean 类型特殊一点
        String boo = "true1";
        Boolean bool = Boolean.parseBoolean(boo);
        System.out.println(bool); //当 boo = true ,其转换结果为true ，当boo = true1 ，其转换结果为false
    }

    //jdk 5.0 新特性: 自动装箱，自动坼箱
    //装箱和拆箱，很好区别的，装 ，包装 拆: 去除包装，打开箱子
    @Test
    public void test3(){
        //自动装箱 基本数据类型 ---》》 包装类
        int num1 = 156;
        Integer num2 = num1;
        System.out.println(num2.toString());// 结果为 156 包装类可以调用toString()
        //自动拆箱 包装类 --》》 基本数据类型
        int num3 = num2;
        System.out.println(num3);//153
    }

    //没有自动拆箱，装箱以前是怎么进行转换的呢？即 5.0 以前要实现类型的转换，应该如何实现
    @Test
    public void test4(){
        //基本数据类型 --》》 包装类型 ===调用包装类的构造器
        int num1 = 145;
        Integer num2 = new Integer(num1);
        System.out.println(num2.toString());//123
        Integer num3 = new Integer("123");
        System.out.println(num3);//123

//        Integer num4 = new Integer("123ac");
//        System.out.println(num4);//出现异常:java.lang.NumberFormatException: For input string: "123ac"

        Boolean boo = new Boolean("true");
        System.out.println(boo);//true
        Boolean bool = new Boolean("TrUe");
        System.out.println(bool);//true
    }

    @Test
    public void test5(){
        // 包装类型 --》》 基本数据类型 === 调用包装类的xxxvalue()方法
        Boolean boo = new Boolean(true);
        boolean bool = boo.booleanValue();
        System.out.println(bool);//true

        Integer integer = new Integer(89);
        int num1 = integer.intValue();
        System.out.println(num1);//89
    }


    @Test
    public void test6(){
        //包装类和基本数据类型的默认值不是一样的
        Order order = new Order();
        System.out.println(order.isMan); // 默认值为false
        System.out.println(order.isSmoking); // 默认值为 null
    }

}

class Order{

    boolean isMan;
    Boolean isSmoking;

}
