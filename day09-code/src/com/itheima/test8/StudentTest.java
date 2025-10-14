package com.itheima.test8;

public class StudentTest {
    public static void main(String[] args) {
        //创建数组
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "zhang", 18);
        Student stu2 = new Student(2, "li", 18);
        Student stu3 = new Student(3, "liu", 18);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //数组已经存满，现在要添加一个数据,判断新数据id是否与原数据有重合，作唯一性判断
        Student stu4 = new Student(4, "lv", 18);

        //调用方法查看stu4的id
        boolean flag = contains(arr, stu4.getId());
        //直接写flag代表true有重复
        if (flag) {
            //有重复就为无效数据
            System.out.println("重复数据，重新输入");

        } else {
            //调用,接收count方法
            int count = getCount(arr);
            //没重复则为新数据,有空位则直接填入，无空位则创立新数组
            //有空位
            if (count != arr.length) {
                arr[count] = stu4;
                printArr(arr);
            } else {
                //无空位,建新数组
                Student[] newarr = newarr(arr);
                newarr[count] = stu4;
                printArr(newarr);
            }
        }
    }

    //遍历数组的方法
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //null无法遍历，所以要排除这个影响
            if (arr[i] != null) {
                System.out.println(arr[i].getId() + "," + arr[i].getName() + "," + arr[i].getAge());
            }
        }
    }

    //唯一性判断方法,数组里元素和id作比较
    public static boolean contains(Student[] arr, int id) {
        //遍历数组查重复
        //数据要非null才能被使用
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != null && arr[i].getId() == id) {
                //true表示已有重复数据
                System.out.println("重复id，重新输入");
                return true;
            }
        }

        //false没有重复数据
        return false;
    }

    //记录原数组数据个数,因为要记录数组内有多少个数据，所以填入Student[] arr
    //数据为空显示null,所有和null作比较
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //建立新数组的方法,同时拷贝数据
    public static Student[] newarr(Student[] arr) {
        Student[] newarr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];//剩下null位置
        }
        return newarr;
    }

}
