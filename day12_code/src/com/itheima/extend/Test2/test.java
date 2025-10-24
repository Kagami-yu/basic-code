package com.itheima.extend.Test2;

import java.sql.SQLOutput;

public class test {
    public static void main(String[] args) {
        Manager manager = new Manager("1", "yu", 3000.0, 500.0);
        Cooker cooker = new Cooker("2", "ui", 4000);

        System.out.println(manager.getWork_id()+"//"+manager.getName()+"//"+manager.getSalary()+"//"+manager.getBouns());
        manager.work();
        manager.eat();
        System.out.println(cooker.getWork_id()+"//"+cooker.getName()+"//"+cooker.getSalary());
        cooker.eat();
        cooker.work();
    }
}
