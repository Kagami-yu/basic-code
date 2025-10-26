package com.itheima.InterDemo.Test1;

public class TabletennisCoach extends Coach implements SpeakEn{
    public TabletennisCoach(){}
    public TabletennisCoach(String name,int age){
        super(name,age);
    }
    @Override
    public void teach(){
        System.out.println(getAge()+"岁的"+getName()+"正在教乒乓球");
    }

    @Override
    public void speakEn() {
        System.out.println("说英语");
    }
}
