package com.itheima.AbstractTest;
import com.itheima.AbstractTest.Animal;
import sun.security.util.AuthResources_it;

public class Test1 {
    public static void main(String[] args) {
        Animal A = new Frog();
        A.eat();
        A.setName("yu");
        System.out.println(A.getName());
    }
    public static void ttest(Animal A) {}
}
