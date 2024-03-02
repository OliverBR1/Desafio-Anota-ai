package com.brunooliveira.desafioanotaai.repositories;

import com.brunooliveira.desafioanotaai.domain.products.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
