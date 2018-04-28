package com.cifnews.train.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by lucky on 2018/4/26.
 */
@Data
public class ProductDto {
    private int productId;
    private int categoryId;
    private String productName;
    private String aliasName;
    private int quota;
    private String productDetail;
    private int brandId;
    private String area;
    private int overselling;
    private int productType;
    private String comments;
    private int priority;
    private int status;
    private String imageUrl;
    private java.sql.Date uptime;
    private java.sql.Date downtime;
    private int validDateAlarm;
    private int volume;
    private String advertisingImgUrl;
    private BigDecimal lowestPrice;
    private BigDecimal price;
    private int defaultSkuId;
    private String spuCode;
    private int deleteStatus;
    private int weight;
    private Double bulk;
    private int deliveryDays;
    private Date createTime;
}
