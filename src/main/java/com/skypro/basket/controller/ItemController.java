package com.skypro.basket.controller;

import com.skypro.basket.model.Item;
import com.skypro.basket.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

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

    @GetMapping("/store/order")
    public String greeting(){
        return "Введите ID товара.";
    }
}
//@Controller
//public class GreetingController {
//
//    @GetMapping("/greeting")
//    public String greetingForm(Model model) {
//        model.addAttribute("greeting", new Greeting());
//        return "greeting";
//    }
//
//    @PostMapping("/greeting")
//    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
//        model.addAttribute("greeting", greeting);
//        return "result";
//    }
//
//}