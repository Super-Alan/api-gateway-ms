package com.cifnews.train.client;

import com.cifnews.train.dto.ProductDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author lucky
 * Created by lucky on 2018/4/27.
 */
@FeignClient("product-service")
public interface ProductClient {

    /**
     * reduce inventory
     * @param id
     * @param count
     * @return
     */
    @PutMapping("/products/reduce/{id}")
    ResponseEntity decreaseInventoryById(@PathVariable(value = "id") Integer id, @RequestBody Integer count);

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/products/{id}")
    ProductDto getProductById(@PathVariable(value = "id") Integer id);
}
