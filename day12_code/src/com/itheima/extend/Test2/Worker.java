package com.itheima.extend.Test2;

public class Worker {
    private String work_id;
    private String name;
    private double salary;

    public Worker(String work_id, String name, double salary) {
        this.work_id = work_id;
        this.name = name;
        this.salary = salary;
    }
    public Worker() {}

    public String getWork_id() {
        return work_id;
    }
    public void setWork_id(String work_id) {
        this.work_id = work_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void eat(){
        System.out.println("员工正在吃米饭");
    }
    public void work(){
        System.out.println("员工正在工作");
    }
}
