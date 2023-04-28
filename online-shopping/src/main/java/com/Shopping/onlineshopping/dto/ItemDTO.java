package com.Shopping.onlineshopping.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ItemDTO {

    private int itemId;
    private String itemName;
    private String shopName;
    private int employeeId;
    private String type;
    private double price;

    private int quantity;
    private String description;
    private String image;
    private boolean activeState;
}
