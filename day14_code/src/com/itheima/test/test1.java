package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    /*
    int num=Integer.parseInt(str);
    num为基本数据类型,集合里的数据是Integer
    再添加数据的时候自动装箱,直接list.add(num)即可
    本来应该是list.add(Integer.valuesOf(num))
        ps:我没用到该方法
     */
    public  static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       ArrayList <String> list=new ArrayList<>();
       boolean flag=true;
       while(flag){
           System.out.println("请输入整数");
           String str=sc.nextLine();
           int num=Integer.parseInt(str);
           if(num>=1&&num<=100) {
               flag = check(str, list);
           }else{
               System.out.println("数据不正确重新时入");
           }
       }
    }
    public static boolean check(String str,ArrayList<String> list){
        list.add(str);
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum=sum+Integer.parseInt(list.get(i));
            if(sum>200){
                return false;
            }
        }
        return true;
    }
}
