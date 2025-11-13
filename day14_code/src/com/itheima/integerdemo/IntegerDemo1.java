package com.itheima.integerdemo;

public class IntegerDemo1 {
    public  static void main(String[] args) {
        /*
        public Integer(int value)根据传递的整数创建一个Integer对象
        public Integer(String s)根据传递的字符串创建一个Integer对象
        public static Integer valuesOf(int i)根据传递的整数创建一个Integer对象
        public static Integer valueOf(String s)根据传递的字符串穿件一个Integer对象
        public static Integer valueOf(String s,int radix)根据传递的字符串和进制创建爱一个Integer对象
         */
        //!1.利用构造方法获取Integer对象（JDK5以前的方式）
        Integer i1=new Integer(1);
        Integer i2=new Integer("2");
        System.out.println(i1);
        System.out.println(i2);
        //!2.利用静态方法获取Integer对象（JDK5以前的方式）
        Integer i3 = Integer.valueOf(1);
        Integer i4 = Integer.valueOf("1");
        Integer i5 = Integer.valueOf("66",8);
        System.out.println(i5);
        //节省内存-128~127有优化，返回创建好的对象，超出的话每次都是new出来的
        //两种获取方式的区别
        Integer i6 = Integer.valueOf(127);
        Integer i7 = Integer.valueOf(127);
        System.out.println(i6==i7);//true

        Integer i8 = Integer.valueOf(128);
        Integer i9 = Integer.valueOf(128);
        System.out.println(i8==i9);//false

        Integer i10 = new Integer(127);
        Integer i11 = new Integer(127);
        System.out.println(i10 == i11);//false

        Integer i12 = new Integer(128);
        Integer i13 = new Integer(128);
        System.out.println(i12==i13);//false
    }
}
