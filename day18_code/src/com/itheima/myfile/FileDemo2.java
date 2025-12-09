package com.itheima.myfile;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args)throws IOException {
        /*
            public boolean createNewFile()     创建一个新的空的文件夹
            public boolean mkdir()             创建单级文件夹
            public boolean mkdirs()            创建多级文件夹
            public boolean delete()            删除文件，空文件夹

            1.createNewFile创建一个新的空的文件夹
            细节1：
                如果当前路径表示的文件是不存在的，则创建成功，方法返回true
                如果当前路径表示的文件是存在的，则创建失败，返回false
            细节2：
                如果父级路径是不存在的，方法会有异常IOException
            细节3：
                createNewFile一定是文件，如果路径中不包含后缀名，则创建一个没有后缀名的文件


            2.mkdir细节1：
                        windows当前路径是唯一的，如果当前路径已经存在，则创建失败，返回false
                   细节2；
                        mkdir方法只能出那个键单机文件及，无法创建你多级文件夹
         */
        File file1=new File("D:\\javaFileTest\\ee.txt");
        System.out.println(file1.createNewFile());

        File file2=new File("D:\\javaFileTest\\EEE\\FFF");
        System.out.println(file2.mkdir());//false

        File file3=new File("D:\\javaFileTest\\EEE\\FFF");
        System.out.println(file3.mkdirs());

        System.out.println(file1.delete());
    }
}
