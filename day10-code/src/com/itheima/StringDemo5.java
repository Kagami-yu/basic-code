package com.itheima;
//拼接字符串
public class StringDemo5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String result = refix(arr);
        System.out.println(result);
    }


    //遍历数组拼接成字符串
    public static String refix(int[] arr) {
        if (arr.length == 0) {
            return "[]";
        }
        if (arr == null) {
            return "";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                result = result + arr[i] + ",";
            } else if (i == arr.length - 1) {
                result = result + arr[i];
            }
        }
        result += "]";
        return result;
    }
}
