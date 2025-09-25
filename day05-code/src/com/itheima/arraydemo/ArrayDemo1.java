package com.itheima.arraydemo;
//array->数据组+

public class ArrayDemo1 {
    public static void main(String[] args) {
        //int array1[]=new int{1,2,3,4,5};不知道为什么这个会报错
        //可简写为
        //int array2[]={1,2,3,4,5};
        double[] array3 = {1.1, 2.2, 3.3, 4.4, 5.5};
        // String[] array2={"a","b","c","d","e"};
        //数据取出以0开始，要加[]
        System.out.println(array3);//[D@1b6d3586
        /*
        [:表示当前是一个数组
        D:表示元素类型都是double的
        @:固定形式不用管
        后边长串:地址
         */
        //索引->若令array[0]=100->导致原来数组1.1被100覆盖
        System.out.println(array3[1]);//2.2
        //length表示该数组内有多少个元素
        System.out.println(array3.length);
    }
}
