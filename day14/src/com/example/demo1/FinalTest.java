package com.example.demo1;

/**
 *  final 关键字的使用
 *  final 可以修饰的结构: 类，方法 ，变量
 *
 *  final 修饰类：表明这个类不能够被继承， 比如 String 类，System,StringBuffer等
 *
 *  final 修饰方法: 表明这个方法不能被重写，如Object 类中的getClass()
 *
 *  final 修饰变量:此时的变量就是一个常量
 *  final 修饰属性：可以考虑赋值的位置:   显示初始化，代码块初始化，构造器中初始化 ，
 *                  因为final修饰的变量都已经是一个常量了，而且值不变，所以没有通过对象.属性的方式进行赋值
 *
 *        修饰局部变量: 尤其是使用final修饰形参时，表明此形参是一个常量。当我们调用此方法时，给常量形参赋一个实参。
 *                     一旦赋值以后，就只能在方法体内使用此形参，但不能进行重新赋值。
 *
 *        final 修饰局部变量（方法内），在使用前，必须初始化，
 *        final 修饰局部变量（形参），实参传递给形参后，形参值不能再修改
 *
 *  static final ：全局常量
 */
public class FinalTest {

    final int weight = 0 ; //显示赋值
    final int left; //可以在代码块中赋值
    final int right ; //可以在构造器中赋值
    {
        left = 25;
    }
    public FinalTest(){
        right = 45;
    }

    public static void main(String[] args) {
        FinalTest test = new FinalTest();
        test.display(20);
    }
    public void display(final  int num){ //只能在方法体中使用形参num，不能重新赋值
//        num += 20; //编译不通过
        System.out.println(num);
        final int number = 48;
        System.out.println(number);
//        number = 78;//编译不通过
    }

}


class AA {

    public void eat(){

    }
    public  final void show(){

    }
}
class BB extends AA{
    @Override
    public void eat() {
        super.eat();
    }
    //final修饰的方法不能被重写
//    public final void show(){
//
//    }

}
final class CC{

}
//class DD extends  CC{} //final修饰的类不能被继承


