package com.Shopping.onlineshopping.service.impl;

import com.Shopping.onlineshopping.dto.request.RequestSaveItemDTO;
import com.Shopping.onlineshopping.entity.Item;
import com.Shopping.onlineshopping.repo.ItemRepo;
import com.Shopping.onlineshopping.service.ItemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceIMPL implements ItemService {
    @Autowired
    public ItemRepo itemRepo;

    @Autowired
    public ModelMapper modelMapper;

    @Override
    public String saveItem(RequestSaveItemDTO requestSaveItemDTO) {
        Item item = modelMapper.map(requestSaveItemDTO,Item.class);
        item.isActiveState();
        if(!itemRepo.existsById(item.getItemId())){
            itemRepo.save(item);
            return "save item";
        }else {
            throw new RuntimeException("error message");
        }

    }
}
