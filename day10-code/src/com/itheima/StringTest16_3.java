package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class StringTest16_3 {
    public static void main(String[] args) {
        //键盘输入任意字符串，打乱里面的内容
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        System.out.println(getrandomnum(str));
    }

    public static String getrandomnum(String str) {
        char[] arr = str.toCharArray();//把字符串变为字符存入char类型数组中
        Random random = new Random();
        int num = random.nextInt(arr.length);
        for (int i = 0; i < arr.length; i++) {
            char temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;//随机打乱
        }
        return new String(arr);
    }
}
