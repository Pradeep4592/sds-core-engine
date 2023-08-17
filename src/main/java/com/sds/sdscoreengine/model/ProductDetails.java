package com.sds.sdscoreengine.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDetails {
    private String _id;
    private String product_name;
    private String product_imageUrl;
    private String product_id;
    private int yield_duration;
    private String verity ;
    private int price_per_kg;
    private int product_weight;
}
