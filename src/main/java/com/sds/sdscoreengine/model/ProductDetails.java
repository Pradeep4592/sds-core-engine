package com.sds.sdscoreengine.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDetails {
    private String _id;
    private String productName;
    private String productImageUrl;
    private String productId;
    private int yieldDuration;
    private String verity ;
    private int pricePerKg;
    private int productWeight;
}
