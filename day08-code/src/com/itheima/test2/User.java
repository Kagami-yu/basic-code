package com.itheima.test2;

public class User {
    private String username;
    private String email;
    private String passward;
    private int age;
    private char gender;
    //空参
    public User(){}
    //含参
    public User(String username, String email, String passward, int age, char gender) {
        this.username = username;
        this.email = email;
        this.passward = passward;
        this.age = age;
        this.gender = gender;
    }
    //---------------------------------------------------//
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setPassward(String passward){
        this.passward=passward;
    }
    public String getPassward(){
        return passward;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setGender(char gender){
        this.gender=gender;
    }
    public char getGender(){
        return gender;
    }
}
