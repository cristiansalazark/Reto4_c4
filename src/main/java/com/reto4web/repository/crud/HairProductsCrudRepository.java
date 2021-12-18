package com.reto4web.repository.crud;


import com.reto4web.model.HairProducts;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Cristian Salazar
 */
public interface HairProductsCrudRepository extends MongoRepository<HairProducts, String> {
    
}
