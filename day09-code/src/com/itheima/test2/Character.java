package com.itheima.test2;


import java.util.Random;

public class Character {
    private String name;
    private int hp;
    private char gender;
    private String face;

    public Character() {
    }

    public Character(String name, int hp, char gender) {
        this.name = name;
        this.hp = hp;
        this.gender = gender;
        //随机长相，所以不能在创建对象的时候给
        setFace(gender);
        //报错原因是因为public void setFace(String face)，这里要输入String face
        //改为public void setFace(gender)就可以
    }

    String[] boyfaces = {"英俊", "面目狰狞", "相貌平平"};
    String[] girlfaces = {"沉鱼落雁", "亭亭玉立", "可怖"};
    //attack 攻击描述：
    String[] attacks_desc= {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声,身形下伏,一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】,结结实实的捶向%s。",
            "%s上步抢身,招中套招,一招【劈挂连环】,连环攻向%s。"
    };

    //injure 受伤描述：
String[] injure_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声,显然受了点内伤" ,
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果「轰』的一声,%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };
    Random rand = new Random();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        if (gender == '男') {
            //随机索引
            int index = rand.nextInt(boyfaces.length);//>=0,<3
            //获取索引上的数据并且赋值给本地face
            this.face = boyfaces[index];
        } else if (gender == '女') {
            int index = rand.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "神秘";
        }
    }

    //击打的方法
    //谁攻击谁,括号里character指的是被击打的
    //第一个大写是类/接口，第二个小写是方法/变量,可以为任意数据，看直观所以写character
    public void attack(Character character) {

        //添加攻击招数
        int index = rand.nextInt(attacks_desc.length);//[0,6)
        String skill=attacks_desc[index];
        //打印招数
        System.out.printf(skill,this.getName(),character.getName());

        //伤害随机1-20
        Random rand = new Random();
        int hurt = rand.nextInt(20) + 1;//1-20

        //剩余血量
        int remainhp = character.getHp() - hurt;//被击打的人扣血

        //对血量进行更新验证，如果为负数，则修改为0
        remainhp = remainhp <= 0 ? 0 : remainhp;//三元运算，显示较大值

        //修改挨揍人血量,将remainhp赋值给setHp,方便getHp调用数据
        character.setHp(remainhp);

        //谁调用方法谁就是this.getName,,,,,character.getName()为被打方
        System.out.print(this.getName() + "打了" + character.getName() + "," + character.getName() +
                "扣除血量" + hurt + "," + character.getName() + "当前血量为" + remainhp+",");

        //受击反馈
        if (remainhp >=90) {
            System.out.printf(injure_desc[0],character.getName());
            System.out.println();
        }else if (remainhp >=80) {
            System.out.printf(injure_desc[1],character.getName());
            System.out.println();
        }else if (remainhp >=70) {
            System.out.printf(injure_desc[2],character.getName());
            System.out.println();
        }else  if (remainhp >=60) {
            System.out.printf(injure_desc[3],character.getName());
            System.out.println();
        }else if (remainhp >=40) {
            System.out.printf(injure_desc[4],character.getName());
            System.out.println();
        }else if (remainhp >=20) {
            System.out.printf(injure_desc[5],character.getName());
            System.out.println();
        }else if (remainhp >=10) {
            System.out.printf(injure_desc[6],character.getName());
            System.out.println();
        }else{
            System.out.printf(injure_desc[7],character.getName());
            System.out.println();
        }
    }

    public void showRoleInfo() {
        System.out.println("姓名为" + getName());
        System.out.println("血量为" + getHp());
        System.out.println("性别为" + getGender());
        System.out.println("相貌为" + getFace());
    }
}
