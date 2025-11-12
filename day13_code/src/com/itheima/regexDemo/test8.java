package com.itheima.regexDemo;

public class test8 {
    public static void main(String[] args) {
        String str="我要学学学编编编编编程程程程程程程程程程程程";
        //捕获分组
        //$1把正则表达式第一组的内容再拿出来用--外部调用
        //\\1内部调用
        String res=str.replaceAll("(.)\\1+","$1");
        System.out.println(res);//我要学编程
        //非捕获分组:分组后不需要在使用本数据，仅仅把数据括起来,不占用组号
        //(?:)(?=)(?!)
        // =表示Java后面跟的数据
        // :获取整体的数据
        // !后面所带的数据符合则不取
    }
}
