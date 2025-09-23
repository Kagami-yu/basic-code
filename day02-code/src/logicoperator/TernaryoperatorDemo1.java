package logicoperator;

public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
        //三元运算符，读取两个数中的最大值
        int num1=8;
        int num2=9;
        //三元运算结果必须被使用不然会报错
        //1
        int res=num1>num2 ? num1:num2;
        System.out.println(res);
        //2
        System.out.println(num1>num2? num1:num2);
    }
}
