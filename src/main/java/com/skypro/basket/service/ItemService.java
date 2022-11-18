package com.skypro.basket.service;

import com.skypro.basket.model.Item;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Scope("session")
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
