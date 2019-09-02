package com.example.demo;

import org.junit.Test;

import javax.annotation.Resource;

/**
 * switch 分支结构
 *
 * switch (表达式) {
 *      case 常量1:
 *          执行表达式1
 *      //break;
 *       case 常量2:
 *          执行表达式2
 *      //break;
 *      。。。
 *
 *      default:
 *          执行语句n;
 *          //break;
 *       }
 *
 * switch 说明
 *  1 根据switch表达式中的值，和case中的常量进行匹配，
 *      如果匹配上，就执行case对应的语句，执行完当前匹配的case语句后，继续向下执行，直到遇到break，或switch -case 结构为止
 *      如果没有，就执行default语句
 *
 *  2 brake 可以用到switch - case 语句中，当执行到break 的时候，就跳出 switch -case 结构
 *
 *  3 switch 后面的表达式类型只能是以下的 6 种
 *      byte short char int
 *      枚举类型（jdk 5.0 新增）
 *      String类型（jdk 7.0 新增）
 *
 *  4 case 后面只能跟常量，不能跟范围
 *
 *  5 break 关键字是可选的
 *
 *  6 default 语句类似于if -else 中的else 结构 ,
 *      default 语句时可选的，而且位置任意(可选的)
 *
 *
 *
 *
 */
public class SwitchTest {

    /**
     * 编译不通过的情形
     */
    @Test
    public void test3(){

        boolean bool  = false ;
//        switch (bool){
//            case  true :
//                System.out.println("this is true");
//        }


//        int age = 18;
//        switch (age){
//            case age > 15 :
//                System.out.println("大于15岁");
//        }


    }

    @Test
    public void test1(){
        String season = "summer";
        switch (season){
            case "summer" :
                System.out.println("this is summer");

            case "spring" :
                System.out.println("this is spring");

            case "winner" :
                System.out.println("this is winner");
                break;
                default:
                    System.out.println("季节输入有误");
        }







    }

   @Test
    public  void test2(){
       int num = 2;
       switch (num){
           case 1:
               System.out.println("one");
               break;
           case 2:
               System.out.println("two");
               break;
           case 3:
               System.out.println("three");
               break;
           case 4:
               System.out.println("four");
               break;

           default:
               System.out.println("other");

       }

   }






}
