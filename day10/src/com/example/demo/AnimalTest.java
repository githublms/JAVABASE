package com.example.demo;

/**
 *  面向对象的特性以: 封装和隐藏     3w what why how
 *
 *  问题引出:
 *      当我们创建一个对象时，我们可以通过一个对象.属性或者对象.方法的方式获取和设置属性/方法,
 *      这时，我们的赋值操作会受到 数据类型和 存储范围的制约，初次之外，没有其他的制约条件，
 *      但是，我们在实际的操作中，我们会对属性的赋值进行一些额外的附加条件(比如:age 必须大于16的才能存入数据库)
 *      这个条件在属性声明的时候就不能实现，那么，我们要怎么做，我们才能使其赋值操作成功呢？
 *      这时候，我们就只能通过方法(setXX())来设置属性的值，同时，我们要避免用户在通过对象.属性的方式来设置变量值
 *      ，因此我们就需要将属性设置为private  ---》》》 这里，我们就针对于属性体现了封装性
 *
 *  封装性的体现:
 *      一 ：将属性设置为private ，并且提供 public的公共方法来设置(setXX())和获取(getXXX())属性的值。
 *      二 ：不对外暴露的私有方法，
 *      三 : 单例模式
 *
 *  封装性的体现需要权限修饰符来配合使用
 *      权限修饰符有4种 ，从小到大 的顺序是: private 缺省 protected public
 *      权限修饰符可以修饰类或者类的结构(属性，方法，构造器，内部类):
 *      修饰类只能用 缺省  和 public 来修饰
 *      修饰类的结构，四种权限修饰符都可以
 *
 *  总结封装性:
 *      java提供四种权限修饰符来修饰类或者类的结构，体现了类或类的结构在被调用时可见性的大小
 */

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "大黄";
//      animal.age = 5;The field Animal.legs is not visible
//      animal.legs = 4;//The field Animal.legs is not visible

        animal.show();
        animal.setLegs(-6);
        animal.show();
        System.out.println(animal.name);

    }

}

class Animal{

    String name;
    private int age;
    private int legs;

    public void setLegs(int l){
        if (l > 0 && l % 2 == 0 ){
            legs = 1;
        }else{
            legs = 5;
        }
    }

    public int getLegs(){
        return legs;
    }

    public void eat(){
        System.out.println("动物吃东西");
    }
    public void show(){
        System.out.println("nam=" + name + ",age=" +age + ",legs=" + legs);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
}
