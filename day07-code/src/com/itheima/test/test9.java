package com.itheima.test;

public class test9 {
    public static void main(String[] args) {
        //二维数组静态初始化
        //二维数组遍历
        int[][] arr = {
                {1, 2, 3},
                {3, 4, 5, 6, 7}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //二维数组动态初始化
        /*
        数据类型[][] 数组名=new 数据类型[m][n]
        m表示这个二维数组可以存放多少个一维数组
        n表示每一个一维数组可以放多少个元素
         */
        int[][] arr2 = new int[3][5];
        arr2[0][1] = 10;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        int[][] arr3 = new int[2][5];
        int[] arrA={1,2,3};
        int[] arrB={4,5,6,7};
        arr3[0]=arrA;
        arr3[1]=arrB;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        int[][] arr4 = new int[2][];
        arr4[0]=arrA;
        arr4[1]=arrB;
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
