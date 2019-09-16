package com.example.demo1;

/**
 *  super关键字的使用
 *  理解:父类的
 *  super可以修饰属性，方法，构造器
 *
 *  super修饰属性和方法
 *
 *      在子类的构造器和方法中，可以通过super.属性/super.方法的形式来调用父类中的方法和属性
 *      通常情况下：我们可以省略 super.
 *
 *      属性调用:
 *          当子类中定义的属性和父类中的属性同名时，我们要在子类中调用父类中的属性时，
 *          就必须显示的书写super.属性的方式来调用父类中属性
 *
 *      方法调用:
 *          在子类的方法中，想要调用父类的方法，就必须使用super.方法的形式来调用父类中的方法
 *
 *      构造器调用:
 *          在子类构造器中，通过super(形参列表) 的方式来调用父类的构造器
 *          super(形参列表) 必须声明在子类构造器的首行
 *          在类的构造器中，this(形参列表) 和 super(形参列表) 只能二选一
 *          在构造器的首行，如果没有显示的调用this(形参列表) 或 super(形参列表)，则默认调用父类的super()构造器
 *          在类的多个构造器中，至少有一个构造器调用了super(形参列表)
 */
public class SuperTest {
    public static void main(String[] args) {
        Student student = new Student();//我无处不在
        student.walk();//人走路
        student.show(); //name = null, age = 0 id = 1002 id = 1001

        System.out.println("****************");
        Student student1 = new Student("Tom",25,"it");
        student1.show(); // name = Tom, age = 25 id = 1002     id = 1001



    }

}
