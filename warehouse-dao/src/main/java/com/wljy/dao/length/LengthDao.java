package com.wljy.dao.length;

import com.wljy.entity.Length;
import com.wljy.entity.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author wangf
 * @Date 2019-02-27 07:58
 **/
public interface LengthDao {
    /**
     * 添加长度
     * @param length
     */
    void addLength(Length length);

    /**
     * 查询所有的长度信息
     * @return
     */
    List<Length> getLengthList();

    /**
     * 根据id删除
     * @param lengthId
     */
    void delLength(Integer lengthId);

    /**
     * 修改长度
     * @param length
     */
    void updateLength(Length length);


    /**
     * 分页查询
     * @param page
     * @param limit
     * @return
     */
    List<Length> getPageLengthList(@Param("pageNum") Integer page, @Param("pageSize") Integer limit);

}
