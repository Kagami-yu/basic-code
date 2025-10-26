package com.itheima.InterDemo.Test1;


public class TabletennisPlayer extends Athlete implements SpeakEn{
    public TabletennisPlayer(){}
    public TabletennisPlayer(String name,int age){
        super(name,age);
    }
    @Override
    public void study(){
        System.out.println(getAge()+"岁的"+getName()+"正在学乒乓球");
    }

    @Override
    public void speakEn() {
        System.out.println("说英语");
    }
}
