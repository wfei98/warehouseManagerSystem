package com.wljy.dao.user;

import com.wljy.entity.User;

/**
 * @Author wangf
 * @Date 2019-02-26 22:33
 **/
public interface UserDao {

    /**
     * 验证用户登录是否正确
     * @param userName
     * @return
     */
    User getUserByUserName(String userName);

}
