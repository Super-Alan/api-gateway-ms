package com.cifnews.train.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;


@Data
public class BasketParamDto {
    private int shoppingId;

    @Min(1)
    private int productId;

    @Min(1)
    private int skuId;

    @Min(1)
    private int number;

    @NotEmpty
    private String productName;

    @NotEmpty
    private String spec;

    @NotEmpty
    private String imageUrl;
}
