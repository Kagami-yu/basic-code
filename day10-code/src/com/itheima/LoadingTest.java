package com.itheima;

import java.util.Scanner;

public class LoadingTest {
    public static void main(String[] args) {
        String username = "yuzii";
        String password = "123456ab";
        Scanner sc = new Scanner(System.in);
        table:
        for (int i = 0; i < 3; ) {
            System.out.println("请输入你的用户名");
            String testname = sc.next();
            System.out.println("请输入你的密码");
            String testpassword = sc.next();

            if (testname.equals(username) && testpassword.equals(password)) {
                System.out.println("登陆成功");
                break;
            } else {
                i++;
                System.out.println("用户名或者密码错误,剩余重试次数" + (3 - i) + "/3");
                if (i == 3) {
                    System.out.println("请稍吼尝试，当前繁忙");
                    break table;
                }
            }
        }
    }
}

