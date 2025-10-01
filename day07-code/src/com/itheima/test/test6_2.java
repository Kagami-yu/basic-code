package com.itheima.test;

import java.util.Scanner;

//解密
//对于加密时先加5再取余，解密得相反，0-4的先加10，然后每个数-5
public class test6_2 {
    public static void main(String[] args) {
        //录入
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp=num;
        int count=0;
        for (int i = 0;num!=0;i++){
            num=num/10;
            count++;
        }
        //存入数组
        int[] arr=new int[count];
        for (int i = 0;temp!=0;i++){
            int ge=temp%10;
            arr[arr.length-1-i]=ge;
            temp=temp/10;
        }
        //反转
        int temp1=0;
        for (int i = 0,j=arr.length-1;i<j;i++,j--){
            temp1=arr[i];
            arr[i]=arr[j];
            arr[j]=temp1;
        }
        for (int i = 0;i<arr.length;i++){
            if(arr[i]>=0&&arr[i]<=4){
                arr[i]=arr[i]+10;
            }
            arr[i]=arr[i]-5;
        }
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
