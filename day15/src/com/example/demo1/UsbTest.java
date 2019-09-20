package com.example.demo1;

/**
 *  接口的使用:
 *      接口的使用上也满足多态性
 *      接口实际上也是定义了一种规范
 *      开发中，体会面向接口编程 --》》 访问数据库接口
 *
 *  接口在使用上也满足多态性 形参传入的是 接口名 形参名
 *  类在使用上满足多态性，   形参传入的是 父类名 形参名
 *
 *  接口的代理模式j及相关应用暂不探讨
 */
public class UsbTest {

    public static void main(String[] args) {
        Computer computer =  new Computer();
        Flash flash = new Flash();
        computer.transferData(flash); // U盘开始工作 传输数据的细节 U盘停止工作

        computer.transferData(new Printer()); //打印机开始工作 传输数据的细节  打印机停止工作
        Usb usb = new Usb() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机停止工作");
            }
        };
        computer.transferData(usb); //手机开始工作 传输数据的细节 手机停止工作
        computer.transferData(new Usb() { // mp3开始工作  传输数据的细节 mp4结束工作
            @Override
            public void start() {
                System.out.println("mp3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("mp4结束工作");
            }
        });
        computer.method(new Dog()); //狗吃骨头
    }
}

interface Usb {
    //定义常量 长度，宽度，高度等
    public static final int length = 20;
    int weight = 10;

    void start();
    public abstract void stop();
}

class Flash implements Usb {
    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}


class Printer implements Usb{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}

class Computer{

    public void transferData(Usb usb){
        usb.start();
        System.out.println("传输数据的细节");
        usb.stop();
    }
    public void method(Animal animal){
        animal.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("动物吃饭");
    }
}

class Dog  extends Animal{
    @Override
    void eat() {
        System.out.println("狗吃骨头");
    }
}











































