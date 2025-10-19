package com.itheima.ArrayListTest.Test5;
//结果打印
import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("xiaomi", 999);
        Phone p2 = new Phone("oppo", 1999);
        Phone p3 = new Phone("vivo", 2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        getphone(list);
    }


    //定义·一个方法将价格低于3000的手机信息返回
    public static void getphone(ArrayList<Phone> Phone){
        for(int i=0;i<Phone.size();i++){
            //不用打包成integer
            if(Phone.get(i).getPrice()<3000){
                System.out.println(Phone.get(i).getBrand()+","+Phone.get(i).getPrice());
            }
        }
    }
}
