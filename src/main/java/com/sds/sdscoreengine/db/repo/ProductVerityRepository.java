package com.sds.sdscoreengine.db.repo;

import com.sds.sdscoreengine.model.ProductDetails;
import com.sds.sdscoreengine.model.ProductVerity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductVerityRepository extends MongoRepository<ProductVerity,String> {
}
