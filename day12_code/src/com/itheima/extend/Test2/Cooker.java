package com.itheima.extend.Test2;

public class Cooker extends Worker {
    public Cooker(){}
    public Cooker(String id,String name,double salary){
        super(id,name,salary);
    }
    @Override
    public void work(){
        System.out.println("厨师正在炒菜");
    }
}
