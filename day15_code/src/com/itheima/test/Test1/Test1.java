package com.itheima.test.Test1;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Girlfriend gf1 = new Girlfriend("xiaowu", 18, 1.65);
        Girlfriend gf2 = new Girlfriend("xiaozhi", 18, 1.62);
        Girlfriend gf3 = new Girlfriend("aiaoling", 19, 1.60);
        Girlfriend gf4 = new Girlfriend("abke", 19, 1.60);
        Girlfriend[] arr = {gf1, gf2, gf3, gf4};
        //利用Array的sort方法进行排序--先按年龄再按名字
        //匿名内部类
//        Arrays.sort(arr,new Comparator<Girlfriend>() {
//            @Override
//            public int compare(Girlfriend o1, Girlfriend o2) {
//                double temp=o1.getAge()-o2.getAge();
//                temp=temp==0?o1.getHeight()- o2.getHeight():temp;
//                //getName按ascii码表计算,先比较第一个字母再第二个以此类推
//                temp=temp==0?o1.getName().compareTo(o2.getName()):temp;
//                if(temp>0){
//                    return 1;
//                }else if(temp<0){
//                    return -1;
//                }else{
//                    return 0;
//                }
//            }
//        });
        Arrays.sort(arr, (o1,  o2) -> {
                    double temp = o1.getAge() - o2.getAge();
                    temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                    //getName按ascii码表计算,先比较第一个字母再第二个以此类推
                    temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                    if (temp > 0) {
                        return 1;
                    } else if (temp < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
        );
        System.out.println(Arrays.toString(arr));
    }
}
