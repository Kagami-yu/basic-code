package com.itheima.extend.Test2;

public class Manager extends Worker {
    private double bouns;

    public Manager(){}
    //父类加子类
    public Manager(String id,String name,double salary,double bouns) {
        super(id,name,salary);//传递给父类赋值
        this.bouns = bouns;//本类特有的在本类赋值
    }
    //get&set方法只需要写bouns,其他三个调用父类时已有get&set方法
    public void setBouns(double bouns){
        this.bouns = bouns;
    }
    public double getBouns(){
        return this.bouns;
    }
    @Override
    public void work(){
        System.out.println("经理在管理其他人");
    }

}
