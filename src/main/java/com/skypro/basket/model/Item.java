package com.skypro.basket.model;

public class Item {
    private static int counter;
    private final int id;
    private final String item;
    private final int amount;

    public Item(int id, String item, int amount) {
        this.amount = amount;
        this.id = counter++;
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", item='" + item + '\'' +
                '}';
    }
}
