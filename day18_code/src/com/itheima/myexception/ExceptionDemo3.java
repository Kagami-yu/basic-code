package com.itheima.myexception;;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        /*
            throws：写在方法定义处，表示声明一个异常，告诉调用者，使用本方法可能会有哪些异常
            throw：写在方法内，结束方法，手动抛出异常对象，交给调用者，方法下面的代码不再执行
         */
//        int[] arr={1,2,3,4,5,6};
        int[] arr=null;
        try {
            System.out.println(getMax(arr));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界异常");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }
        System.out.println("看看我执行了吗");
    }
    public static int getMax(int[] arr)throws ArrayIndexOutOfBoundsException,NullPointerException{
//        if(arr==null){
//            //手动创建一个异常方法,并把异常结果交给方法的调用者处理
//            //此时方法就会结束，下面的代码不会再执行了
//            throw new NullPointerException();
//        }
//        if(arr.length==0){
//            throw new ArrayIndexOutOfBoundsException();
//        }
        System.out.println("看看我执行了吗");
        int max=0;
        for (int i : arr) {
            max=max<i?i:max;
        }
        return max;
    }
}
