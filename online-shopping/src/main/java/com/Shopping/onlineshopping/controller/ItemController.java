package com.Shopping.onlineshopping.controller;

import com.Shopping.onlineshopping.dto.request.RequestSaveItemDTO;
import com.Shopping.onlineshopping.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
