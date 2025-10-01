package com.itheima.test;
//存新数组
import java.util.Random;

//抢红包
// {2,588,888,1000,10000}五个奖金，用代码模拟抽奖，打印出每个奖项，奖项出现随机且不重复
public class test7 {
    public static void main(String[] args) {
        int arr[] = {2, 588, 888, 1000, 10000};
        Random rand = new Random();
        //定义新数组存储
        int[] newArr = new int[arr.length];
        for (int i = 0; i < 5; ) {
            //随机抽取索引
            int a = rand.nextInt(arr.length);
            //奖品替换到新索引
            int prize = arr[a];
            boolean flag = contains(newArr, prize);
            //!falg=>>falg=false
            if (!flag) {
                newArr[i] = prize;
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
