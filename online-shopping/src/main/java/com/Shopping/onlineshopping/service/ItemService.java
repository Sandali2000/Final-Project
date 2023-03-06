package com.Shopping.onlineshopping.service;

import com.Shopping.onlineshopping.dto.ItemDTO;
import com.Shopping.onlineshopping.dto.request.RequestSaveItemDTO;

import java.util.List;

public interface ItemService {

    String saveItem(RequestSaveItemDTO requestSaveItemDTO);


    List<ItemDTO> getItemByName(String name);

    List<ItemDTO> getNotActiveItemByName(String name);

    List<ItemDTO> getAllItem();
}
