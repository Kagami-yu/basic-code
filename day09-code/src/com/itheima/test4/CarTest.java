package com.itheima.test4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //创建数组
        Car[] arr = new Car[3];
        //创建空参对象,数据来源于键盘录入

        Scanner sc = new Scanner(System.in);
        //Car car = new Car();放在循环外，每次录入都会被覆盖

        for(int i=0;i<arr.length;i++){

            Car car = new Car();//放在循环内每次录入新对象，不会被覆盖

            System.out.println("录入品牌");
            String brand_data = sc.next();
            car.setBrand(brand_data);//把brand_data录入到对象里面

            System.out.println("录入价格");
            int price_data = sc.nextInt();
            car.setPrice(price_data);

            System.out.println("录入颜色");
            String color_data = sc.next();
            car.setColor(color_data);

            //把汽车对象添加到数组当中
            arr[i]=car;
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Car car1 = arr[i];
            System.out.println(car1.getBrand()+","+car1.getPrice()+","+car1.getColor());
        }
    }
}
