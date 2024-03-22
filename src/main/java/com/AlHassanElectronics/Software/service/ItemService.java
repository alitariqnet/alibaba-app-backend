package com.AlHassanElectronics.Software.service;

import com.AlHassanElectronics.Software.entity.Item;
import com.AlHassanElectronics.Software.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item save(Item item) {
        log.info("Saving item: ", item.toString());
        return itemRepository.save(item);
    }

    public Optional<Item> getItem(Long id) {
        log.info("Fetching item from repository, item id: ", id);
        return itemRepository.findById(id);
    }

    public List<Item> findAllItems(Specification specification) {
        log.info("Fetching items according to specifications...");
        return itemRepository.findAll(specification);
    }

    public Page<Item> findAllItems(Specification specification, Pageable pageable) {
        log.info("Fetching items according to specifications...");
        return itemRepository.findAll(specification, pageable);
    }

    public List<Item> findAllItems(Specification specification, Sort sort) {
        log.info("Fetching items according to specifications...");
        return itemRepository.findAll(specification, sort);
    }

    public void deleteItemById(Long id) {
        itemRepository.deleteById(id);
    }

    public void deleteItem(Item item) {
        itemRepository.delete(item);
    }

    public long delete(Specification specification){
        return itemRepository.delete(specification);
    }
}
