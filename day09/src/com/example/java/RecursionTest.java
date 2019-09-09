package com.example.java;

/**
 * 递归方法
 *    一个方法内调用这个方法本身
 *    递归方法中包含了一种隐士的循环，他会重复的执行某一段代码，在这种循环下，无须循环控制条件
 *    递归一定要向已知的方向循环，否则会造成无限递归，类似于死循环
 */
public class RecursionTest {
    public static void main(String[] args) {

        /**
         * 计算1 - 100 之间的自然数之和
         *   普通方式  和  递归方式
         */
        //普通方式
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("普通方式:" + sum);

        //递归方式
        RecursionTest test = new RecursionTest();
        int sum2 = test.getSum(100);
        System.out.println("递归方式:" + sum2);

        //计算阶乘
        int result = test.getResult(5);
        System.out.println("递归阶乘:" + result );
    }

    public int  getSum(int n ){
        if (n == 1){
            return n;
        }else{
            return n + getSum(n-1);
        }
    }

    public int getResult(int n){
        if ( n == 1 ){
            return 1;
        }else{
            return  n * getResult(n -1);
        }
    }

}
