package com.itheima;
//求一段英文字符串的最后一个单词的长度
public class StringTest19 {
    public static void main(String[] args) {
        String str="Fly me to the Skyyyyy";
        System.out.println(str.length());//17
        int len=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                break;
            }
            len++;
        }
        System.out.println(len);//3
    }
}
