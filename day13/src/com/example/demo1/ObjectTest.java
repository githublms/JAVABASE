package com.example.demo1;

/**
 *  java.lang.Object类
 *  Object 是java所有类的父类
 *  如果类中没有使用extends 关键字来指定父类，那么这个类的默认父类是Object
 *  Object 类中的属性和方法具有通用型
 *      属性: 无
 *      方法: toString()/equals()/getClass()/hashCode()/clone()/finalize()
 *              wait()/notify()/notifyAll()
 *      构造器：只有一个空参的构造器
 *
 *  getClass() 输出的是类的全类名 （包名 + 类名）
 */

//证明：没有使用 extends 关键字，默认的父类是 Object
public class ObjectTest {
    public static void main(String[] args) {

        Order order = new Order();
        System.out.println("order的父类是:" + order.getClass().getSuperclass()); //order的父类是:class java.lang.Object
    }

}
class Order{

    @Override
    public String toString() {
        return "Order{}";
    }
}
