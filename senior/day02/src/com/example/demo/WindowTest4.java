package com.example.demo;

public class WindowTest4 {

    public static void main(String[] args) {
        Window4 window1 = new Window4();
        Window4 window2 = new Window4();
        Window4 window3 = new Window4();

        window1.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");

        window1.start();
        window2.start();
        window3.start();
    }

}


class Window4 extends Thread{

    private int ticket = 100;

    private static int num = 100;
    @Override
    public void run() {
        while (true){
//            show();
            display();
        }
    }
    public synchronized static void display(){
        if (num > 0 ){
            System.out.println(Thread.currentThread().getName() + "-正在num，票号为: " + num);
            num--;
        }
    }

    public synchronized void show(){
        //private synchronized void show(){ //同步监视器：t1,t2,t3。此种解决方式是错误的
        if (ticket > 0 ){
            System.out.println(Thread.currentThread().getName() + "-正在卖票，票号为: " + ticket);
            ticket--;
        }
    }


}



























