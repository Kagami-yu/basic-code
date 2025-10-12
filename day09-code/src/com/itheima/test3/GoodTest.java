package com.itheima.test3;

public class GoodTest {
    public static void main(String[] args) {
        //创建Goods类的数组
        Goods[] array = new Goods[3];
        Goods g1=new Goods(1,"南瓜",12,66);
        Goods g2=new Goods(2,"丝瓜",5,565);
        Goods g3=new Goods(3,"窝瓜",6,686);

        //把数据添加到索引中
        array[0]=g1;
        array[1]=g2;
        array[2]=g3;

        for(int i=0;i<array.length;i++){
            //创建一个变量接受数据
            Goods goods=array[i];
            System.out.println(goods.getId()+","+goods.getGoodname()+","+goods.getPrice()+","+goods.getBox());
            //用array也可以
            //System.out.println(array[i].getId());
        }
    }
}
