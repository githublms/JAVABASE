package com.example.java;

/**
 * 属性(成员变量)和局部变量的区别
 *      相同点:
 *          定义变量的格式 变量类型 变量名 = 变量值
 *          先声明，后使用
 *          变量都有对应的作用域
 *      不同点:
 *          在类中声明的位置不同：
 *              属性的声明位置是在 {}
 *              局部变量的声明位置是在 方法形参，构造器形参，方法内，代码块内，构造器内
 *          使用权限修饰符的不同
 *              属性可以使用四种权限修饰符 public private 缺省 protected --》》 封装性
 *              局部变量不可以使用权限修饰符 (这里有疑问，默认的修饰符是 缺省还是什么，可以铜鼓反射获取)
 *          默认初始化情况
 *              属性的默认值根据其类型的初始值一样 基本数据类型 和 引用数据类型(默认值为：null)
 *              局部变量没有默认初始化值，意味着，我们调用局部变量的时候需要显示赋值，特别的：调用形参的时候，直接赋值即可
 *          内存中加载位置的不同
 *              属性的位置是在堆中 (非static)
 *              局部变量的位置是栈中
 */

public class UserTest {
    public static void main(String[] args) {

        User user = new User();
        user.age = 12;
        user.name = "jack";

        user.eat();
        user.talk("中文");

    }
}

class User{
    //属性（或成员变量）
    String name;
    public int age;
    boolean isMale;

    public void talk(String language){ //方法形参 也是局部变量
        System.out.println("我们使用" + language + "进行交流");
    }
    public void eat(){
        String food = "洛饼"; //局部变量
        System.out.println("北方人喜欢吃" + food );
    }

}




















