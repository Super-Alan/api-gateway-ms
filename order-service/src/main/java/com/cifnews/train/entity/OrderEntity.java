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
@Table(name = "tbl_order", schema = "order", catalog = "")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;
    private String orderNumber;
    private int userId;
    private String userName;
    private int status;
    private BigDecimal total;
    private Timestamp timeStart;
    private Timestamp timeExpire;
    private int tradeType;
    private String usedDate;
    private BigDecimal discount;
    private String comments;
    private String deviceInfo;
    private double actualTotal;
    private String customerName;
    private String email;
    private String mobile;
    private String address;
    private String reason;
    private int useMode;
    private String memo;
    private Timestamp lastReminderTime;
    private Timestamp paytime;
    private BigDecimal tranAmount;


}
