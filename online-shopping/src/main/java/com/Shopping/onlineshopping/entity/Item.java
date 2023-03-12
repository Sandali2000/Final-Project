package com.Shopping.onlineshopping.entity;

import com.Shopping.onlineshopping.entity.enums.MeasurementUnitType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "item")
public class Item {

    @Id
    @Column(name = "item_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemId;

    @Column(name = "itemName", length = 45, nullable = false)
    private String itemName;

    @Column(name = "shopName", nullable = false)
    private String shopName;

    @Column (name = "price", nullable = false)
    private double price;

    @Enumerated (EnumType.STRING)
    @Column (name = "measureType")
    private MeasurementUnitType measureType;

    @Column (name = "quantity", nullable = false)
    private int quantity;

    @Column (name = "description", nullable = false)
    private String description;

    @Column(name = "image", nullable = false)
    private  String  image;

    @Column(name = "active_state",columnDefinition = "TINYINT default 0")
    private boolean activeState;




}
