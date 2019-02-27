package com.wljy.dao.type;

import com.wljy.entity.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author wangf
 * @Date 2019-02-26 22:33
 **/
public interface TypeDao {

    /**
     * 添加类型
     * @param type
     */
    void addType(Type type);

    /**
     * 查询所有类型
     * @return
     */
    List<Type> getTypeList();

    /**
     * 分页查询
     * @param page
     * @param limit
     * @return
     */
    List<Type> getPageList(@Param("pageNum") Integer page, @Param("pageSize") Integer limit);

    /**
     * 根据id修改
     * @param type
     */
    void updateTypeById(Type type);

}
