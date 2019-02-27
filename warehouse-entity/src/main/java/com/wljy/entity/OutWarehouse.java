package com.wljy.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author wangf
 * @Date 2019-02-26 22:46
 **/
@Data
public class OutWarehouse {
    /**
     * 产品id
     */
    private Integer productId;
    /**
     * 出库数量
     */
    private Integer outWarehouseNumber;
    /**
     * 出库时间
     */
    private Date outWarehouseTime;
    /**
     * 产品信息
     */
    private Product product;
}
