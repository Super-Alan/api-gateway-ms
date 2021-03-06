package com.cifnews.train.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by lucky on 2018/4/27.
 */
@Data
@Entity
@Table(name = "tbl_order_item", schema = "order", catalog = "")
public class OrderItemEntity {
    @Id
    private int itemId;
    private int userId;
    private int productId;
    private int skuId;
    private double number;
    private int status;
    private BigDecimal price;
    private BigDecimal marketPrice;
    private double total;
    private int orderId;
    private String orderNumber;
    private Timestamp orderDate;
    private String usedDate;
    private String specInfo;
    private String unit;
    private BigDecimal cost;
    private BigDecimal discount;
    private String productName;
    private Double exchange;
    private String imageUrl;

}
