package com.cifnews.train.service;

import com.cifnews.train.client.ProductClient;
import com.cifnews.train.dto.ProductDto;
import com.cifnews.train.dto.SettlementParamDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;

/**
 * Created by lucky on 2018/4/27.
 */
@Service
public class OrderService {
    @Autowired
    private ProductClient productClient;

    public SettlementParamDto createOrder(SettlementParamDto settlementParamDto){
        Integer productId = 1;
        ProductDto productDto =  productClient.getProductById(productId);
        if(productDto != null) {
            HttpEntity response = productClient.decreaseInventoryById(productId, 10);
        }
        return settlementParamDto;

    }
}
