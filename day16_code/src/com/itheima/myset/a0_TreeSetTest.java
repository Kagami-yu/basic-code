package com.itheima.myset;

import java.util.TreeSet;

public class a0_TreeSetTest {
    public static void main(String[] args) {
        TreeSet<StuExam> ts = new TreeSet<>((o1, o2) -> {
            int total1 = o1.getChinese() + o1.getMath() + o1.getEnglish();
            int total2 = o2.getChinese() + o2.getMath() + o2.getEnglish();
            int temp = total2 - total1;
            temp = temp == 0 ? (o2.getChinese() - o1.getChinese()) : temp;
            temp = temp == 0 ? (o2.getMath() - o1.getMath()) : temp;
            temp = temp == 0 ? (o2.getEnglish() - o1.getEnglish()) : temp;
            temp = temp == 0 ? (o2.getAge() - o1.getAge()) : temp;
            temp = temp == 0 ? o2.getName().compareTo(o1.getName()) : temp;
            return temp;
        }
        );
        StuExam s1 = new StuExam("zhangsan", 23, 90, 99, 50);
        StuExam s2 = new StuExam("lisi", 24, 90, 98, 50);
        StuExam s3 = new StuExam("wangwu", 25, 95, 100, 30);
        StuExam s4 = new StuExam("zhaoliu", 26, 60, 99, 70);
        StuExam s5 = new StuExam("qianqi", 26, 70, 80, 70);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.forEach(stuExam -> System.out.println(stuExam));
    }
}

class StuExam {
    private String name;
    private int age;
    private int chinese;
    private int math;
    private int english;

    public StuExam() {
    }

    public StuExam(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     *
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     *
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     *
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     *
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     *
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    public String toString() {
        return "StuExam{name = " + name + ", age = " + age + ", total=" + (getChinese() + getEnglish() + getMath()) + ", chinese = " + chinese + ", math = " + math + ", english = " + english + "}";
    }
}