package com.skypro.basket.model;

public class Item {
    private static int counter;
    private final int id;
    private final String item;

    public Item(int id, String item) {
        this.id = counter++;
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public String getItem() {
        return item;
    }



    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", item='" + item + '\'' +
                '}';
    }
}
