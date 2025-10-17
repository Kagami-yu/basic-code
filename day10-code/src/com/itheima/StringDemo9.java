package com.itheima;
//身份证号查看
public class StringDemo9 {
    public static void main(String[] args) {
        String idnum="321281202001011234";
        //7-14位：出生年月日
        //17位--男奇数，女偶数
        //注意括号内以为索引
        String birthy=idnum.substring(6,10);
        String birthm=idnum.substring(10,12);
        String birthd=idnum.substring(12,14);
        String[] arr={"年","月","日"};
        System.out.println("出生年月日为:"+birthy+arr[0]+birthm+arr[1]+birthd+arr[2]);
        //判断性别
        char ch=idnum.charAt(16);
        //ascii中0为48
        if(ch%2==0){
            //偶数
            System.out.println("性别：女");
        }else{
            System.out.println("性别：男");
        }
    }
}
