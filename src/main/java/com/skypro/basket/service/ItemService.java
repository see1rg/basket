package com.skypro.basket.service;

import com.skypro.basket.model.Item;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Scope(scopeName = "prototype")
public class ItemService {
    private final Collection<Item> basket = new ArrayList<>();

    public Collection<Item> getFullBasket() {
        return this.basket.stream().toList();
    }

    public Collection<Item> addItems(Collection<Item> toList) {
        for (Item item : toList) {
            basket.add(new Item(item.getId()));
        }
        return toList;
    }
}
