package com.itheima.objectDemo;

public class User {
    private String name;
    private int age;
    private int[] data;
    public User() {}
    public User(String name,int age,int[] data){
        this.name=name;
        this.age=age;
        this.data=data;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int[] getData() {
        return data;
    }
    public void setData(int[] data) {
        this.data = data;
    }
    @Override
    //默认为地址值，所以要重写，变为属性值
    public String toString() {
        return name+","+age+","+swString(data);
    }
    private String swString(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i!=arr.length-1) {
                sb.append(arr[i] + ",");
            }else{
                sb.append(arr[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
