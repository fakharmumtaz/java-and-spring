package com.javalogic.model;

public class Item {

    public  Item( String name, int qty, Double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    private String name;
    private int qty;
    private Double price;

    //constructors, getter/setters
    public String getName(){
        return this.name;
    }
    public int getQty(){
        return this.qty;
    }
    public Double getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public void setPrice(Double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}