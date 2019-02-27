package com.wljy.service.type.impl;

import com.github.pagehelper.PageInfo;
import com.wljy.entity.Type;
import com.wljy.service.type.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wangf
 * @Date 2019-02-27 08:50
 **/
@Service("typeService")
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeService typeService;


    /**
     * 添加类型
     *
     * @param type
     */
    @Override
    public void addTypeService(Type type) {
            try {
                typeService.addTypeService(type);
            }catch (RuntimeException e){
                throw new RuntimeException("添加失败！");
            }
    }

    /**
     * 查询所有类型
     *
     * @return
     */
    @Override
    public List<Type> getTypeListService() {
        try {
            return typeService.getTypeListService();
        }catch (RuntimeException e){
            throw new RuntimeException("查询失败！");
        }
    }

    /**
     * 分页查询
     *
     * @param page
     * @param limit
     * @return
     */
    @Override
    public PageInfo getPageListService(Integer page, Integer limit) {
        try {
            List<Type> typeList = typeService.getTypeListService();
            PageInfo<Type> pageInfo = new PageInfo<>(typeList);
            return pageInfo;
        }catch (RuntimeException e){
            throw new RuntimeException("查询分页失败！");
        }
    }

    /**
     * 根据id修改
     *
     * @param type
     */
    @Override
    public void updateTypeByIdService(Type type) {
        try {
            typeService.updateTypeByIdService(type);
        }catch (RuntimeException e){
            throw new RuntimeException("修改失败！");
        }
    }
}
