package com.example.demo1;

/**
 *  Object类的clone()的使用
 *
 *  要想克隆的类需要实现cloneable接口
 *  克隆过程中，可能会出现克隆不支持异常
 *
 运行结果:
     原始对象是:com.example.demo1.Animal@4554617c
     克隆对象是:com.example.demo1.Animal@74a14482
 */
public class CloneTest {
    public static void main(String[] args) {
        Animal animal = new Animal("花花");
        try {
           Animal animal1 = (Animal) animal.clone();
             System.out.println("原始对象是:" + animal);
            animal1.setName("红红");
            System.out.println("克隆对象是:" + animal1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}

class Animal  implements Cloneable{ //没有实现可克隆接口，在克隆时，就会产生异常 CloneNotSupportedException: com.example.demo1.Animal
//class Animal  { //没有实现可克隆接口，在克隆时，就会产生异常 CloneNotSupportedException: com.example.demo1.Animal
    private String name;


    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}