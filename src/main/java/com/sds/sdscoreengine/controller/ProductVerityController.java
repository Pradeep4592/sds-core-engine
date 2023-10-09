package com.sds.sdscoreengine.controller;


import com.sds.sdscoreengine.db.repo.ProductVerityRepository;
import com.sds.sdscoreengine.model.ProductVerity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductVerityController {
    @Autowired
    ProductVerityRepository productVerityRepository;
    @PostMapping("/addProductVerity")
    public void addProductVerity(ProductVerity productVerity){
    productVerityRepository.save(productVerity);
    }

    @PostMapping("/getAllProductVerity")
    public List<ProductVerity> getProductVerity(){
       return  productVerityRepository.findAll();
    }
}
