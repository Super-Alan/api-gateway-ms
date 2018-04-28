package com.cifnews.train.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by lucky on 2018/4/27.
 */
@Data
@Entity
@Table(name = "tbl_product", schema = "product", catalog = "")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    private String productName;
    private String aliasName;
    private int quota;
    private String productDetail;
    private String area;
    private int overselling;
    private int productType;
    private String comments;
    private int priority;
    private int status;
    private String imageUrl;
    private Date uptime;
    private Date downtime;
    private int validDateAlarm;
    private int volume;
    private String advertisingImgUrl;
    private BigDecimal lowestPrice;
    private BigDecimal price;
    private Integer defaultSkuId;
    private String spuCode;
    private Integer deleteStatus;
    private Integer weight;
    private Double bulk;
    private Integer deliveryDays;
    private Timestamp createTime;

}
