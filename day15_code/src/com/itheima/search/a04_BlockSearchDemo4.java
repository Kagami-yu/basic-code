package com.itheima.search;

public class a04_BlockSearchDemo4 {
    public static void main(String[] args) {
        int[] arr = {
                16, 5, 9, 14,
                21, 18, 32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66
        };//分为3块
        //创建块对象
        Block b1 = new Block(16,0,3);
        Block b2 = new Block(45,4,11);
        Block b3 = new Block(73,12,17);
        //存在数组里
        Block[] blocks = {b1,b2,b3};
        int num=61;//要找的数值
        int finalRes=findIndex(blocks,num,arr);
        if(finalRes==-1){
            System.out.println("没有找到该数据");
        }else if(finalRes>=0){
            System.out.println("该数值的对应索引为："+finalRes);
        }
    }
    //判断要找的数值再哪个索引
    public static int findIndex(Block[] blocks,int num,int[] arr){
        int res=findBlock(blocks,num);
        if(res==-1){
            return -1;
        }
        //获取该blocks的起始索引和结束索引
        int startIndex=blocks[res].getStartIndex();
        int endIndex=blocks[res].getEndIndex();
        for (int i = startIndex; i <= endIndex; i++) {
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }

    //判断要找的数值在哪个块
    public static int findBlock(Block[] blocks,int num){
        for (int i = 0; i < blocks.length; i++) {
            if(num<blocks[i].getMax()){
                return i;
            }
        }
        return -1;//遍历所有的block。getMax都没找到直接返回-1
    }
}
    class Block{
        private int max;
        private int startIndex;
        private int endIndex;
        public Block(int max,int startIndex,int endIndex){
            this.max=max;
            this.startIndex=startIndex;
            this.endIndex=endIndex;
        }
        public Block(){}
        public void setMax(int max){
            this.max=max;
        }
        public void setStartIndex(int startIndex){
            this.startIndex=startIndex;
        }
        public void setEndIndex(int endIndex){
            this.endIndex=endIndex;
        }
        public int getMax(){
            return max;
        }
        public int getStartIndex(){
            return startIndex;
        }
        public int getEndIndex(){
            return endIndex;
        }
    }//定义块对象
