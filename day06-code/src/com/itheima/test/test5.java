package com.itheima.test;

public class test5 {
    public static void main(String[] args) {
    int arr[]={20,5,1,6,3};
    boolean flag=contain(6,arr);
        System.out.println(flag);
    }
    public static boolean contain(int getNum, int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==getNum){
                return true;//不能用break
            }
        }
        return false;
    }
}
//return和方法有关系，和循环没什么关系，表示1结束方法，2返回结果
//如果执行到return，整个方法全部结束，里面循环也随之结束

//break和方法没什么关系，结束循环或switch

