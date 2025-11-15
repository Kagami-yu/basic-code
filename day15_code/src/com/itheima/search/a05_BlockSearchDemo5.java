package com.itheima.search;

//分块查找--无规律数据
public class a05_BlockSearchDemo5 {
    public static void main(String[] args) {
        int[] arr = {
                //让数据之间没有交集
                27, 22, 30, 40,//22-40
                13, 19, 16, 20,//13-20
                7, 10,//7-10
                43, 50, 48//43-48
        };
        ulBlock ub1 = new ulBlock(40,20,0,3);
        ulBlock ub2 = new ulBlock(20,13,4,7);
        ulBlock ub3 = new ulBlock(10,7,8,9);
        ulBlock ub4 = new ulBlock(48,43,10,12);
        ulBlock[] ulArray = {ub1,ub2,ub3,ub4};
        int num=16;
        int finalRes=finIndex(ulArray,num,arr);
        if(finalRes==-1){
            System.out.println("没有找到该数据");
        }else if(finalRes>=0){
            System.out.println("该数值的对应索引为："+finalRes);
        }
    }

    //获取索引的方法
    public static int finIndex(ulBlock[] ulArray,int num,int[] arr){
        int res=findUlBlock(ulArray,num);
        if(res==-1){
            return -1;
        }
        int startIndex=ulArray[res].getStartIndex();
        int endIndex=ulArray[res].getEndIndex();
        for (int i = startIndex; i <= endIndex; i++) {
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }

    //获取在哪个块的方法
    public static int findUlBlock(ulBlock[] ulArray,int num){
        for (int i = 0; i < ulArray.length; i++) {
            if(num>=ulArray[i].getMin() && num<=ulArray[i].getMax()){
                return i;
            }
        }
        return -1;
    }
}

class ulBlock {

    private int max;
    private int min;
    private int startIndex;
    private int endIndex;

    public ulBlock(int max,int min, int startIndex, int endIndex) {
        this.max = max;
        this.min = min;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public ulBlock() {
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
}//定义无序块对象