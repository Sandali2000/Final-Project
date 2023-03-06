package com.Shopping.onlineshopping.dto.request;

import com.Shopping.onlineshopping.entity.enums.MeasurementUnitType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestSaveItemDTO {

    private String itemName;
    private String shopName;
    private double price;
    private MeasurementUnitType measureType;
    private int quantity;
    private String description;
    private String image;
}
