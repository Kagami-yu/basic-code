package com.itheima;
//敏感词替换
public class StringDemo10 {
    public static void main(String[] args) {
        String talk1="你玩的真好md，以后别玩了，tmD";
        //把tmD替换成***
        String talk=talk1.replace("tmD","***");
        //System.out.println(newtalk1);


        //实际中屏蔽词没有那么少，所以可以建立敏感词库
        String[] arr={"tmd","Tmd","tMd","tmD","TMD","md"};
        for (int i = 0; i < arr.length; i++) {
            talk1= talk1.replace(arr[i],"***");
        }
        System.out.println(talk1);
    }
}
