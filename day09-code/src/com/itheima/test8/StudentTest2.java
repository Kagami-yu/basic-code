package com.itheima.test8;

public class StudentTest2 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "zhang", 18);
        Student stu2 = new Student(2, "li", 18);
        Student stu3 = new Student(3, "liu", 18);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        /*
        通过id删除学生信息
        若存在则删除，不存在则显示删除失败
         */
        /*
        int index = getIndex(arr, 2);
        if (index >= 0) {
            //查得到不输出-1
            arr[index] = null;
        } else {
            System.out.println("未找到数据，删除失败");
        }

         */

        //查询id=2的学生，如果存在，则年龄+1
        int index = getIndex(arr, 2);
        arr[index].setAge(arr[index].getAge()+1);
        System.out.println(arr[index].getAge());
    }

    //获取id所在索引的方法
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getId() == id) {
                return i;
            }
        }
        //return -1则表示数组没有该id
        return -1;
    }
}
