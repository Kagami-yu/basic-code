package com.itheima.myexception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        /*
            public String getMessage()    返回此throwable的详细消息字符串
            public String toString()      返回可抛出的简短描述
            public void printStackTrace() 把异常的错误信息输出在控制台
         */
        int[] arr={1,2,3,4,5,6};
        try{
            System.out.println(arr[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            //System.out.println(e.getMessage());
            //Index 10 out of bounds for length 6

            //System.out.println(e.toString());
            //java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6

            e.printStackTrace();
        }
        System.out.println("看看我执行了吗");
    }
}
