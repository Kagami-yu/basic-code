package com.itheima.test.Test3;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(getSum(1));
    }
    public static int getSum(int day){
        if(day==10){
            return 1;
        }
        return (getSum((day+1))+1)*2;//内层嵌套为天数，外层嵌套为数量
    }
}
