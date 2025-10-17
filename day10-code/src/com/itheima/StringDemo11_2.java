package com.itheima;

public class StringDemo11_2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");
        System.out.println(sb);

        //把StringBuilder转化为字符串类型
        String str=sb.toString();
        //转化为字符串类型就可以用String的方法了
        str=str.replace("aaa","AAA");
        System.out.println(str);
    }
}
