package com.wljy.entity;

import lombok.Data;

/**
 * @Author wangf
 * @Date 2019-02-26 22:35
 **/
@Data
public class Product {
    /**
     * 产品id
     */
    private Integer productId;
    /**
     *  产品名称
     */
    private String productName;
    /**
     *  产品长度
     */
    private Length length;
    /**
     * 产品数量
     */
    private String productNumber;
    /**
     * 关联类型
     */
    private Type type;
}
