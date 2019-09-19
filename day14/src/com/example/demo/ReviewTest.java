package com.example.demo;


import org.junit.Test;

public class ReviewTest {


    //关于toString 的使用
    @Test
    public void test1(){
        String string = "ABC" ;
        string = null;
        System.out.println(string);
        System.out.println("*******************");
        // System.out.println(string.toString()); //出现 空指针异常java.lang.NullPointerException
    }

    //关于equals方法
    @Test
    public  void test(){
        Person person = new Person("tom",12);
        Student student = new Student("tom",12);
        System.out.println(person.equals(student));//没有重写 equals() 前 和使用idea 自带的equals() 方法，结果为false
        //手动重写equals()后，可以将其结果改变为true
    }

    //通过下面的例子证明了，数组的父类也是Object
    @Test
    public void test2(){
        int[] arr = new int[]{12,13,15,16};
        print(arr); //[I@5d6f64b1 -->> arr 可以作为参数传递给方法，说明也是满足多态的特性
        System.out.println(arr.getClass().getSuperclass()); // class java.lang.Object
    }
    public void print(Object object){
        System.out.println(object);
    }






}
