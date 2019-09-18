package com.example.demo1;

import java.util.Date;

/**
 *  Object 类中的toString()方法
 *
 *  当我们输出一个对象的引用时，实际是调用了这个对象的toString()方法
 *  Object 类中的toString()方法 源码：
 *        public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
            }
 *
 *  像String，Date，包装类等一些类，都重写了Object 类中的 toString() 方法
 *  使得在返回对象时，返回的是 对象的 “实体内容”信息
 *
 *  自定义类也可以重写toString(),方便返回 “实体内容”
 */
public class ToStringTest {

    public static void main(String[] args) {

        String string = new String("MM");
        System.out.println(string); // MM

        Date date = new Date(15255225555252l);
        System.out.println(date); // Mon Jun 02 10:39:15 CST 2453

        Order order = new Order();
        System.out.println(order); //没有重写toString() 方法前 com.example.demo1.Order@14ae5a5
        System.out.println(order); //重写toString() 方法后 Order{}

    }

}
