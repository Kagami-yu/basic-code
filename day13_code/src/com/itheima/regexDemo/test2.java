package com.itheima.regexDemo;

public class test2 {
    public  static void main(String[] args) {
        String regex1="1[3-9]\\d{9}";
        System.out.println("13112311231".matches(regex1));//true
        System.out.println("13412311231".matches(regex1));//true
        System.out.println("133123112315".matches(regex1));//false
        System.out.println("18022556644".matches(regex1));//true

        /*
        座机电话号码
        020-2324242 2233445 0712-1234567
        一，区号:0开头，开头后两位或三位
        二，-:可以出现也可以不出现，出现的话只能之多一次
        三号码--5-10位
         */
        String regex2="0\\d{2,3}-?\\d{5,10}";
        System.out.println("020-2324242".matches(regex2));//true
        System.out.println("02233445".matches(regex2));//true
        System.out.println("0712-1234567".matches(regex2));//true
        System.out.println("------------------------------");
        /*
        邮箱号码
        1234567@qq.com zhangsan@itcast.com dlei0009@163.com dile0009@pci.com.cn
         */
        String regex3="\\w+@[\\w[^_]]{2,7}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("1234567@qq.com".matches(regex3));
        System.out.println("zhangsan@itcast.com".matches(regex3));
        System.out.println("dlei0009@163.com".matches(regex3));
        System.out.println("dile0009@pci.com.cn".matches(regex3));
    }
}
