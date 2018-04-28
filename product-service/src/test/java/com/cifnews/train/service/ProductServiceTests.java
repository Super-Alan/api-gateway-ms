package com.cifnews.train.service;

import com.cifnews.train.ProductServiceApplicationTests;
import com.cifnews.train.dto.ProductDto;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import static org.junit.Assert.*;

import java.util.List;

/**
 * Created by lucky on 2018/4/27.
 */
@Component
public class ProductServiceTests extends ProductServiceApplicationTests {
    @Autowired
    private ProductService productService;

    @Test
    public void shouldReturnProductList(){
        List<ProductDto> listDto = productService.listProducts(new PageRequest(0,1));
        listDto.stream().forEach(productDto -> System.out.println(productDto));
        assertTrue(listDto.size() > 0);

    }
}
