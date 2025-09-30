package com.itheima.test;

import java.util.Scanner;

/*
6个评委打分，打分区间在0-100，结果除去最高和最低值计算平均数
 */
public class test5 {
    //取平均
    public static void main(String[] args) {
        int[] scoreArr2=getScore();
        int max=getMax(scoreArr2);
        int min=getMin(scoreArr2);
        int sum=0;
        for(int j=0;j<scoreArr2.length;j++){
            sum+=scoreArr2[j];
        }
        System.out.println(sum);
        int ave=(sum-max-min)/(scoreArr2.length-2);
        System.out.println("平均数为"+ave);
    }
        //打分
    public static int[] getScore() {
        Scanner sc = new Scanner(System.in);
        int[] scoreArr1 = new int[6];
        for (int i = 0; i < scoreArr1.length; ) {
            System.out.println("输入评分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scoreArr1[i] = score;
                i++;
            } else {
                System.out.println("重新输入有效数字" + "当前次数：" + i);
            }
        }
        return scoreArr1;
    }
        //max值
    public static int getMax(int[] scoreArr1) {
        int max = scoreArr1[0];
        for (int i = 1; i < scoreArr1.length; i++) {
            if (scoreArr1[i] > max) {
                max = scoreArr1[i];
            }
        }
        return max;
    }
        //min值
        public static int getMin(int[] scoreArr1) {
            int min = scoreArr1[0];
            for (int i = 1; i < scoreArr1.length; i++) {
                if (scoreArr1[i] < min) {
                    min = scoreArr1[i];
                }
            }
            return min;
        }
}
