package com.wljy.service.length.impl;

import com.github.pagehelper.PageInfo;
import com.wljy.dao.length.LengthDao;
import com.wljy.entity.Length;
import com.wljy.service.length.LengthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wangf
 * @Date 2019-02-27 08:48
 **/
@Service("lengthService")
public class LengthServiceImpl implements LengthService {

    @Autowired
    private LengthDao lengthDao;
    /**
     * 添加长度
     *
     * @param length
     */
    @Override
    public void addLengthService(Length length) {
        try {
            lengthDao.addLength(length);
        }catch (RuntimeException e){
            throw new RuntimeException("添加失败！");
        }
    }

    /**
     * 查询所有的长度信息
     *
     * @return
     */
    @Override
    public List<Length> getLengthListService() {
        try {
            return lengthDao.getLengthList();
        }catch (RuntimeException e){
            throw new RuntimeException("查询失败！");
        }
    }

    /**
     * 修改长度
     *
     * @param length
     */
    @Override
    public void updateLengthService(Length length) {
        try {
            lengthDao.updateLength(length);
        }catch (RuntimeException e){
            throw new RuntimeException("修改失败！");
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
    public PageInfo getPageLengthList(Integer page, Integer limit) {
        try {
            List<Length> lengthList = lengthDao.getPageLengthList(page,limit);
            PageInfo<Length> pageInfo = new PageInfo<>(lengthList);
            return pageInfo;
        }catch (RuntimeException e){
            throw new RuntimeException("查询分页失败！");
        }
    }

    /**
     * 根据id删除
     *
     * @param lengthId
     */
    @Override
    public void delLengthByIdService(Integer lengthId) {
        try {
             lengthDao.delLength(lengthId);
        }catch (RuntimeException e){
            throw new RuntimeException("删除失败！");
        }
    }
}
