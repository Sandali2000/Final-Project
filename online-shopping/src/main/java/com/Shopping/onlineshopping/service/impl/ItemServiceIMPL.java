package com.Shopping.onlineshopping.service.impl;

import com.Shopping.onlineshopping.Util.mappers.ItemMapper;
import com.Shopping.onlineshopping.dto.CustomerDto;
import com.Shopping.onlineshopping.dto.ItemDTO;
import com.Shopping.onlineshopping.dto.request.RequestSaveItemDTO;
import com.Shopping.onlineshopping.entity.Item;
import com.Shopping.onlineshopping.repo.ItemRepo;
import com.Shopping.onlineshopping.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceIMPL implements ItemService {
    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public String saveItem(RequestSaveItemDTO requestSaveItemDTO) {
        Item item = modelMapper.map(requestSaveItemDTO,Item.class);
        item.setActiveState(true);
        if(!itemRepo.existsById(item.getItemId())){
            itemRepo.save(item);
            return item.getItemId()+ " save item";
        }else {
            throw new RuntimeException("error message");
        }

    }

    @Override
    public List<ItemDTO> getItemByName(String name) {
        boolean b =true;
        List<Item> items = itemRepo.findAllByItemNameEqualsAndActiveStateEquals(name,b);

        if(items.size()>0){
            List<ItemDTO> itemDTOList= modelMapper.map(items,new TypeToken<List<ItemDTO>>(){}.getType());

            return itemDTOList;
        }else {
            throw new RuntimeException("not Found");
        }


    }

    @Override
    public List<ItemDTO> getNotActiveItemByName(String name) {

        List<Item> items = itemRepo.findAllByItemNameEqualsAndActiveStateIsFalse(name);

        if(items.size()>0){
            List<ItemDTO> itemDTOList= itemMapper.entityDtoToResponseDto(items);
            return itemDTOList;
        }else {
            throw new RuntimeException("not Found");
        }

        
    }

    @Override
    public List<ItemDTO> getAllItem() {
        List<Item> items = itemRepo.findAll();

        List<ItemDTO> itemDTOList = modelMapper.map(items,new TypeToken<List<ItemDTO>>(){}.getType());
        return itemDTOList;
    }


}
