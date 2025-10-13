package com.itheima.test7;

public class StudentTest {
    public static void main(String[] args) {
        //创建数组
        Student[] arr = new Student[3];
        Student stu1 = new Student("zahngsan", 2000, 18);
        Student stu2 = new Student("lihua", 2001, 18);
        Student stu3 = new Student("lisi", 2002, 18);
        //再次提那家一个学生信息，并作唯一性判断
        Student stu4 = new Student("maowu", 2004, 18);
        //录入新信息分为原数组未满或者原数组已满，数组未满留空会显示null


        //调用唯一性判断,用boolean接收结果
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            //true--数据已存在
            System.out.println("重复数据，无效");
        } else {
            //false数据不存在,分类讨论录入,需要验证arr数组是否还有空位的方法
            int count = getCount(arr);
            if (count == arr.length) {
                //如果存满了，则创建新数组存储,老数组数据拷贝
                //接收返回新数组
                Student[] newarr = createNewArray(arr);
                //[stu1,stu2,stu3,null]
                //添加
                newarr[count] = stu4;
            } else {
                //没有存满
                //count可以表示索引位置
                arr[count] = stu4;
            }
        }
    }

    //创建新数组的方法
    public static Student[] createNewArray(Student[] arr) {
        Student[] newarr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        return newarr;
    }


    //数组是否还有空位的方法
    //判断数组有无空为,所以括号里面为String[] arr，空数组的话为null
    //如果遍历数组里有null则不count++，否则count++，这样count记录的就是数组里面存了几位
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName() != null) {
                count++;
            }
        }
        return count;
    }


    //唯一性判断的方法----先判断再添加
    //已存在--不用添加
    //不存在--添加//////////////需要根据结果做下一步指令且判断只有是或者否，所以用boolean和需要返回
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            //int sid=stu.getId();
            if (stu.getId() == id) {
                return true;
            }
        }
        //循环结束后还未找到相同的，就表示id是原来不存在的
        return false;
    }
}
