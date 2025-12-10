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
            } catch (NameFormatException e) {
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
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
            throw new AgeOutOfBoundsException(age+"年龄不规范");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3 ||name.length() > 10) {
            throw new NameFormatException(name+"长度不规范");
        }
        this.name = name;
    }
}

class NameFormatException extends RuntimeException {
    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}

class AgeOutOfBoundsException extends RuntimeException {
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}