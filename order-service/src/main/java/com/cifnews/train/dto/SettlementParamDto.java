package com.cifnews.train.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
public class SettlementParamDto {

    private String customerName;
    private String mobile;

    @Min(0)
    @Max(1)
    private int settlementMode;

    @NotNull
    private String deviceInfo;

    @Min(0)
    @Max(1)
    private int particialPay;

    @Min(0)
    @Max(1)
    private int deliveryMode;


    @NotNull
    private String comments;

    @NotEmpty
    @Valid
    private List<BasketParamDto> shoppingList;


}
