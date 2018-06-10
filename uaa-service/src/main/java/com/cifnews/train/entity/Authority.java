package com.cifnews.train.entity;

import com.cifnews.train.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by SuperS on 2017/9/25.
 *
 * @author SuperS
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Authority extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String value;
}
