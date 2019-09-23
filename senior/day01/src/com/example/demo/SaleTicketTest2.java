package com.example.demo;

/**
  例子：创建三个窗口卖票，总票数为100张.使用继承Thread类的方式
 * 存在线程的安全问题，待解决。
 *  错误的地方: 出现重票和错票
 窗口一:卖票，票号为:100
 窗口一:卖票，票号为:99
 窗口一:卖票，票号为:98
 窗口一:卖票，票号为:97
 窗口一:卖票，票号为:96
 窗口一:卖票，票号为:95
 窗口一:卖票，票号为:94
 窗口三:卖票，票号为:100
 窗口二:卖票，票号为:100
 */
public class SaleTicketTest2 {

    public static void main(String[] args) {

        MySale mySale1 = new MySale();
        MySale mySale2 = new MySale();
        MySale mySale3 = new MySale();

        Thread thread1 = new Thread(mySale1);
        Thread thread2 = new Thread(mySale2);
        Thread thread3 = new Thread(mySale3);

        thread1.setName("窗口一");
        thread2.setName("窗口二");
        thread3.setName("窗口三");

        thread1.start();
        thread2.start();
        thread3.start();

    }



}

class  MySale  implements Runnable{

    private static  int ticket = 100;
    @Override
    public void run() {
        while (true){
            if (ticket > 0 ){
                System.out.println(Thread.currentThread().getName() + ":卖票，票号为:" + ticket);
                ticket --;
            }else{
                break;
            }
        }
    }
}
