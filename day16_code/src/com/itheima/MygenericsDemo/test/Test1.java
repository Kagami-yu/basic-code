package com.itheima.MygenericsDemo.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
      ArrayList<LihuaCat> lh = new ArrayList<>();
      ArrayList<BosiCat> bs=new ArrayList<>();
      ArrayList<HuskyDog> hs=new ArrayList<>();
      ArrayList<TaidiDog> td=new ArrayList<>();

    }
    //饲养宠物的方法
    //1.养所有品种的猫
    //public static void keepPet(ArrayList<? extends Cat> list){}
    //2.养所有品种的狗
    //public static void keepPet(ArrayList<? extends Dog> list){}
    //养所有的动物但不能是其他类
    public static void keepPet(ArrayList<? extends Animal> list){}
}
