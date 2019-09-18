package com.example.exer;

/* 考查 instanceof 关键字的使用
 * 建立InstanceTest 类，在类中定义方法method(Person e);
		在method中:
		(1)根据e的类型调用相应类的getInfo()方法。
		(2)根据e的类型执行：
		如果e为Person类的对象，输出：
		“a person”;
		如果e为Student类的对象，输出：
		“a student”
		“a person ”
		如果e为Graduate类的对象，输出：
		“a graduated student”
		“a student”
		“a person”
 */
public class InstanceTest {
    public static void main(String[] args) {

        InstanceTest test = new InstanceTest();
        test.method(new Person());
    }

    public void method(Person e){
        if (e instanceof Person) {
            System.out.println("a person");
        }
        if (e instanceof Student) {
            System.out.println("a person");
            System.out.println("a student");
        }
        if (e instanceof Graduate) {
            System.out.println("a person");
            System.out.println("a student");
            System.out.println("a gradute");
        }

    }
}
class Person {

    protected String name;
    protected int age;

    public String getInfo(){
        return "Name: " + name + "\n" + "age: " + age;
    }
}


class Student extends  Person{
    protected String school = "pku";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age + "\nschool: " + school;
    }
}
class Graduate extends Student {
    public String major = "IT";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age + "\nschool: " + school + "\nmajor:" + major;
    }
}