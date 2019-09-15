package com.example.java2;

/**
 *  前面的 PersonTest 我们学习了构造器的基础语法，其中有关于构造器中对属性的赋值操作
 *  那么属性赋值的先后顺序是怎么样的呢？
 *      属性赋值的优先级排序如下
 *          默认初始化
 *          显示初始化
 *          构造器中初始化
 *          对象.属性 / 对象.方法 的方式初始化
 */
public class PropertySet {
    public static void main(String[] args) {
        Propert propert = new Propert();
        System.out.println("propert对象中age=" + propert.age);

        Propert propert1 = new Propert(2);
        System.out.println("propert1对象中age=" + propert1.age);
        propert1.setAge(5);
        System.out.println("propert1对象中age=" + propert1.age);

    }

}

class Propert {
    String name;
    int age = 1;

    public Propert() {
    }
    public Propert(int a) {
        age = a ;
    }

    public Propert(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
