package com.itheima.systemDemo;

public class Demo {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        int[] arr2=new int[10];
        //从arr1的4索引开始拷贝3个数到arr2，从0索引开始填入
        System.arraycopy(arr1,4,arr2,0,3);
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        System.exit(0);
        System.out.println("看我有没有执行");
    }
}
