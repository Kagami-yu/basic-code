package com.itheima.cloneDemo;
/*
重写Object中的clone方法
让javabean类实现cloneable接口
创建源对象并调用clone方法
 */
public class test1{
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data={1,2,3,4,5};
        User user1 = new User("zhang",18,data);
        //克隆对象
        //浅克隆
//        User user2=(User) user1.clone();
//        System.out.println(user1);
//        System.out.println(user2);
        //深克隆
        User user2=(User) user1.clone();//先克隆
        int[] arr=user1.getData();//这里是将u1的data地址值与arr共享，修改arr也相当修改了data里面的值
        arr[0]=100;
        System.out.println(user1);//User{name:zhang,age:18进度:[100,2,3,4,5]}
        System.out.println(user2);//User{name:zhang,age:18进度:[1,2,3,4,5]}
    }
}
