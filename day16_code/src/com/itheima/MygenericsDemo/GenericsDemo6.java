package com.itheima.MygenericsDemo;


import java.util.ArrayList;
//应用场景:
    //1.如果我们在定义方法，类，接口的时候，如果类型不确定，那我们可以定义泛型列类，泛型方法，泛型接口
    //2.如果类型不确定但知道可以只传递某个继承体系，就可以用泛型的统配符
    //关键点可以限定类型的范围

public class GenericsDemo6 {
    public static void main(String[] args) {
        /*
        需求
            定义一个方法，形参是一个集合，但是集合中的数据类型不确定
            这个时候Ye，Fu，Zi都能传递，当然我在建一个成员类Student也可以传递
        但我们希望：即使是不确定类型，也只能传递Ye，Fu，Zi

        此时我们可以使用泛型的通配符
            ?也表示不确定符
            他可以进行类型的限定
            ? extends E：表示可以传递E或E所有的子元素
            ? super E；表示可以传递E或E所有的父元素
         */
    ArrayList<Ye> list1 = new ArrayList<>();
    ArrayList<Fu> list2 = new ArrayList<>();
    ArrayList<Zi> list3 = new ArrayList<>();
    ArrayList<Student> list4 = new ArrayList<>();
    method(list1);
    method(list2);
    method(list3);
//    method(list4);
    }

    //里面写什么类型，只能传什么类型
//    public static <E> void method(ArrayList<E> list) {
//    }
    //用统配可以不用在修饰符后定义
    //?后的对象要明确写
    public static void method(ArrayList<? extends Ye> list) {
    }//method(list4);报错
}

class Ye {
}

class Fu extends Ye {
}

class Zi extends Fu {
}

class Student {
}