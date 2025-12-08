package com.itheima.myexception;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[2]);
            System.out.println(10/0);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("索引溢出");
        }catch(ArithmeticException e){
            System.out.println("除数不能为0");
        }
        System.out.println("执行");
    }
}
