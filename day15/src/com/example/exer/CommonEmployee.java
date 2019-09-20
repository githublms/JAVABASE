package com.example.exer;

/**
 *  一线员工
 */
public class CommonEmployee extends Employee{

    @Override
    void work() {
        System.out.println("员工在一线生产线上生产产品");
    }
}
