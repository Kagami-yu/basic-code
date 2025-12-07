package com.itheima.myfunction;

import java.util.Arrays;

public class FunctionDemo2 {
    public static void main(String[] args) {
        String[] arr={"1","2","3","4","5","6"};
        Arrays.stream(arr).map(s-> Integer.parseInt(s)).forEach(System.out::println);
        Arrays.stream(arr).map(Integer::parseInt).forEach(System.out::println);
    }
}
