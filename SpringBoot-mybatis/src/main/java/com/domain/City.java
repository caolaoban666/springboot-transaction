package com.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 城市实体类
 *
 * Created by bysocket on 07/02/2017.
 */
@Getter
@Setter
public class City {

    /**
     * 城市编号
     */
    private int id;

    /**
     * 省份编号
     */
    private int provinceId;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 描述
     */
    private String description;
}
