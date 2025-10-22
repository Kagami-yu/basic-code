package com.itheima.StaticDemo.Demo1;

import java.util.ArrayList;

public class GetMax {
    private GetMax(){}
    public static int getMax(ArrayList<Student> list){
        int max = list.get(0).getAge();
//        list.get(i).getAge()效率低，进行循环要调用两次，用临时变量接收
        for(int i=1;i<list.size();i++){
            int tempAge=list.get(i).getAge();
            if(max< tempAge){
                max =  tempAge;
            }
        }
        return max;
    }
}
