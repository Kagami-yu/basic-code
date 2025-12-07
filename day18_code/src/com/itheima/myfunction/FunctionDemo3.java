package com.itheima.myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class FunctionDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "张飒", "张三丰","李四","乘胜","张积极");
        //引用成员方法
        list.stream().filter(new StringOperation()::stringJudge).forEach(System.out::println);

        //调用本类方法
        //静态方法里没有this，不能用this，得用类名
        list.stream().filter(new FunctionDemo3()::stringJudge).forEach(s-> System.out.println(s));
    }
    public boolean stringJudge(String s){
        return s.startsWith("张")&&s.length()==3;
    }
}
