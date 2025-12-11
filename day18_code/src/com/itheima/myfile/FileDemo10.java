package com.itheima.myfile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileDemo10 {
    private static Map<String, Integer> countMap = new HashMap<>();
    public static void main(String[] args) {
        File src=new File("D:\\javaFileTest");
        countFiles(src);
        check(countMap);

    }
    public static void countFiles(File src) {
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String name = file.getName();
                    String[] arr=name.split("\\.");
                    if(arr.length>=2){
                        //已经存过map的
                        String endName=arr[arr.length-1];
                        if(countMap.containsKey(endName)){
                            countMap.put(endName,countMap.get(endName)+1);
                        }else{
                            //没有存过map集合的后缀文件
                            countMap.put(endName,1);
                        }
                    }
                }else{
                    countFiles(file);
                }
            }
        }
    }

    public static void check(Map<String, Integer> map) {
        map.entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
    }
}
