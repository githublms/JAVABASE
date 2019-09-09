package com.example.java;


/**
 * 可变形参的方法
 *      jdk 5.0 新增
 *  具体使用:
 *      可变个数的形参格式: 形参类型 ... 形参名
 *      当调用可变形参的方法时，形参个数可以有0个，1个，2个。。。
 *      可变个数的形参方法和本类中相同方法名，形参不同的方法之间构成重载关系
 *      可变个数的形参方法和本类中相同方法名，形参类型也相同的数组之间不构成重载关系，换句话说，两者不能共存
 *      可变个数的形参方法在方法的形参中，必须声明在末尾
 *      可变个数的形参方法在方法的形参中，最多只能声明一个可变形参
 */

public class MethodArgsTest {

    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show();
        test.show(1);
        test.show(2,3);
        test.show("AA","BB");//第一种写法
        test.show(new String[]{"cc","dd"});//第二种写法
    }

    public void show(){
        System.out.println("空参的方法");
    }

    public void show(int i){
        System.out.println(1);
    }

    public void show(int i ,int j ){
        System.out.println(2);
    }

    public void show(String... strs){
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    //与上面的可变参数不能共存
//    public void show(String[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }

    //报错信息如下: The variable argument type String of the method
    //	//show must be the last parameter
//    public void get(String... strings ,int m) {
//
//    }








}
