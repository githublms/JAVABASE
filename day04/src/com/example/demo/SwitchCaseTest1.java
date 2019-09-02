package com.example.demo;

import org.junit.Test;

/*
例题：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。

说明：如果switch-case结构中的多个case的执行语句相同，则可以考虑进行合并。
*/
public class SwitchCaseTest1 {


    /**
     * 方案二:使用除60操作，取整数，使其缩小整数的范围
     */
    @Test
    public void test3(){
        int  score = 75;
        switch (score / 60 ){
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
        }
    }

    /**
     * 方案一：使用除10操作，取整数，使其缩小范围
     */
    @Test
    public void test2(){
        int score = 75;
        switch (score / 10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("及格");
        }


    }


    public static void main(String[] args) {

        int score = (6 > 60) ? 1 : 2;
        switch (score){
            case 1 :
                System.out.println("合格");
                break;
            case 2 :
                System.out.println("不合格");
                break;
        }

    }





}
