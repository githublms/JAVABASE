package com.example.demo;

/**
 *  单例模式中饿汉式
 */
public class SingleTest {

    public static void main(String[] args) {
        Animal animal1 =Animal.getInstance();
        Animal animal2 =Animal.getInstance();
        System.out.println(animal1.equals(animal2));
    }
}
class Animal {

    private  Animal(){

    }

    private static Animal instance = new Animal();

    public static Animal getInstance(){
        return instance;
    }

}
