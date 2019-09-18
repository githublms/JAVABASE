package com.example.demo1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Date;

/**
 *  面试题: == 和 equals 的异同
 *
 *  回顾: ==
 *   == 之前是作为一个运算符出现的，可以用来比较基本数据类型，也可以用来比较引用数据类型
 *
 *   用在基本数据类型: 比较的是基本数据类型的数据值(类型不一定要相同，== 会自动进行类型提升)
 *   用在引用数据类型: 比较的是引用数据类型变量的地址是否一样，如果一样，返回true，不一样，返回 false
 *
 *   == 符号使用时，必须保证符号左右两边的变量类型一致。
 *
 *  Object 类中的equals()
 *      equals 是一个方法，而不是运算符
 *      equals 只能适用于 引用数据类型
 *
 *       Object 中equals() 源码: 可以很明显的看出，Object 类中的equals方法是用来比较 两个对象的 地址值的
         public boolean equals(Object obj) {
            return (this == obj);
         }
        所以Object 中的 equals方法的作用是和 == 相同的 ，比较的是地址值
 *
 *      像Date,String,File,包装类等，都重写了Object 类中的 equals 方法，
 *      重写equals() 之前: 比较的是 两个对象的地址值是否相等
 *      重写equals() 之后: 比较的是 两个对象的实体内容是否相等
 *
 *      通常情况下: 我们自定义的类，如果要比较对象的实体内容，那么就需要重写Object中的equals()
 *      重写原则:参考String 类中的equals()
 */
public class EqualsTest {
    public static void main(String[] args) {

        //基本数据类型
        int i = 10 ,j = 20 ;
        double d = 10.0;
        System.out.println(i == j); //false
        System.out.println(i == d); //true

        boolean boo = false;
//        System.out.println(i == boo);// == 两边的类型不一致
        char c = 10 ;
        System.out.println(i == c);//true

        char c1 = 'A';
        int k = 65;
        char c2 = 65;
        System.out.println(k == c1); //true  类型会自动提升
        System.out.println(c2 == c1); //true 类型会自动提升

        //引用数据类型
        Custom custom = new Custom("Tom",12);
        Custom custom1 = new Custom("Tom",12);
        System.out.println(custom == custom1); //地址不一样，所以为false


        String string = new String("CC");
        String string1 = new String("CC");
        System.out.println(string == string1); // false 比较的是地址 new 的方式

        String str = "DD";
        String str1 = "DD";
        System.out.println(str == str1); // true 比较的是地址，字面值方式

        System.out.println("****************************");

        System.out.println(custom.equals(custom1));// 没有重写equals 为false， 重写后为 true
        System.out.println(custom); //Customer [name=Tom, age=12]
        System.out.println("****************************");
        System.out.println(string.equals(string1));// String类重写了equals() 结果为 为true

        Date date1 = new Date(32432525324L);
        Date date2 = new Date(32432525324L);
        System.out.println(date1.equals(date2));// Date 类重写了 equals() 所以结果为 true
    }
}














