package com.itheima.test.Test2;

public class Test2 {
    public static void main(String[] args) {
        //不死神兔
        //1.斐波那契数列求解
        int[] arr=new int[12];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[arr.length-1]);

        //2.方法的递归
        int res=getSum(12);
        System.out.println(res);
    }
    public static int getSum(int month){
        //方法的出口
        //递归可看做是自结束到开始的相加后赋值
        if(month==1||month==2){
            return 1;
        }else{
            return getSum(month-1)+getSum(month-2);
        }
    }
}
