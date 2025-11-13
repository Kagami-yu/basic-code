package com.itheima.integerdemo;

public class IntegerDemo3 {
    public static void main(String[] args) {
        //jdk5提出一个机制：自动装箱和自动拆箱
        //自动拆箱：把基本数据类型自动变成其对应的包装类
        //自动装箱：把包装类自动变成基本数据类型
        //自动装箱
        Integer i1=10;//在底层会自动调用valueOf静态方法再得到一个Integer对象，不过这个动作不需要我们自己动手
        Integer i2=new Integer(10);
        //自动拆箱
        int i=6;
        System.out.println(i+i1);

        //再jdk5以后int和Integer可以看做是同一个东西，在内部会自动优化
    }
}
