package com.sds.sdscoreengine.service;

import com.sds.sdscoreengine.controller.ProductController;
import com.sds.sdscoreengine.db.repo.ProductRepository;
import com.sds.sdscoreengine.model.ProductDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class ProductDetailService
{
    Logger log= LoggerFactory.getLogger(ProductDetailService.class);
    @Autowired
    ProductRepository productRepository;
    public String addProduct( ProductDetails productDetails){
        log.info("saving product");
         productRepository.save(productDetails);
         return "";

    }
    public void deleteProduct(ProductDetails productDetails){
        productRepository.delete(productDetails);
        log.info("product deleted");
    }
    public List<ProductDetails> getAllProduct(){
        log.info("fetching all product ");
        return  productRepository.findAll();
    }
}
