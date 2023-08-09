package com.sds.sdscoreengine.db.repo;

import com.sds.sdscoreengine.model.ProductDetails;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface ProductRepository extends MongoRepository<ProductDetails,String> {


}
