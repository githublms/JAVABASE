package com.example.demo;

/**
 * 例子：创建三个窗口卖票，总票数为100张.使用继承Thread类的方式
 * 存在线程的安全问题，待解决。
 *  错误的地方: 出现重票和错票
 窗口一：卖票，票号为：100
 窗口二：卖票，票号为：100
 */
public class SaleTicketTest1 {

    public static void main(String[] args) {
        SaleTicket ticket1 = new SaleTicket();
        SaleTicket ticket2 = new SaleTicket();
        SaleTicket ticket3 = new SaleTicket();

        ticket1.setName("窗口一");
        ticket2.setName("窗口二");
        ticket3.setName("窗口三");

        ticket1.start();
        ticket2.start();
        ticket3.start();

    }
}

class SaleTicket extends  Thread {

    private static  int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(getName() + "：卖票，票号为：" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}