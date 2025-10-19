package com.itheima.ArrayListTest.Test4;

import java.util.ArrayList;

public class UserJudgeTest2 {
    public static void main(String[] args) {
        ArrayList<User> userlist2 = new ArrayList<>();//创建集合

        User u1 = new User("1","zhangsan","123456");
        User u2 = new User("2","zhangsi","654321");
        User u3 = new User("3","zhangwu","112233");

        userlist2.add(u1);
        userlist2.add(u2);
        userlist2.add(u3);

        int force=contains(userlist2,"7");
        if(force>=0){
            System.out.println(userlist2.get(force).getId()+","+userlist2.get(force).getName()+","+userlist2.get(force).getPassword());
            //把force作为集合里面的索引
        }else{
            System.out.println("未能查找到该信息");
        }
    }

    public static int contains(ArrayList<User> list,String id){
        for(int i=0;i<list.size();i++) {
            if(list.get(i).getId().equals(id)) {
                //System.out.println(list.get(i).getId()+","+list.get(i).getName()+","+list.get(i).getPassword());
                return i;
            }
        }
        //System.out.println("未找到该信息");
        return -1;
    }
}
