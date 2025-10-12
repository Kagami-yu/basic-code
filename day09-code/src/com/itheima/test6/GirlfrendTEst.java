package com.itheima.test6;


import java.util.Scanner;

public class GirlfrendTEst {
    public static void main(String[] args) {
        //数组存数据
        Girlfriend[] arr = new Girlfriend[4];
        Scanner sc = new Scanner(System.in);
        /// //////////////////////////////////////
        for (int i = 0; i < arr.length; i++) {
            Girlfriend gf= new Girlfriend();
            System.out.println("录入姓名，当前为第" + i + "次");
            String n = sc.next();
            gf.setName(n);//赋值
            System.out.println("录入年龄，当前为第" + i + "次");
            int a = sc.nextInt();
            gf.setAge(a);
            System.out.println("录入性别，当前为第" + i + "次");
            String g=sc.next();
            gf.setGender(g);
            System.out.println("录入爱好，当前为第" + i + "次");
            String g1=sc.next();
            gf.setHobby(g1);
            arr[i]=gf;
        }
        /// //////////////////////////////////////
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            Girlfriend gf1=arr[i];
            sum=sum+gf1.getAge();
        }
        double avg=sum*1.0/arr.length;
        System.out.println("平均数为:"+avg);
        /// //////////////////////////////////////
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() < avg) {
                j++;
                Girlfriend gf2=arr[i];
                System.out.println("低于年龄平均数的数据："+gf2.getName()+","+gf2.getAge()+","+gf2.getHobby());
            }
        }
        System.out.println("低于平均年龄的有"+j+"个");
    }
}
