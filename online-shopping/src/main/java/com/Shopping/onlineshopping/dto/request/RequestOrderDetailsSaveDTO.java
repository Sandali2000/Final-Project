package com.Shopping.onlineshopping.dto.request;

import com.Shopping.onlineshopping.entity.Item;
import com.Shopping.onlineshopping.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestOrderDetailsSaveDTO {

    private String itemName;
    private double quantity;
    private Double amount;
    private int items;

}
