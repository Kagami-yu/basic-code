package com.itheima.test6;

public class Girlfriend {
    private String name;
    private int age;
    private String gender;
    private String hobby;

    public Girlfriend(){}

    public Girlfriend(String name,int age,String gender,String hobby){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.hobby=hobby;
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
    /// //////////////////////////
    public void setAge(int age) {
        if(age>=18&&age<=35) {
            this.age = age;
        }else{
            System.out.println("非法数据");
        }
    }
    /// ///////////////////////////
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


}
