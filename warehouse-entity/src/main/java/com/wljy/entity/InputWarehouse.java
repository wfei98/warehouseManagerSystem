package com.wljy.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author wangf
 * @Date 2019-02-26 22:46
 **/
@Data
public class InputWarehouse {
    /**
     * 产品id
     */
    private Integer productId;

    /**
     * 产品对象
     */
    private Product product;
    /**
     * 入库数量
     */
    private Integer inputWarehouseNumber;
    /**
     * 入库时间
     */
    private Date  inputWarehouseTime;

}
