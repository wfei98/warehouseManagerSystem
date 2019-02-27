package com.wljy.service.length.impl;

import com.github.pagehelper.PageInfo;
import com.wljy.entity.Length;
import com.wljy.service.length.LengthService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class LengthServiceImplTest {
    private static   ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    private LengthService lengthService = context.getBean("lengthService",LengthService.class);
    @Test
    public void addLengthService() {
        Length length = new Length();
        length.setLengthName("1.5M");
        lengthService.addLengthService(length);
    }

    @Test
    public void getLengthListService() {
        List<Length> lengthList = lengthService.getLengthListService();
        for (Length length : lengthList) {
            System.out.println(length.toString());
        }
    }


    @Test
    public void delLengthById() {
        lengthService.delLengthByIdService(3);
    }

    @Test
    public void updateLengthService() {
        Length length = new Length();
        length.setLengthName("1.2M");
        length.setLengthId(1);
        lengthService.updateLengthService(length);
    }

    @Test
    public void getPageLengthList() {
        PageInfo pageInfo = lengthService.getPageLengthList(1,3);
        List<Length> lengthList = pageInfo.getList();
        for (Length length : lengthList) {
            System.out.println(length.toString());
        }

    }
}