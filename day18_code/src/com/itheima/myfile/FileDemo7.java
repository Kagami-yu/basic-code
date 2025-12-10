package com.itheima.myfile;

import java.io.File;

public class FileDemo7 {
    public static void main(String[] args) {
        //查找所有盘符的txt文件
        findRoots();
    }
    public static void findRoots(){
        //遍历每一个盘符
        File[] arr=File.listRoots();
        for(File f:arr){
            findTxt(f);
        }
    }

    public static void findTxt(File src) {
        //查找盘符里面的文件或者文件夹
        File[] files = src.listFiles();
        //排除无权限文件夹或文件返回null
        if (files != null) {
            for (File file : files) {
                //文件
                if (file.isFile()) {
                    if (file.getName().endsWith(".txt")) {
                        System.out.println(file);
                    }
                } else {
                    //文件夹的判断--直接递归
                    findTxt(file);
                }
            }
        }
    }
}
