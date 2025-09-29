package com.itheima.test;

import java.util.Random;

//生成验证码前四个随机大小写字母，最后数字随机
//a--97 A--65
public class test4 {
    public static void main(String[] args) {
        //生成数组
        char[] chs = new char[52];
        //大小写字母存入数组中
        for (int i = 0; i < chs.length; i++) {
            if (i < 26) {
                chs[i] = (char) (i + 97);
            } else {
                chs[i] = (char) (65 + i - 26);
            }
        }
        //大小写字母随机排序
        //使输出结果为字符串
        String result="";//空字符串
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            int random1 = rand.nextInt(chs.length);
            chs[i] = chs[random1];//索引0-4替换为随机字母
            //System.out.print((char) chs[i]);
            result += chs[i];
        }
        //差数字，利用随机
        int rand2=rand.nextInt(10);//0-9
        result=result+rand2;
        System.out.println(result);//生成随机5位验证码
    }
}
