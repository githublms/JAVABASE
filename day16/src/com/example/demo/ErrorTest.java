package com.example.demo;

/**
 *  java 中Error
 *      JVM 都无法解决的严重问题，如:JVM 内部错误，资源耗尽等
 *      比如 StatckOverFlowerError 和 OOM (outOfMeroryError)
 *      简单来说就是 栈溢出 和 堆溢出（也叫内存溢出）
 *
 *  java 中出现了异常。一般不编写针对性代码进行处理
 */
public class ErrorTest {
    public static void main(String[] args) {
        // java.lang.StackOverflowError --》》 栈溢出
        main(args); //--》》 这里是递归方法(自己调用自己)，每个方法在被调用时，都会保存一个栈帧，栈帧太多，将栈空间装满，所以溢出
                    //--》》 由于不停的调用自己，形参也会不停的创建，
                    //--》》 但是，形参所占用的栈空间是方法栈空间的一个部分，所以，最终的结果是栈帧太多，导致溢出

        //java.lang.OutOfMemoryError: Java heap space -->> 堆溢出
        Integer[] integer = new Integer[1012*1024*1024];
        //--》》 创建数组时，会在堆空间中开辟一处连续的空间 ，开辟的空间大小是: 数组长度 * 数组元素占用的字节数（Byte）
        //--》》 一个字节 是 8 位，位（bit） 字节（Byte） 1024 字节 = 1 KB
        //--》》 这里相当于开辟了 1024 M 的空间，超出了范围，所以堆空间溢出
    }
}
