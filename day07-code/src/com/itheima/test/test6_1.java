package com.itheima.test;
//先得到每一位数，然后每位数加上5，再对10求余，最后将所有数字反转，再得到一串新数字
import java.util.Scanner;

//不同时反转
public class test6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int temp=num;//num再循环后边0，得记录
        for (int i = 0; num!= 0; i++) {
            num=num/10;
            count++;//可作数组长度
        }
        //System.out.println(count);4
        int[] arr=new int[count];//把得到的每个数存进数组里
        for (int i = 0;i<count;i++){
            int ge=temp%10;
            arr[arr.length-1-i]=ge;
            temp=temp/10;
        }
        for (int i = 0;i<count;i++){
            arr[i]=(arr[i]+5)%10;
        }//6,4,3,8
        int temp1=0;
        for (int i = 0,j=arr.length-1;i<j;i++,j--){
            temp1=arr[i];
            arr[i]=arr[j];
            arr[j]=temp1;
        }
        for (int i = 0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
