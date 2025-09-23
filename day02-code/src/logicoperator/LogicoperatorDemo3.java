package logicoperator;

public class LogicoperatorDemo3 {
    public static void main(String[] args) {
        //1 &&短路与>两边都为真，结果才是真
        //有先后顺序，相比&减少运算时间
        System.out.println(true && true);//true
        System.out.println(false && true);//false
        System.out.println(false && false);//flase
        System.out.println(true && false);//flase
        //2 ||短路或>两边都为假，结果才是假
        //同上
        System.out.println(true || true);//true
        System.out.println(false || true);//true
        System.out.println(false || false);//false
        System.out.println(true || false);//true
        //示例
        int a = 10;
        int b = 10;
        boolean res1 = ++a < 5 && ++b < 5;
        System.out.println(res1);//false
        System.out.println(a);//11
        System.out.println(b);//10,因为++a=11>5，为false，所以b不进行

    }
}
