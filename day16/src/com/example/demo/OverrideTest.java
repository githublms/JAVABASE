package com.example.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *  子类重写父类中的方法，要求子类抛出的异常不能比父类大，
 *  如果父类没有throws 异常，那么子类也不能throws 异常，
 *  如果子类出现了异常，那么就必须try-catch-finally处理
 */
public class OverrideTest {
    public static void main(String[] args) {
        OverrideTest test = new OverrideTest();
        test.display(new SubClass());

    }

    public void display(SupperClass supper){
        try {
            supper.method();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


class SupperClass {
    public void method() throws FileNotFoundException{

    }
}
class  SubClass  extends SupperClass{
    @Override
//    public void method() throws IOException { //不能比父类更大
    public void method() throws FileNotFoundException { //不能比父类更大

    }
}