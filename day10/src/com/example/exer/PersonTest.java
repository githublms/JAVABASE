package com.example.exer;

/**
 * 在PersonTest类中实例化Person类的对象b，
 * 调用setAge()和getAge()方法，体会Java的封装性。
 */
public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("默认age是:" + person.getAge());
        person.setAge(36);
        System.out.println("设置age是:" + person.getAge());

        Person person1 = new Person(25,"Tom");
        System.out.println(person1.getAge());

    }

}
