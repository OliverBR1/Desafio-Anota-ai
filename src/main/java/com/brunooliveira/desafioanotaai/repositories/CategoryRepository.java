package com.brunooliveira.desafioanotaai.repositories;

import com.brunooliveira.desafioanotaai.domain.category.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category,String> {
    //interface criada para o spring conseguir fazer as injeções de dependencias
}
