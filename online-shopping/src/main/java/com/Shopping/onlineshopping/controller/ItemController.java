package com.Shopping.onlineshopping.controller;

import com.Shopping.onlineshopping.Util.StandardResponse;
import com.Shopping.onlineshopping.dto.CustomerDto;
import com.Shopping.onlineshopping.dto.ItemDTO;
import com.Shopping.onlineshopping.dto.request.RequestSaveItemDTO;
import com.Shopping.onlineshopping.entity.Item;
import com.Shopping.onlineshopping.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/item")
@CrossOrigin
public class ItemController {
    @Autowired
    public ItemService itemService;

    @PostMapping(path = "/save")
    public RequestSaveItemDTO saveItem(@RequestBody RequestSaveItemDTO requestSaveItemDTO){
        return  itemService.saveItem(requestSaveItemDTO);
    }

    @GetMapping(path = "/get-by-name", params = "type")
    public List<ItemDTO> getItemByName(@RequestParam (value = "type") String type){
        List<ItemDTO> getItem = itemService.getItemByName(type);
        return getItem;
    }

    @GetMapping(path = "/get-by-notActiveItem", params = "name")
    public List<ItemDTO> getItemByNameNotActive(@RequestParam (value = "name") String name){
        List<ItemDTO> getItem = itemService.getNotActiveItemByName(name);
        return getItem;
    }



    @GetMapping(path = "getAllItem")
    public List<ItemDTO> getAllItem()
    {
        List<ItemDTO> itemDTOList = itemService.getAllItem();
        return itemDTOList;

    }
    @GetMapping(path = "getById", params = "itemId")
    public ItemDTO getById(@RequestParam (value = "itemId") int itemId)
    {
        ItemDTO itemDTO = itemService.getById(itemId);

        return itemDTO;
    }

    @GetMapping(path ="/get-item-by-id", params = "employeeId")
    public List<ItemDTO> getItemByEmployee(@RequestParam (value = "employeeId")int employeeId) {
        List<ItemDTO> itemDTOList = itemService.getItemByEmployee(employeeId);
        return itemDTOList;
    }

    @DeleteMapping(path = "deleteItem/{itemId}")
    public ResponseEntity<StandardResponse> deleteItem(@PathVariable (value = "itemId") int itemId){
        String message =  itemService.deleteItem(itemId);

        return new ResponseEntity<StandardResponse>(
                new StandardResponse(200, "success", message),
                HttpStatus.OK
        );

    }



}
