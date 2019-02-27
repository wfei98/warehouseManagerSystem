package com.wljy.entity;

import lombok.Data;

/**
 * @Author wangf
 * @Date 2019-02-27 07:32
 **/
@Data
public class User {
    private Integer userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String userPassword;
}
