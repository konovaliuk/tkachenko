package com.lab1.entities;

public class Product {
    private int id;
    private String name;
    private int price;

    public Product(){}

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean equal(Product other){
        return id == other.id &&
        name.equals(other.name) &&
        price == other.price;
    }

    public String toString(){
        return "Product{"+
                "id="+id +
                ", name=" + name +
                ", price="+price+"}";
    }
}