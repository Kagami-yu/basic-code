package com.it_heima.test;

//求1-5之间的和
public class test1 {
    public static void main(String[] args) {
        int sum = 0;//该行放进循环输出结果非累加只是sum+num的最终结果
        for (int num = 1; num <= 100; num += 1) {
            //System.out.println(num);
            //可以把得到的每一个变量累加给sum
            //sum += num;
            sum = sum + num;
        }
        System.out.println(sum);//该行放进循环内会循环打印到最终结果
    }
}
