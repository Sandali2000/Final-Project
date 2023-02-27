package com.Shopping.onlineshopping.controller;

import com.Shopping.onlineshopping.dto.ItemDTO;
import com.Shopping.onlineshopping.dto.request.RequestSaveItemDTO;
import com.Shopping.onlineshopping.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/item")
@CrossOrigin
public class ItemController {
    @Autowired
    public ItemService itemService;

    @PostMapping(path = "/save")
    public String saveItem(@RequestBody RequestSaveItemDTO requestSaveItemDTO){
        return  itemService.saveItem(requestSaveItemDTO);
    }

    @GetMapping(path = "/get-by-name", params = "name")
    public List<ItemDTO> getItemByName(@RequestParam (value = "name") String name){
        List<ItemDTO> getItem = itemService.getItemByName(name);
        return getItem;
    }

    @GetMapping(path = "/get-by-notActiveItem", params = "name")
    public List<ItemDTO> getItemByNameNotActive(@RequestParam (value = "name") String name){
        List<ItemDTO> getItem = itemService.getNotActiveItemByName(name);
        return getItem;
    }

}
