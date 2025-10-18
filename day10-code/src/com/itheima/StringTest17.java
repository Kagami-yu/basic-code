package com.itheima;

import java.util.Random;

/*
生成验证码，4为英文字母，一位数字，不过数字位置随机，字母可大小写,长度为5
 */
public class StringTest17 {
    public static void main(String[] args) {
        Random random = new Random();
        char[] chars1 = new char[52];
        //存入大小写
        for (int i = 0; i < chars1.length-26; i++) {
            chars1[i]=(char)(65+i);
            chars1[i+26]=(char)('a'+i);
        }
        char[] chars2 =new char[5];
        for(int j=0;j<4;j++){
            int rand1 = random.nextInt(chars1.length);
            chars2[j]=chars1[rand1];
        }
        //拼接数字
        int rand2 = random.nextInt(10);
        chars2[chars2.length-1]=(char)(rand2+48);
        //将数字随机插入
        int rand3 = random.nextInt(5);
        char temp=chars2[chars2.length-1];
        chars2[chars2.length-1]=chars2[rand3];
        chars2[rand3]=temp;
        System.out.println(new String(chars2));
    }
}
