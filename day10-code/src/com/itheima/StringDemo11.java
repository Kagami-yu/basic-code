package com.itheima;

import com.sun.org.apache.xpath.internal.SourceTree;

/*
StringBuilder可以看做一个容器，创建之后里面的内容都是可变的
 */
public class StringDemo11 {
    public static void main(String[] args) {
        int[] arr={65,55};
        //创建对象
        //StringBuilder打印的不是地址值而是属性值
        StringBuilder sb=new StringBuilder("投币");
/*
        //为对象sb添加属性值，添加的值依次排列
        sb.append(1);
        sb.append(99.9);
        sb.append(true);
        sb.append(arr);
        System.out.println(sb);//投币199.9true[I@1b6d3586--不是字符串类型

 */
        sb.reverse();//反转--一般字符串不可以反转，但是StringBuilder不同
        System.out.println(sb);

        //获取长度
        System.out.println(sb.length());


    }
}
