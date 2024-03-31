package com.item.item.controller;

import com.item.item.entuti.Item;
import com.item.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/item")
public class ItemController {

    private final ItemService itemService;

    @PostMapping("/addItem")
    public Item item(@RequestBody Item item) {
        return itemService.saveitem(item);
    }

    @PostMapping("/addMore")
    public List<Item> addItems(@RequestBody List<Item> items) {
        return itemService.saveitems(items);
    }

    @GetMapping("/get")
    public List<Item> fetchAllItems() {
        return itemService.getItems();
    }

    @DeleteMapping("/delete/{itemId}")
    public String deleteitem(@PathVariable Integer itemId) {
        return itemService.deleteitemById(itemId);
    }

    @PutMapping("/update/{id}")
    public Item updateItem(@RequestBody Item updateitem,Integer id) {
        return itemService.updateItems(updateitem,id);

    }

}
