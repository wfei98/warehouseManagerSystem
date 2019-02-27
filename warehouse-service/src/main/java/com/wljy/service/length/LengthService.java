package com.wljy.service.length;

import com.github.pagehelper.PageInfo;
import com.wljy.entity.Length;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author wangf
 * @Date 2019-02-27 08:40
 **/
public interface LengthService {
    /**
     * 添加长度
     * @param length
     */
    void addLengthService(Length length);

    /**
     * 查询所有的长度信息
     * @return
     */
    List<Length> getLengthListService();

    /**
     * 根据id删除
     * @param lengthId
     */
    void delLengthByIdService(Integer lengthId);

    /**
     * 修改长度
     * @param length
     */
    void updateLengthService(Length length);

    /**
     * 分页查询
     * @param page
     * @param limit
     * @return
     */
    PageInfo getPageLengthList(@Param("pageNum") Integer page, @Param("pageSize") Integer limit);

}
