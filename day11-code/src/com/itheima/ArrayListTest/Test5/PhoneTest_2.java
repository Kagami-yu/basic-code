package com.itheima.ArrayListTest.Test5;
//返回结果
import java.util.ArrayList;

public class PhoneTest_2 {public static void main(String[] args) {
    ArrayList<Phone> list2 = new ArrayList<>();
    Phone p1 = new Phone("xiaomi", 999);
    Phone p2 = new Phone("oppo", 1999);
    Phone p3 = new Phone("vivo", 2999);

    list2.add(p1);
    list2.add(p2);
    list2.add(p3);

    ArrayList<Phone> resultprice=getphone(list2);//返回一个新集合,需要接收
    //遍历
    for (int i = 0; i < resultprice.size(); i++) {
        System.out.println(resultprice.get(i).getPrice()+","+resultprice.get(i).getBrand());
    }
}


    //定义·一个方法将价格低于3000的手机信息返回
    public static ArrayList<Phone> getphone(ArrayList<Phone> Phone){
        //定义一个集合用于储存价格
        ArrayList<Phone> resultprice = new ArrayList<>();
        for(int i=0;i<Phone.size();i++){
            //不用打包成integer
            if(Phone.get(i).getPrice()<2000){
               resultprice.add(Phone.get(i));
            }
        }
        return resultprice;
    }
}
