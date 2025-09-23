package ifdemo;

import java.util.Scanner;

public class Ifdemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("女婿的酒量");
        int a = sc.nextInt();
        if (a > 2) {
            System.out.println("小伙子，不错哟");
        } else {
            System.out.println("没什么好说的");
        }
    }
}
