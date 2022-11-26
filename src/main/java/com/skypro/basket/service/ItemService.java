package com.skypro.basket.service;

import com.skypro.basket.model.Item;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class ItemService {

    private final List<Item> basket = new ArrayList<>();

    public List<Item> getFullBasket() {
        return this.basket.stream().toList();
    }


    public List<Item> addItems(List<Item> item) {
        basket.addAll(item);
        return this.basket.stream().toList();
    }
}
