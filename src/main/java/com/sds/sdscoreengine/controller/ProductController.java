package com.sds.sdscoreengine.controller;

import com.sds.sdscoreengine.db.repo.ProductRepository;
import com.sds.sdscoreengine.model.ProductDetails;
import com.sds.sdscoreengine.service.ProductDetailService;
import lombok.Getter;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/product")
public class ProductController {
    Logger log= LoggerFactory.getLogger(ProductController.class);
    @Autowired
    ProductDetailService productDetailService;
    @PostMapping("/addProduct")
    public String addProduct(@RequestBody() ProductDetails productDetails){
        log.info("saving product");
    return productDetailService.addProduct(productDetails);
}
    @DeleteMapping("/deleteProduct")
    public void deleteProduct(@RequestBody() ProductDetails productDetails){
        productDetailService.deleteProduct(productDetails);
        log.info("product deleted");
    }
    @GetMapping("/getAllProduct")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<ProductDetails> getAllProduct(){
        log.info("fetching all product ");
        return  productDetailService.getAllProduct();
    }

}
