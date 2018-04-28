package com.cifnews.train;

import com.cifnews.train.client.ProductClient;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import static org.junit.Assert.*;

/**
 * Created by lucky on 2018/4/27.
 */
@Component
public class ProductFeignTests extends OrderServiceApplicationTests {

    @Autowired
    public ProductClient productClient;

    @Test
    public  void shouldGetProduct(){
        ResponseEntity responseEntity = productClient.decreaseInventoryById(1,10);
        assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
    }
}
