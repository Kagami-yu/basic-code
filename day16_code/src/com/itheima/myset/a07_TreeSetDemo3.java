package com.itheima.myset;

import java.util.TreeSet;

public class a07_TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((o1, o2)->{
                int temp = o1.length() - o2.length();
                temp = temp == 0 ? o1.compareTo(o2) : temp;
                return temp;
            }
        );
        ts.add("bab");
        ts.add("acd");
        ts.add("qwer");
        ts.add("c");
        for(String s: ts){
            System.out.println(s);
        }
    }
}
