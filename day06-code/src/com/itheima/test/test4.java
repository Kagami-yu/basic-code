package com.itheima.test;

public class test4 {
    public static void main(String[] args) {
        int arr[]={11,33,21,55,64};
        int max=getMax(arr);
        System.out.println("最大值为"+max);
    }
    public static int getMax(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];//不能写反了
            }
        }
        return max;
    }
}
