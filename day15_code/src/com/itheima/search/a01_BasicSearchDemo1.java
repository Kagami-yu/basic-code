package com.itheima.search;

import java.util.ArrayList;

public class a01_BasicSearchDemo1 {
    public static void main(String[] args) {
        //基本查找/顺序查找,从0索引开始依次往后查找
        //定义一个方法，查找数组中的元素，需要考虑相同值，返回索引
        int[] arr={81,2,56,2,8,1,888,369,111};
        int num=20;
        if(basicSearch(arr,num).isEmpty()){
            System.out.println("没有找到");
        }else{
            for (int i = 0; i < basicSearch(arr, num).size(); i++) {
                System.out.print(basicSearch(arr, num).get(i)+" ");
            }
        }
    }
    public static ArrayList<Integer> basicSearch(int[] arr,int keyNum){
        ArrayList<Integer> list=new ArrayList<>();
        for(int index=0;index<arr.length;index++){
            if(arr[index]==keyNum){
                list.add(index);
            }
        }
        return list;
    }
}
