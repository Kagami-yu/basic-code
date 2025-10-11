package com.itheima.test;

import javax.sound.midi.Soundbank;

public class GirlFriendTest {
    public static void main(String[] args) {
        //先创建对象
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("小明");
        gf1.setAge(21);
        gf1.setGender('女');

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.play();
        gf1.sleep();
    }
}
