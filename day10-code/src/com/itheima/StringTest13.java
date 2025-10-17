package com.itheima;

//字符串的拼接
public class StringTest13 {
    public static void main(String[] args) {
        String str=getstrarr();
        System.out.println("["+str+"]");
    }


    //定义一个返回int数组的方法
    public static String getstrarr() {
        int[] arr = {1, 2, 3};
        String res="";
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                res=res+arr[i];
                break;
            }
            res=res+arr[i]+",";
        }
        return res;
    }
}
