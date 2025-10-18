package com.itheima.ArrayListTest;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("a1");
        list.add("b2");
        list.add("c3");
        list.add("d4");
        String res="[";
        for(int i=0;i<list.size();i++){
            if(list.size()-1==i){
                res=res+list.get(i);
                break;
            }
            res=res+list.get(i)+",";

        }
        System.out.println(res+"]");
    }
}
