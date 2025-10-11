package com.itheima.test2;

public class UserTest {
    public static void main(String[] args) {
        //调用无参
        User u = new User();
        u.setUsername("小明");//setUsername = ("小明");别加等号
        u.setAge(18);
        u.setEmail("51048");
        u.setPassward("123456");
        u.setGender('男');

        System.out.println(u.getUsername());
        System.out.println(u.getAge());
        System.out.println(u.getEmail());
        System.out.println(u.getPassward());
        System.out.println(u.getGender());

        //调用有参
        User u1 = new User("xiao","1223","123456",18,'男');
        System.out.println(u1.getUsername());
        System.out.println(u1.getAge());
        System.out.println(u1.getEmail());
        System.out.println(u1.getPassward());
        System.out.println(u1.getGender());

    }
}
