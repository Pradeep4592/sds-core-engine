package com.sds.sdscoreengine.controller;

import com.sds.sdscoreengine.db.repo.ProductRepository;
import com.sds.sdscoreengine.model.ProductDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;
    @PostMapping("/addProduct")
    public int addProduct(@RequestBody() ProductDetails productDetails){
        productRepository.save(productDetails);
    return 2;
}
}
