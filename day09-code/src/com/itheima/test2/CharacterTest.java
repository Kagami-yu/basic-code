package com.itheima.test2;

public class CharacterTest {
    public static void main(String[] args) {
        //调用有参方法
        Character character1=new Character("乔峰",100,'男');
        Character character2=new Character("鸠摩智",100,'男');

        //展示角色信息
        character1.showRoleInfo();
        System.out.println("/////////////////////////////////////////");
        character2.showRoleInfo();
        System.out.println("/////////////////////////////////////////");
        //记录回合数
        int i=0;
        //不知道回合数什么时候结束，用无限循环
        //有一方ko另一方，循环break停止
        while(true) {
            character1.attack(character2);
            if(character2.getHp()==0){
                System.out.println(character1.getName()+"K.O了"+character2.getName());
                break;
            }
            character2.attack(character1);
            if(character1.getHp()==0){
                System.out.println(character2.getName()+"K.O了"+character1.getName());
                break;
            }
            i++;
        }
        System.out.println("回合数为:"+i);
    }
}
