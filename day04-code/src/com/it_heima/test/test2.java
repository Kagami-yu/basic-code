package com.it_heima.test;

//求1-100中的偶数和
public class test2 {
    public static void main(String[] args) {
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            //sum1 += i;第一次错误：先判断再求和
            //if(sum1%2==0)第二次错误示例，要判断i中符合条件的
            if (i % 2 == 0) {
                sum1 += i;
            }
        }
        System.out.println(sum1);
    }
}


