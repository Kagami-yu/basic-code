package com.itheima.InterDemo.Test1;

public class BasketballCoach extends Coach{
    public BasketballCoach() {}
    public BasketballCoach(String name,int age) {
        super(name,age);
    }
    @Override
    public void teach() {
        System.out.println(getAge()+"岁的"+getName()+"正在教打篮球");
    }
}
