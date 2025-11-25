package com.itheima.map;

import java.util.*;

public class a04_MapDemo4 {
    public static void main(String[] args) {
        //投票
        String[] arr={"A","B","C","D"};
        ArrayList<String> list=new ArrayList<>();
        //储存投票数
        Random random=new Random();
        for(int i=0;i<80;i++){
            int index=random.nextInt(arr.length);
            list.add(arr[index]);
        }
        //统计投票数
        Map<String,Integer> map=new HashMap<>();
        for(String name:list){
            //存在
            if(map.containsKey(name)){
                int count=map.get(name);
                map.put(name,count+1);
            }//不存在
            else{
                map.put(name,1);
            }
        }
        //遍历获取最大票数
        map.entrySet().forEach( entry -> System.out.println(entry.getKey()+":"+entry.getValue()));
        Set<Map.Entry<String,Integer>> entries=map.entrySet();
        int max=0;
        for(Map.Entry<String,Integer> entry:entries){
            max=max<entry.getValue()?entry.getValue():max;
        }
        //看最多票数的是哪个景点
        for(Map.Entry<String,Integer> entry:entries){
            int count=entry.getValue();
            if(count==max){
                System.out.println(entry.getKey());
            }
        }
    }
}
