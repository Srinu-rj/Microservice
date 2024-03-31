package com.item.item.serviceImpl;


import com.item.item.entuti.Item;
import com.item.item.repo.ItemRepo;
import com.item.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepo itemRepo;


    @Override
    public List<Item> saveitems(List<Item> items) {
        return itemRepo.saveAll(items);
    }

    @Override
    public List<Item> getItems() {
        return itemRepo.findAll();
    }

    @Override
    public Item saveitem(Item item) {
        return itemRepo.save(item);
    }

    @Override
    public String deleteitemById(Integer itemId) {
        itemRepo.deleteById(itemId);
        return ":your Item had been deleted safely";
    }

    @Override
    public Item updateItems(Item updateitem, Integer id) {
        Item existByitem = itemRepo.findById(updateitem.getItemId())
                .orElseThrow(() -> new RuntimeException("can't get your ItemId please try to create items"));
        existByitem.setItemName(updateitem.getItemName());
        existByitem.setCost(updateitem.getCost());
        existByitem.setQuantity(updateitem.getQuantity());

        itemRepo.save(existByitem);
        return existByitem;
    }
}
