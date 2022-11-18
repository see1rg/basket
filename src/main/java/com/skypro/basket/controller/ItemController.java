package com.skypro.basket.controller;

import com.skypro.basket.model.Item;
import com.skypro.basket.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;

import static java.util.Arrays.stream;

@RestController
public class ItemController {

    public final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/store/order/get")
    public Collection<Item> getAllItems(){
        return this.itemService.getFullBasket();
    }

    @GetMapping("/store/order/add")
    @ResponseBody
    public Collection<Item> addItems(Item...item){
        return this.itemService.addItems(stream(item).toList());
    }
}