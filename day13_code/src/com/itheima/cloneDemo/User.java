package com.itheima.cloneDemo;

import com.itheima.objectDemo.Student;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

//想要克隆得有一个标记性接口，clone实现了就可以被克隆，没实现就不可以被克隆
public class User implements Cloneable{
    private String name;
    private int age;
    private int[] data;
    public User(String name,int age,int[] data){
        this.name=name;
        this.age=age;
        this.data=data;
    }
    public User(){}
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setData(int[] data){
        this.data=data;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int[] getData(){
        return this.data;
    }
    public String toString(){
        return "User{name:"+name+",age:"+age+"进度:"+arrToString()+"}";
    }
    private String arrToString(){
        StringJoiner sj=new StringJoiner(",","[","]");
        for(int i=0;i<data.length;i++){
            sj.add(data[i]+"");
        }
        return sj.toString();
    }
    //想使用clone方法得重写

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类的clone方法，相当于让java帮我们克隆一个对象，并把克隆的对象返回出去
        int[] data=this.data;//将传入的data地址赋值给该方法的data
        int[] newData=new int[data.length];
        for(int i=0;i<data.length;i++){
            newData[i]=data[i];
        }//拷贝长度与内容
        User u=(User)super.clone();//强转
        u.data=newData;//将数组地址值交给u对象
        return u;//返回新数组地址值
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Arrays.equals(data, user.data);
    }
}
