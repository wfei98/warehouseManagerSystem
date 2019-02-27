package com.wljy.service.product.impl;

import com.wljy.dao.product.ProductDao;
import com.wljy.entity.Product;
import com.wljy.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author wangf
 * @Date 2019-02-27 08:50
 **/
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;


    /**
     * 添加产品
     *
     * @param product
     */
    @Override
    public void addProductService(Product product) {
        try {
            productDao.addProduct(product);
        }catch (RuntimeException e){
            throw new RuntimeException("添加产品失败！");
        }
    }

    /**
     * 查询所有产品并分页
     *
     * @param page
     * @param limit
     * @return
     */
    @Override
    public List<Product> getPageProductListService(Integer page, Integer limit) {
        return null;
    }

    /**
     * 根据id删除产品
     *
     * @param productId
     */
    @Override
    public void delProductByIdService(Integer productId) {

    }

    /**
     * 根据id修改产品信息
     *
     * @param product
     */
    @Override
    public void updateProductByIdService(Product product) {

    }

    /**
     * 修改产品数量
     *
     * @param product
     */
    @Override
    public void updateProductNumberByIdService(Product product) {

    }
}
