package com.itheima.test;
//max与min中的值一定要是在数组中有的数据
public class test8 {
    public static void main(String[] args) {
        //最大值
        int arr[]={11,22,5,41,55};
        int max=arr[0];
        //i代表次数，次数小于数组长度就一直循环
        //int i=0会使原指定数多参与一次无意义比较，浪费算力，改为->int i=1
        for(int i=1;i<arr.length;i++){
            //任意定义一个数组元素为max，若新数组元素大于max则取代
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("该数组最大值为"+max);
        //最小值
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("该数组最小值为"+min);
    }
}
