package com.example.demo;

/**
 * 值传递机制的测试
 *  如果形参是基本数据类型，那么实参传递给形参的是数据值
 *  如果形参是引用数据类型，那么实参传递给形参的是地址值
 */
public class ValueTransferTest {
    public static void main(String[] args) {

        ValueTransferTest test = new ValueTransferTest();
        Data date = new Data();
        System.out.println("交换前的数据是:"+ date);
        test.swapData(date);
        System.out.println("交换后的数据是:"+ date);

        System.out.println("****下面是特殊实例*****");

        String s1 = "hello";//因为string是不可变的
        System.out.println("交换前的s1是:"+ s1);
        test.swapStr(s1);
        System.out.println("交换后的s1是:"+ s1);



    }

    public void swapStr(String string){
        string = "good";
    }

    public void swapData(Data data){
        int temp = data.m ;
        data.m = data.n;
        data.n = temp;

    }
}

class Data {
    int m = 5 ;
    int n = 12;

    @Override
    public String toString() {
        return "Data{" +
                "m=" + m +
                ", n=" + n +
                '}';
    }
}
