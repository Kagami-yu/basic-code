package com.itheima.test1;


import java.util.Random;

public class Character {
    private String name;
    private int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    //击打的方法
    //谁攻击谁,括号里character指的是被击打的
    //第一个大写是类/接口，第二个小写是方法/变量,可以为任意数据，看直观所以写character
    public void attack(Character character) {
        //伤害随机1-20
        Random rand = new Random();
        int hurt=rand.nextInt(20)+1;//1-20
        //剩余血量
        int remainhp=character.getHp()-hurt;//被击打的人扣血
        //对血量进行更新验证，如果为负数，则修改为0
        remainhp=remainhp<=0?0:remainhp;//三元运算，显示较大值
        //修改挨揍人血量,将remainhp赋值给setHp,方便getHp调用数据
        character.setHp(remainhp);
        //谁调用方法谁就是this.getName,,,,,character.getName()为被打方
        System.out.println(this.getName()+"打了"+character.getName()+","+character.getName()+
                "扣除血量"+hurt+","+character.getName()+"当前血量为"+remainhp);
    }
}
