package com.cifnews.train.controller;

import com.cifnews.train.dto.SettlementParamDto;
import com.cifnews.train.service.OrderService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lucky
 * Created by lucky on 2018/4/27.
 */
@Api(value = "orders", description = "order the swagger API")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Value("${order.limit-access-count}")
    private Integer count;

    /**
     * 1.获取订单内商品信息
     * 2.计算商品价格
     * 3.扣减库存
     * 4....
     * @param request
     * @param settlementParamDto
     * @return
     */
    @PostMapping("/orders")
    @PreAuthorize("hasAnyAuthority('query')")
    public SettlementParamDto createOrder(HttpServletRequest request,
                                      @RequestBody @Validated SettlementParamDto settlementParamDto){
       SettlementParamDto paramDto = orderService.createOrder(settlementParamDto);
      return paramDto;
    }


    @GetMapping("/orders/limit")
    public Integer getOrderLimit(){
        return count;
    }




}
