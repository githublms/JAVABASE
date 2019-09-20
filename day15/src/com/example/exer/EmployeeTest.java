package com.example.exer;

/*
 * 请使用继承的思想，设计CommonEmployee类和Manager类，要求类中提供必要的方法进行属性访问。
 */
public class EmployeeTest {

//    员工在一线生产线上生产产品
//    管理员工，提高运行效率
    public static void main(String[] args) {
        Employee employee = new CommonEmployee();//多态
        employee.work();

        Manager manager = new Manager(2.56);
        manager.work();
    }

}
