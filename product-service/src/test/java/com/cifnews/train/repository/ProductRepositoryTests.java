package com.cifnews.train.repository;

import com.cifnews.train.ProductServiceApplicationTests;
import com.cifnews.train.dto.ProductDto;
import com.cifnews.train.entity.ProductEntity;
import org.junit.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import static org.junit.Assert.*;

/**
 * Created by lucky on 2018/4/26.
 */
@Component
public class ProductRepositoryTests extends ProductServiceApplicationTests{

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ModelMapper mapper;

    @Test
    public void shouldReturnProductsByPage(){
       Page<ProductEntity> entities = productRepository.findAll(new PageRequest(0,1));
       List<ProductDto> dtos = entities.getContent().stream()
                .map(element-> mapper.map(element,ProductDto.class))
                .collect(Collectors.toList());
       assertTrue(dtos.size()>0);
    }
}
