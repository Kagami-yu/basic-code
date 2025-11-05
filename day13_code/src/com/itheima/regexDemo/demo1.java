package com.itheima.regexDemo;

import javax.xml.transform.Source;
/*
[abc]只能是a,b,c
[^abc]除abc之外的任何字符
[a-zA-Z]a-zA-Z,包括(范围)
[a-d[m-p]]a到d，或m到p
[a-z&&[^bef]]a-z和def的交集，为d，e，f
[a-z&&[^bc]]a-z和bc的非交集，等同[ad-z]
[a-z&&[^m-p]]a到z和除了m到p的交集，等同于[a-lq-z]
.任何字符
\d一个数字[0-9]
\D非数字[^0-9]
\s一个非空字符[\t\n\x0B\f\r]
\S非空字符串[^\s]
\w[a-zA-z_0-9]英文，数字，下划线
|W[^\w]一个非单词字符
-----------------------X表示任意内容
X? --X,一次或0次
X* --X,零次或多次
X+ --X,一次或多次
X{n} --X,正好n次
X{n,} --X,至少n次
X{n,m} --X,至少n次但不超过m次
 */
public class demo1 {
    //规则qq号在6位到20位之间
    public static void main(String[] args) {
        String qq="123a465465";
        boolean res=qq.matches("[1-9]{5,19}\\d");//开头只能1-9之间的数字才符合要求，\\d表示必须得纯数字,定义中qq长度位6-20，除开头占一位还要5-19位
        System.out.println(res);//false
    }

    private static boolean checkqq(String qq) {
        int len = qq.length();
        //检验长度是否复合要求
        if (len < 6 || len > 20) {
            return false;
        }
        //检验开头是否为0
        if (qq.startsWith("0")){
            return false;
        }
        //检验全是数字
        for (int i = 1; i < len; i++) {
            char ch = qq.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
}
