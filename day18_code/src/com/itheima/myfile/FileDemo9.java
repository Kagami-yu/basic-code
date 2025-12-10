package com.itheima.myfile;

import java.io.File;

public class FileDemo9 {
    public static void main(String[] args) {
        File file=new File("D:\\javaFileTest");
        System.out.println(getLength(file));
    }
    public static long getLength(File src){
        File[] files = src.listFiles();
        long res=0;
        if(files!=null){
            for(File file:files){
                if(file.isFile()){
                    res+=file.length();
                }else{
                    res+=getLength(file);
                }
            }
        }
        return res;
    }
}
