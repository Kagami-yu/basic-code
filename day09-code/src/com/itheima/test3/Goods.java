package com.itheima.test3;

public class Goods {
    private int id;
    private String goodname;
    private int price;
    private int box;

    public Goods(int id, String goodname, int price, int box) {
        this.id = id;
        this.goodname = goodname;
        this.price = price;
        this.box = box;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getGoodname(){
        return goodname;
    }
    public void setGoodname(String goodname){
        this.goodname = goodname;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getBox(){
        return box;
    }
    public void setBox(int box){
        this.box = box;
    }
}
