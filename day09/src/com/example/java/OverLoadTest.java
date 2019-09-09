package com.example.java;


/**
 * 方法的重载 OverLoad loading。。。
 *  定义: 在同一个类中，允许一个以上的同名方法，只要方法的参数列表(参数类型和参数个数)不同即可
 *      两同一不同
 *         两同: 同一个类，同一个方法名
 *         一不同: 参数列表不同：包括参数名参数个数不同
 *  举例: Arrays中的sort() ，binarySearch()
 *
 *  判断一个方法和其他方法是否构成重载关系
 *      与方法的权限修饰符，方法的返回值类型 方法体 形参变量名 无关
 *
 *  在通过对象.方法名的时候，如何确定调用的是哪一个方法
 *      方法名 --》》 参数列表
 *
 */
public class OverLoadTest {

    public static void main(String[] args) {
        OverLoadTest test = new OverLoadTest();
        test.getSum(2,3);
        test.getSum("sf",2);

    }


    //以下的这四个方法互为重载关系
    public void  getSum(int i ,int j){
        System.out.println("1");
    }

    public void  getSum(double i ,int j){
        System.out.println("1");
    }
    public void  getSum(String i ,int j){
        System.out.println("1");
    }
    public void  getSum(int i ,String j){
        System.out.println("1");
    }


    //以下的三个方法不与上面的四个方法构成重载关系

//    public int getSum(){
//        return 0;
//    }

//    public void getSum(int m,int n){
//
//    }

//    public void getSum(int i ,int j){
//
//    }





}


