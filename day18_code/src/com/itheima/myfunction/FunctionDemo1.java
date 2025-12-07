package com.itheima.myfunction;

import java.util.Arrays;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Integer[] arr={6,3,2,4,5,1};
//        Arrays.sort(arr,new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//        System.out.println(Arrays.toString(arr));
        //方法引用
        Arrays.sort(arr, FunctionDemo1::subtraction);
        System.out.println(Arrays.toString(arr));
    }

    /*
        方法引用
            1.引用处是函数式接口
            2.被引用的方法需要已经存在
            3.被引用的方法的形参和返回值需要和抽象方法的形参和返回值一致
            4.被引用方法的功能需要满足当前要求
     */
    public static int subtraction(int a,int b){
        return b - a;
    }
}
