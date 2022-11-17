package com.skypro.basket.controller;

import com.skypro.basket.model.Basket;
import com.skypro.basket.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class BasketController {

    public final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/store/order/get")
    public Collection<Basket> getAllItems(){

        return this.basketService.getFullBasket();
    }
}
