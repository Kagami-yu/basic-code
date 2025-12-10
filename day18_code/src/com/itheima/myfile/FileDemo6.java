package com.itheima.myfile;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo6 {
    public static void main(String[] args) {
        //(control!)public File[] listFiles()             获取当前该路径下所有内容
        //public File[] listFiles(FileFilter filter)      利用文件名过滤器获取当前该路径下所有内容
        //public File[] listFiles(FilenameFilter filter)  利用文件名过滤器获取当前该路径下的所有内
        File file = new File("D:\\javaFileTest");
        File[] arr = file.listFiles();
        for (File f : arr) {
            if (f.isFile() && f.getName().endsWith(".txt")) {
                System.out.println(f);
            }
        }
        File file1 = new File("D:\\javaFileTest");
        File[] arr1 = file1.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr1));
        File file2 = new File("D:\\javaFileTest");
        File[] arr2 = file2.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir, name);
                return file.isFile() && file.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr2));
    }
}
