package com.example.demo;
/*
编写程序从1循环到150，并在每行打印一个值，
另外在每个3的倍数行上打印出“foo”,
在每个5的倍数行上打印“biz”,
在每个7的倍数行上打印输出“baz”。

下面的这个示例有些不完整，因为有些数既可以被3 ，又可以被5 ，又可以被7整除
*/
public class ForTest1 {

    public static void main(String[] args) {

        for (int i = 1 ; i <= 150; i++) {
            System.out.println(i);
            if (i % 3 == 0 ){
                System.out.println( i + "foo");
            }else if (i % 5 == 0){
                System.out.println( i + "biz");
            }else if (i % 7 == 0 ){
                System.out.println( i + "baz");
            }
        }

    }

}
