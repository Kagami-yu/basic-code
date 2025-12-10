package com.itheima.myfile;

import java.io.File;

public class FileDemo8 {
    public static void main(String[] args) {
        File file=new File("D:\\javaFileTest\\aaa");
        deleteFile(file);
    }
    public static void deleteFile(File src){
        File[] files=src.listFiles();
        if(files!=null){
            for(File f:files){
                if(f.isFile()){
                    f.delete();
                }else{
                    deleteFile(f);
                }
            }
            //文件删除后再删除文件夹本身
            src.delete();
        }
    }
}
