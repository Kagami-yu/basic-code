package com.itheima;

public class StringTest13_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(getstring(arr));
    }

    //调用方法把数组变为字符串
    public static String getstring(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
                break;
            }
            sb.append(arr[i] + ",");
        }
        sb.append("]");
        return sb.toString();
    }
}
