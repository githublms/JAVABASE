package com.example.exer;

/**
 *  管理者既是员工，还拥有其他属性
 */
public class Manager extends Employee {

    private double bonus; //奖金

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    void work() {
        System.out.println("管理员工，提高运行效率");
    }
}
