package com.skypro.basket.service;

import com.skypro.basket.model.Item;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
@Scope(scopeName = "prototype")
public class ItemService {
    private final Map<Integer,Item> basket = new HashMap<>();

    public Collection<Item> getFullBasket() {
        return this.basket.values();
    }
}
