package com.wljy.dao.product;

import com.wljy.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {

    /**
     * 添加产品
     * @param product
     */
    void addProduct(Product product);

    /**
     * 查询所有产品并分页
     * @param page
     * @param limit
     * @return
     */
    List<Product> getPageProductList(@Param("pageNum") Integer page, @Param("pageSize") Integer limit);

    /**
     * 根据id删除产品
     * @param productId
     */
    void delProductById(Integer productId);

    /**
     * 根据id修改产品信息
     * @param product
     */
    void updateProductById(Product product);

    /**
     * 修改产品数量
     * @param product
     */
    void updateProductNumberById(Product product);

}
