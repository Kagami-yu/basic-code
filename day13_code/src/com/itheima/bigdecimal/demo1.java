package com.itheima.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

//add,subtract,multiply,divide--除不净会报错,divide(BigDecimal val,精确几位，RoundingMode.[...])
//[...]--UP远离0的方向舍入->1.3变2，-1.3变-2
//DOWN--向0方向舍入->1.3变1，-1.3变-1
//CELLING--向正无穷方向舍入1.1变2，-1.1变-1
//FLOOR--向负无穷方向舍入
//HALF_UP四拾五入，5.5->6
//HALF_DOWN，5.5->5
public class demo1 {
    public  static void main(String[] args) {
        BigDecimal b1=new BigDecimal("0.01");
        BigDecimal b3=new BigDecimal("0.09");
        BigDecimal b2=new BigDecimal(0.01);//不精确
        System.out.println(b1);
        System.out.println(b2);
        BigDecimal b4=b1.add(b3);//0.10
        System.out.println(b4);
        BigDecimal b5=b1.subtract(b3);//-0.08
        System.out.println(b5);
        //通过·静态方法获取对象，将数据转化为BigDecimal
        //如果传递[0,10]的整数，bigdecimal会返回已经创建好的对象，不会重新new
        BigDecimal b6=BigDecimal.valueOf(7);
        System.out.println(b6);//0.01
        BigDecimal b7=BigDecimal.valueOf(7);
        System.out.println(b7==b6);//true,若为7.0则false
        BigDecimal b8=BigDecimal.valueOf(3);
        BigDecimal b9=b6.divide(b8,2, RoundingMode.HALF_UP);//四舍五入
        System.out.println(b9);//2.33
    }
}
