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
    private String price;
    private MeasurementUnitType measureType;
    private String quantity;
    private String description;
}
