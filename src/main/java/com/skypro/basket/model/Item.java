package com.skypro.basket.model;

public class Item {
    private static int counter;
    private int id;

    public Item(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                '}';
    }
}
