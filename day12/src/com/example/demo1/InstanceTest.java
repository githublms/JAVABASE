package com.example.demo1;

/**
 *  子类实例化过程探讨
 *
 *   从结果上看: (继承性)
 *      子类继承父类，就会继承父类所有的属性和方法
 *      创建子类对象时，会在堆空间中加载 父类中声明的属性
 *
 *   从过程上看:
 *      当我们通过子类构造器来创建对象时，就一定会直接或者间接的调用父类的构造器，进而调用父类的父类构造器，，，，
 *      一直到java.lang.Object 类中的 空参构造器为止，因为加载了所有的构造器，所以才能够看到内存中的父类结构，
 *      才可以考虑调用
 *
 *   明确：
 *      我们在创建子类对象时，虽然加载了一个或多个父类构造器，但是创建的对象，仍然只有一个，即 new 出来的对象
 */

public class InstanceTest {
}
