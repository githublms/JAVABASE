package com.example.java;


/**
 * 运行结果 --》》》 产生这个结果的原因可以归结到
           给基本数据变量赋值 是数据值 ，给引用数据变量赋值是 地址值
 普通调用: m = 10,n = 20
 调用swap1() 得到: m = 10,n = 20
 调用swap2() 得到: m = 20,n = 10
 */
public class ValueTransferTest2 {

    public static void main(String[] args) {
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println("普通调用: m = " + data.m + ",n = " + data.n)  ;


        ValueTransferTest2 test2 = new ValueTransferTest2();
        test2.swap1(data.m,data.n);
        System.out.println("调用swap1() 得到: m = " + data.m + ",n = " + data.n); //结果为 m = 10,n = 20 其值并没有交换

        test2.swap2(data);
        System.out.println("调用swap2() 得到: m = " + data.m + ",n = " + data.n); //结果为  m = 20,n = 10 其值进行了交换

    }

    //交换两个基本数据类型的值
    public void swap1(int m ,int n ) {
        //交换两个变量的值
        int temp = m;
        m = n ;
        n = temp ;
    }

    //交换两个引用数据类型的值
    public void swap2(Data data ) {
        //交换两个变量的值
        int temp = data.m;
        data.m = data.n ;
        data.n = temp ;
    }

}

class Data {
    int m ;
    int n ;
}