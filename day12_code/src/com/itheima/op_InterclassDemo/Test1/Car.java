package com.itheima.op_InterclassDemo.Test1;

import javax.swing.*;

public class Car {
    String brand;
    int carAge;
    String carColor;
    //外部类无法获得内部类
    //外部列要访问内部类必须创建内部类的对象
    Enging e=new Enging();
    public void show(){
        System.out.println(brand);
        System.out.println(e.engingName);
    }

    //内部类--可以直接访问外部类包括私有
    class Enging {
        String engingName;
        int engingAge;

        public void show() {
            System.out.println(engingName);
            System.out.println(brand);
        }
    }
}
