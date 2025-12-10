package com.itheima.myfile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo5 {
    public static void main(String[] args) {
        /*
            public static File[] listRoots()                列出可用的文件系统根
            public String[] list()                          获取当前该路径下所有内容(仅仅是名字)
            public String[] list(FilenameFilter filter)     利用文件名过滤器获取当前该路径下所有内容
            (control!)public File[] listFiles()             获取当前该路径下所有内容
            public File[] listFiles(FileFilter filter)      利用文件名过滤器获取当前该路径下所有内容
            public File[] listFiles(FilenameFilter filter)  利用文件名过滤器获取当前该路径下的所有内容
         */
        //1. listRoots 获取系统的所有盘符
        File[] arr=File.listRoots();
        System.out.println(Arrays.toString(arr));

        //2.  list()
        File file1=new File("D:\\javaFileTest");
        String[] arr2=file1.list();
        System.out.println(Arrays.toString(arr2));

        //3.list(FilenameFilter filter)
        //需求：我现在要获取D:\\javaFileTest文件夹里所有的text文件
        File file2=new File("D:\\javaFileTest");
        //accept方法的形参依次表示javaFileTest文件夹里每一个文件或者文件夹的路径
        //参数一：父级路径      参数二：子级路径
        //返回值：返回值如果为true，就表示当前路径保留
        //       返回值为false，表示当前路径舍弃不要
        String[] arr3=file2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file=new File(dir,name);
                return file.isFile()&&name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr3));

    }
}
