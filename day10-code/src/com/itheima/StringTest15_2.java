package com.itheima;

import java.util.Scanner;
import java.util.StringJoiner;

public class StringTest15_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;//循环后赋值上键盘录入的值了
        while(true){
            System.out.println("请输入一个字符串");
            str=sc.next();
            boolean flag =getnum(str);
            if(flag){
                break;
            }else{
                System.out.println("数据不合规");
            }
        }
        StringJoiner sj = new StringJoiner(" ");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            sj.add(getLoMa(ch-48));
        }
        System.out.println(sj.toString());
    }

    //定义一个随之循环调用罗马数字的方法
    public static String getLoMa(int num){
        String[] str={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return str[num];
    }

    //判断键盘录入是否合规
    public static boolean getnum(String str){
        //是否为长度<=9
        if(str.length()>9){
            return false;
        }
        //是否为纯数字
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch<'0'||ch>'9'){
                return false;
            }
        }
        return true;
        /*
        //是否为长度<=9
        if(str.length()>9){
            return false;
        }
        放在下面一直不会执行到
         */
    }
}
