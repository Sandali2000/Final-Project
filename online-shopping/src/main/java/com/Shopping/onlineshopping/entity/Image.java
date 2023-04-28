package com.Shopping.onlineshopping.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "image")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",length = 200)
    private String name;

    @Column(name = "type", length = 200)
    private String type;

    @Column(name = "image", unique = false, nullable = false, length = 100000)
    private byte[] image;
}
