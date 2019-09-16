package com.example.demo2;

/**
 *  多态性 举例
 *  运行结果

 *******使用多态性********
 汪汪。。。
 小狗吃饭
 狗有看门的作用
 喵喵。。。
 cat吃饭
 *******使用多态性********

 *******不使用多态性********
 狗有看门的作用
 汪汪。。。
 小狗吃饭
 cat吃饭
 喵喵。。。
 *******不使用多态性********

    举例二: 一个方法 public void test(Object obj){}
    举例三: 操作数据库的方式
 */

// 对象的多态性是 编译时行为还是运行时行为？
// --》》 答案是运行时行为，原因是在编译时，无法直接得出结论，只有在运行的时候才知道其结果，因此为运行时行为

public class AnimalTest {
    public static void main(String[] args) {

        System.out.println("*******使用多态性********");
        AnimalTest test = new AnimalTest();
        test.func(new Dog());
        test.func(new Cat());
        System.out.println("*******使用多态性********");
        System.out.println();

        System.out.println("*******不使用多态性********");
        //不适用多态性，就只能写 n 个重载的方法进行方法的叠加，这会有很多的代码
        test.func1(new Dog());
        test.func1(new Cat());
        System.out.println("*******不使用多态性********");

    }
    public  void func(Animal animal){
        animal.shut();
        animal.eat();
        if (animal instanceof  Dog){
            Dog dog = (Dog) animal;
            dog.watchDoor();
        }
    }

    public void func1(Dog dog ){
        dog.watchDoor();
        dog.shut();
        dog.eat();
    }

    public void func1 (Cat cat){
        cat.eat();
        cat.shut();
    }
}

class Animal {

    public void eat(){
        System.out.println("动物吃东西");
    }
    public void shut(){
        System.out.println("动物叫叫");
    }

}

class Dog extends Animal{
    public void eat(){
        System.out.println("小狗吃饭");
    }
    public void shut(){
        System.out.println("汪汪。。。");
    }
    public void watchDoor(){
        System.out.println("狗有看门的作用");
    }
}

class Cat extends Animal{

    public void eat(){
        System.out.println("cat吃饭");
    }
    public void shut(){
        System.out.println("喵喵。。。");
    }
}



















