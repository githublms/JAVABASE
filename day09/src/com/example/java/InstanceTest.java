package com.example.java;


/**
 *  java语言中，将功能，结构等封装到类中，通过类的实例化，来调用具体的功能结构
 *  > String Scanner
 *  > 文件 File
 *  > 网络资源 URL
 *  涉及到java语言与前端html ,后端的数据交互时，前后端的结构在java 层面 交互时，都体现为类，对象
 *
 *  内存解析的说明
 *      引用类型的变量在内存只可能存在两种值： null 和 地址值 (包含了变量的类型)
 *
 *  匿名对象的使用:
 *      理解:创建的对象没有显示的赋给一个变量名，这样的对象称之为 匿名对象
 *      特征:匿名对象只能调用一次
 *      使用:如下
 */

public class InstanceTest {
    public static void main(String[] args) {

        Phone phone = new Phone(); //显示赋值，phone不是匿名对象
//        phone = null; // 如果phone为null，那么在调用的时候，会出现空指针异常
        phone.playGame();
        phone.sendEmail();

        //匿名对象
        new Phone().sendEmail();
        new Phone().playGame();

        new Phone().price = 12.63;
        new Phone().showPrice();//输出的结果是 0.0 ，证明了 匿名对象只能调用一次

        System.out.println("************");
        PhoneFunction test = new PhoneFunction();
        //匿名对象的使用
        test.showFunction(phone);
        test.showFunction(new Phone());

    }
}

class PhoneFunction {

    public void showFunction(Phone phone){
        phone.playGame();
        phone.sendEmail();
    }
}

class Phone {
    double price ;

    public void sendEmail(){
        System.out.println("手机可以发送短信");
    }
    public void playGame(){
        System.out.println("手机可以打游戏");
    }
    public void showPrice(){
        System.out.println("手机的价格是:" + price);
    }

}