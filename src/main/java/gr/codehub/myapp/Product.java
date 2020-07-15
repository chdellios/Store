package gr.codehub.myapp;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private double priceWhenBuy;
    private double priceWhenSell;

}
