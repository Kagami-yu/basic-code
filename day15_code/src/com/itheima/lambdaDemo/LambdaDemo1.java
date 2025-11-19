package com.itheima.lambdaDemo;

import java.util.Arrays;

/*
lambda可以简化匿名内部类的书写
lambda只能简化函数式接口的匿名内部类
函数式接口:
    有且仅有一个抽象方法的接口较函数式接口，接口上可以加@FunctionInterface注解
lambda的简写
    参数类型可以省略不写
    如果只有一个参数，参数类型可以省略，()也可以省略
    如果lambda表达式只有一行，大括好，分号，return也可以不写
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        Integer[] arr={9,5,7,8,6,3,4,1,2};
//        //匿名内部类
//        Arrays.sort(arr,new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });
        //lambda完整写法
//        Arrays.sort(arr,(Integer o1, Integer o2)->{
//                return o1-o2;
//            }
//        );
        //lambda省略写法
        Arrays.sort(arr,( o1,  o2)->o1-o2);
        System.out.println(Arrays.toString(arr));
    }
}
