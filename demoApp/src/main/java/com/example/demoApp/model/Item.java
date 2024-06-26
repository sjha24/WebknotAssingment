package com.example.demoApp.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private Integer id;
    private String price;
    private String name;
    private String image;
    private Rating rating;
}
