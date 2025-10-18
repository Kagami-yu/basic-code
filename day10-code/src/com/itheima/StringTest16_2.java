package com.itheima;
//先把字符串变为一个字符数组，然后调整数组里面的数据，最后再把字符拼接成字符串
public class StringTest16_2 {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdab";
        System.out.println(judge(a,b));
    }

    public static boolean judge(String str, String str2) {
        for (int i = 0; i < str.length(); i++) {
            str = rotate(str);
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }
    //旋转
    public static String rotate(String str) {
        char[] arr = str.toCharArray();
        char first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
        return new String(arr);
    }
}
