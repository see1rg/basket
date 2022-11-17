package com.skypro.basket.service;

import com.skypro.basket.model.Basket;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class BasketService {
    private final Map<Integer,String> basket = new HashMap<>();

    public Collection<Basket> getFullBasket() {
        return this.basket.values();
    }
}
