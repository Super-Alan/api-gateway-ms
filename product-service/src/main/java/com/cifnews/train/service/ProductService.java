package com.cifnews.train.service;

import com.cifnews.train.dto.ProductDto;
import com.cifnews.train.entity.ProductEntity;
import com.cifnews.train.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lucky on 2018/4/25.
 */
@Service
public class ProductService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ProductRepository repository;

    public List<ProductDto> listProducts(Pageable pageable){

        return repository.findAll(pageable)
                .getContent().stream()
                .map(element-> modelMapper.map(element,ProductDto.class))
                .collect(Collectors.toList());
    }

    public ProductDto findProductById(Integer productId) throws Exception {
        ProductEntity productEntity = repository.findOne(productId);
        if (productEntity != null){
            return modelMapper.map(productEntity,ProductDto.class);
        }
        else
        {
            throw new Exception("product is not existed!");
        }
    }



}
