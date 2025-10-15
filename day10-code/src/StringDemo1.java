public class StringDemo1 {
    public static void main(String[] args) {
        //1.使用直接赋值方法获取一个字符串对象
        String s1="abc";
        System.out.println(s1);
        //2.使用new的方法来获取一个字符串对象
        //空参构造：可以获取一个空白的空字符串对象
        String s2=new String();
        System.out.println("@:"+s2);//s2:""
        //传递一个字符串，根据传递的字符串内容在创建一个新的字符串对象
        String s3=new String("abcd");
        System.out.println(s3);

        //传递一个字符数组，根据传递的字符数组的内容在创建一个新的字符串对象
        //需求：修改字符串的内容
        char[] ch={'a','b','c'};
        String s4=new String(ch);
        System.out.println(ch);

        //传递一个字节数组，根据字节数组的内容再创造一个新的字符串对象
        //应用场景：网络传输的信息都是字节信息
        //一半把字节信息进行转化成字符串，此时需要用到这个构造
        byte[] bytes={97,98,99,100};
        String s5=new String(bytes);
        System.out.println(s5);//abcd
    }
}
