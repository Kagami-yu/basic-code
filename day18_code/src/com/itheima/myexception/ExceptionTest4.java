package com.itheima.myexception;

import java.util.Scanner;

public class ExceptionTest4 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc=new Scanner(System.in);
                GirlFriend gf=new GirlFriend();
                System.out.println("请输入姓名,姓名长度3-10");
                String name=sc.nextLine();
                System.out.println("请输入年龄,年龄区间18-30");
                String strAge=sc.nextLine();
                int age=Integer.parseInt(strAge);
                gf.setName(name);
                gf.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄格式有误");
            }catch(RuntimeException e){
                System.out.println("年龄或者姓名不符合规范");
            }
        }
    }
}
class GirlFriend{
    private int age;
    private String name;
    public GirlFriend(){}
    public GirlFriend(int age, String name){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age >30 ) {
            throw new RuntimeException();
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() == 3) {
            throw new RuntimeException();
        }
        this.name = name;
    }
}