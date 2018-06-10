package com.cifnews.train.controller;

import com.cifnews.train.dto.ProductDto;
import com.cifnews.train.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lucky
 */
@RestController
public class ProductController {

    private static final Logger LOG = LoggerFactory.getLogger(ProductController.class.getName());

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    @PreAuthorize("hasAnyAuthority('query')")
    public List<ProductDto> getAllProducts(@PageableDefault(sort = {"createTime"}, direction = Sort.Direction.DESC) Pageable pageable){
        return productService.listProducts(pageable);
    }

    @GetMapping("/products/{id}")
    @PreAuthorize("hasAnyAuthority('query')")
    public  ProductDto getProductById(@PathVariable Integer id) throws Exception {
        return productService.findProductById(id);
    }

    @PutMapping("/products/reduce/{id}")
    @PreAuthorize("hasAnyAuthority('query')")
    public ResponseEntity decreaseInventoryById(@PathVariable Integer id,@RequestBody Integer count) throws Exception {
        //find product inventory
        ProductDto productDto = productService.findProductById(id);
        //check the remain number,than reduce the count
        //ok then return accepted
        LOG.info("has reduced product inventory:{} {}",productDto.getProductName(),count);
        return new ResponseEntity<>(count, HttpStatus.ACCEPTED);
    }
}
