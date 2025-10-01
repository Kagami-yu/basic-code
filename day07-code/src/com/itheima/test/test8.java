package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

//红球1-33篮球1-16--红球6个蓝球1个
public class test8 {
    public static void main(String[] args) {

        //生成中奖号码
        int[] arr = getNum();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("======================");
        //用户得到的号码
        int[] arr1 = userInputNum();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        //检验中奖
        int blueCount = 0;
        int redCount = 0;
        //减一是红球数量
        for (int i = 0; i < arr.length - 1; i++) {
            int redNumber = arr1[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == redNumber) {
                    redCount++;
                    //跳出内循环
                    break;
                }
            }
        }
        if (arr[6] == arr1[6]) {
            blueCount++;
        }
        int count = blueCount + redCount;
        if (count == 1 || count == 2) {
            System.out.println("六等奖5元");
        } else if (count == 3 || count == 4) {
            System.out.println("五等奖10元");
        } else if (count == 5) {
            System.out.println("四等奖200元");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("三等奖1000元");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("二等奖--最高500万");
        } else if (count == 7) {
            System.out.println("一等奖--最高1000万");
        } else {
            System.out.println("没有中奖");
        }
    }

    public static int[] userInputNum() {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[7];
        for (int i = 0; i < arr1.length - 1; ) {
            System.out.println("请输入红球数字，当前次数:" + (i + 1));
            int redNum = sc.nextInt();
            boolean flag = contains(arr1, redNum);
            if (redNum >= 1 && redNum <= 33) {
                arr1[i] = redNum;
                //确保不重复
                if (!flag) {
                    arr1[i] = redNum;
                    i++;
                } else {
                    System.out.println("数字重复");
                }
            } else {
                System.out.println("无效数字");
            }
        }
        for (; ; ) {
            System.out.println("请输入蓝球数字");
            int blueNum = sc.nextInt();
            if (blueNum >= 1 && blueNum <= 16) {
                arr1[6] = blueNum;
                break;
            } else {
                System.out.println("重新输入");
            }
        }
        return arr1;
    }

    public static int[] getNum() {
        int[] arr = new int[7];
        Random rand = new Random();
        int getBlue = rand.nextInt(16) + 1;
        //获取红球
        for (int i = 0; i < 6; ) {
            int getRed = rand.nextInt(33) + 1;
            boolean flag = contains(arr, getRed);
            if (!flag) {
                arr[i] = getRed;
                i++;
            }
        }
        //获取蓝球
        arr[arr.length - 1] = getBlue;
        return arr;
    }

    //判断是否有相同的数
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
