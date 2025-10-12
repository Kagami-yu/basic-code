package com.itheima.test5;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        //创建数组
        Phone[] arr = new Phone[3];

        //将数据存入数组
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            Phone phone=new Phone();
            System.out.println("录入品牌");
            String name=sc.next();
            phone.setBrand(name);
            System.out.println("录入价格");
            int price=sc.nextInt();
            phone.setPrice(price);
            System.out.println("录入颜色");
            String color=sc.next();
            phone.setColor(color);
            //赋值
            arr[i]=phone;
        }
        /*
        for(int i=0;i<arr.length;i++){
            Phone phone1=arr[i];
            System.out.println(phone1.getBrand()+","+phone1.getPrice()+","+phone1.getColor());
        }
         */
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone1 = arr[i];
            sum=sum+phone1.getPrice();
        }
        double average=sum*1.0/arr.length;
        System.out.println(arr.length+"部手机平均价为： "+average);
    }
}


