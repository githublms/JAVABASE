package com.example.exer;
/*
 * 要求：
 * (1)创建Person类的对象，设置该对象的name、age和sex属性，调用study方法，
 * 输出字符串“studying”，调用showAge()方法显示age值，
 * 调用addAge()方法给对象的age属性值增加2岁。
 * (2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 *
 */
public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.study();
        p1.addAge(2);
        p1.showAge();
        System.out.println("------------");
        p2.age = 18;
        p2.study();
        p2.addAge(2);
        p2.showAge();


    }

}
class Person {

    String name;
    int age;
    /**
     * sex:1 表明是男性
     * sex:0 表明是女性
     */
    int sex;

    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println("age = " + age );
    }
    public int  addAge(int i){
        age = age + i;
        return age;

    }

}