package com.skypro.basket.controller;

import com.skypro.basket.model.Item;
import com.skypro.basket.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    public final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/order/get")
    public List<Item> getAllItems(){
        return this.itemService.getFullBasket();
    }

    @GetMapping("/order/add")
    public List addItems(@RequestParam("item") List item){
        return this.itemService.addItems(item);
    }
    @GetMapping("/order")
    public String hello(){
        return "hello word";
    }
}