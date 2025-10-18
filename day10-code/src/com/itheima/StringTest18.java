package com.itheima;

public class StringTest18 {
    public static void main(String[] args) {
        String null1 = "1234567";
        String null2 = "12345";
        //接收数组
        int sum1 = getnum(getnumarr(null1));
        int sum2 = getnum(getnumarr(null2));
        System.out.println(sum1 * sum2);
    }

    //将字符串转化为int的方法，用char过度
    public static int[] getnumarr(String str) {
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[i] = ch - '0' + 1;
        }
        return arr;
    }

    //定义一个将int数组内数据拼接的方法
    public static int getnum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum * 10;
        }
        return sum;
    }
}
