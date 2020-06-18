package com.service;

import com.pojo.User;

public interface IUserUpdateService {
    /**
     * 普通用户修改密码
     * @param name
     * @param password
     * @return
     */
    public boolean Update(String name, String password);

}
