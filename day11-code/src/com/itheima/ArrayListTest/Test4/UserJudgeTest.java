package com.itheima.ArrayListTest.Test4;

import java.util.ArrayList;

public class UserJudgeTest {
    public static void main(String[] args) {
        ArrayList<User> userlist1 = new ArrayList<>();//创建集合

        User u1 = new User("1","zhangsan","123456");
        User u2 = new User("2","zhangsi","654321");
        User u3 = new User("3","zhangwu","112233");

        userlist1.add(u1);
        userlist1.add(u2);
        userlist1.add(u3);

        boolean flag=check(userlist1,"6");
        System.out.println(flag);
    }


    //
    public static boolean check(ArrayList<User> userlist,String id){
        for (int i = 0; i < userlist.size(); i++) {
            if(userlist.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
}
