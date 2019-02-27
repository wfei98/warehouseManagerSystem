package com.wljy.service.product;

import com.wljy.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author wangf
 * @Date 2019-02-27 08:41
 **/
public interface ProductService {
    /**
     * 添加产品
     * @param product
     */
    void addProductService(Product product);

    /**
     * 查询所有产品并分页
     * @param page
     * @param limit
     * @return
     */
    List<Product> getPageProductListService(@Param("pageNum") Integer page, @Param("pageSize") Integer limit);

    /**
     * 根据id删除产品
     * @param productId
     */
    void delProductByIdService(Integer productId);

    /**
     * 根据id修改产品信息
     * @param product
     */
    void updateProductByIdService(Product product);

    /**
     * 修改产品数量
     * @param product
     */
    void updateProductNumberByIdService(Product product);
}
