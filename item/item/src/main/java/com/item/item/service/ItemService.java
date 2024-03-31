package com.item.item.service;

import com.item.item.entuti.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {

    List<Item> saveitems(List<Item> items);

    List<Item> getItems();

    Item saveitem(Item item);

    String deleteitemById(Integer itemId);

    Item updateItems(Item updateitem, Integer id);
}
