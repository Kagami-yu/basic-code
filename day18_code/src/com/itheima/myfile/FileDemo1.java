package com.itheima.myfile;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        /*
            public File(String pathname)    把字符串路劲变为file对象
            public File(String parent,String child)    把父级路劲和子级路径进行拼接
            public File(File parent,String child)
         */
        String path1="D\\javaFileTest";
        String path2="aaa";
        File file1=new File(path1);
        File file2=new File(file1,path2);

    }
}
