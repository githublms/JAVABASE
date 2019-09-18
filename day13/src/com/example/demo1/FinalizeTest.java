package com.example.demo1;

/**
 *  Object 类中的 finalize()方法
 *  主要作用是  回收垃圾对象
 *
 运行结果
     Person{name='Tom', age=12}
     当前对象被释放--->Person{name='Tom', age=12}
 */
public class FinalizeTest {
    public static void main(String[] args) {
        Person person = new Person("Tom",12);
        System.out.println(person);

        person = null; // 此刻，对象的实体是 垃圾对象，等待被回收，但是回收的时间是不定的
        System.gc(); //强制释放空间，释放空间后，就会回收垃圾
    }
}

class Person {

    private  String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("当前对象被释放--->" + this);
        super.finalize();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}