package com.wljy.service.type;

import com.github.pagehelper.PageInfo;
import com.wljy.entity.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author wangf
 * @Date 2019-02-27 08:42
 **/
public interface TypeService {
    /**
     * 添加类型
     * @param type
     */
    void addTypeService(Type type);

    /**
     * 查询所有类型
     * @return
     */
    List<Type> getTypeListService();

    /**
     * 分页查询
     * @param page
     * @param limit
     * @return
     */
    PageInfo getPageListService(@Param("pageNum") Integer page, @Param("pageSize") Integer limit);

    /**
     * 根据id修改
     * @param type
     */
    void updateTypeByIdService(Type type);
}
