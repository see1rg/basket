package com.skypro.basket.model;

public class Item {
    private static int counter;
    private final int id;

    public Item(int id) {
        this.id = counter++;
    }

    public int getId() {
        return id;
    }





    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                 '\'' +
                '}';
    }
}
