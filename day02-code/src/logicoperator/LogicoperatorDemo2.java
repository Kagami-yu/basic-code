package logicoperator;

public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        //1 ^异>相同为false，不同为true
        System.out.println(true ^ true);//false
        System.out.println(false ^ true);//true
        System.out.println(false ^ false);//false
        System.out.println(true ^ false);//true
        //2 !逻辑非 取反
        System.out.println(!false);//true
        System.out.println(!true);//flase
    }
}
