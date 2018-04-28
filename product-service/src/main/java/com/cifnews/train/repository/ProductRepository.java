package com.cifnews.train.repository;


import com.cifnews.train.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lucky on 2018/4/25.
 */
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer>{
}
