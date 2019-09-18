package com.example.demo;

/**
 *  面向对象三 -->>：多态性
 *
 *  理解:多态性是指一种事物的多种形态
 *
 *  何为多态性:父类引用指向子类对象(或者将子类对象的值赋值给父类变量) A a = new B(); A 是 B 的父类
 *
 *  多态的使用：(虚拟方法的调用)
 *      对象的多态性: 在编译期，我们只能调用父类中被重写的方法，在运行是，实际调用的是子类的重写方法
 *
 *  对象的多态性，只对方法有效，对属性无效
 *
 *  多态性的使用前提 : 类有继承关系 重写方法
 */
public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person();
        person.eat();//人吃饭
        person.walk();//   人走路
        System.out.println("person.id = " + person.id);//person.id = 1001

        //对象的多态性对方法有效，对属性无效
        Person person1 = new Man();
        person1.walk();//男人霸气的走路
        person1.eat();//男人要吃肉，涨肌肉
        System.out.println("person.id = " + person.id);//person.id = 1001

        Person person2 = new Woman();
        person2.walk();

        //不能调用子类所特有的方法、属性：编译时，person1是Person类型。
        person1.age = 25;
//        person1.earnMoney();
//        person1.isSmoking = false;

        //在创建对象时，内存中实际上是加载了子类特有的属性和方法，但是由于声明的变量是父类型的
        //因此只能调用父类的属性和方法，子类特有的属性和方法不能调用

        //如何才能调用子类特有的方法和属性呢？---》》 使用向下转型(使用强转符)
        Man man = (Man) person1;
        man.isSmoking = true;
        man.earnMoney();

        //注意:使用强转时，可能会出现转换异常(ClassCastException),举例如下:
//        Woman woman  = (Woman) person1; //这里就会出现异常 ClassCastException: com.example.demo.Man cannot be cast to com.example.demo.Woman
//        woman.goshoping();

        //如何避免出现转换异常呢？ -- >> 使用instanceof 关键字
        // a instanceof A : 判断对象 a 是否是 A 的实例 ，返回true，表示可以向下转型，返回false 就不能向下转型
        // 如果 a instanceof A返回true,则 a instanceof B也返回true.
        // 其中，类B是类A的父类。
        System.out.println("----------------------------------");

        if (person2 instanceof Person){
            Woman woman = (Woman) person2;
            woman.goshoping();
            System.out.println("*****woman******");
        }
        if (person1 instanceof Person){
            Man man2 = (Man) person1;
            man2.earnMoney();
            System.out.println("*****man******");
        }

        if (person2 instanceof Person){
            System.out.println("*****person******");
        }

        if (person2 instanceof Object){
            System.out.println("*****Object******");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        //转换原则（规定）

       /*
        父类 父类变量 = new 子类A（）;
        子类B/A 子类变量 =（子类B/A） 父类变量 ;
        子类变量.方法 ; --》》输出的结果为：子类A中重写的方法
        */

        //有三种情况，1 编译过，运行不过，2 编译不过，3 编译过，运行过
        //1 编译过，运行不过
//        Person person3 = new Woman();
//        Man man3 = (Man) person3; //出现转换异常
//        Person person4 = new Person();
//        Man man4 = (Man) person4;   //出现转换异常


        //编译不过
//        Man man5 = new Woman();


        //编译过，运行也过
        Person person6 = new Woman();
        Woman woman6 = (Woman) person6;
        woman6.goshoping();

        Object object = new Person();
        Person person7 = (Person) object;
        person7.walk();

        Object object2 = new Woman();
        Person person8 = (Person) object2;
        person8.eat();




















    }


}
