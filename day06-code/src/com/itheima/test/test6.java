package com.itheima.test;
/*
需求：定义一个方法copyOfRange(int[] arr,int from,int to)
功能：将数据arr中从索引from(包含from)开始。
到索引to结束(不包含to)的元素复制到新数组中，将新数组返回
 */
public class test6 {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,7,5,46,10};
        copyOfRange(arr,3,7);
    }
    public static int[] copyOfRange(int arr[],int from,int to){
        int[] arr1=new int[to-from];
        for(int i=from,j=0;i<to;i++,j++){
            arr1[j]=arr[i];
        }
        for(int k=0;k<arr1.length;k++) {
            System.out.print(arr1[k]+",");
        }
        return arr1;//返回数组得int[]
    }
}
