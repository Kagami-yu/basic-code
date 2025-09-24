package com.it_heima.test;

/*
珠穆朗玛峰（8844.43m=8844430mm）
一张纸厚度0.1mm，叠多少次可以折成珠穆朗玛峰的高度
 */
public class test4 {
    public static void main(String[] args) {
      /*  int count = 0;
        for (float a = (float)0.1; a <= 8844430; a = a * 2) {
           // System.out.println(a);
            count++;
        }
        System.out.println(count);*/
        int count = 0;
        float a = (float) 0.1;
        while (a <= 8844430) {
            // System.out.println(a);
            a *= 2; //a = a * 2;
            count++;
        }
        System.out.println(count);
    }
}