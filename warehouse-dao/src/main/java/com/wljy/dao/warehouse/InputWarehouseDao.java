package com.wljy.dao.warehouse;

import com.wljy.entity.InputWarehouse;

/**
 * @Author wangf
 * @Date 2019-02-26 22:33
 **/
public interface InputWarehouseDao {
    /**
     * 添加产品入库信息
     * @param inputWarehouse
     */
    void addInputWarehouse(InputWarehouse inputWarehouse);
}
