package com.dao;

import com.pojo.User;

import java.util.List;

public interface IUserDao {
    /**
     * 查找用户是否存在
     * find user exist or not
     * @param name 用户名或邮箱 username or Email
     * @param password  password
     * @return 用户 User
     */
    public User find(String name,String password);

    /**
     * 添加新用户
     * add new user
     * @param user
     * @return 操作是否成功 execute success or not
     */
    public boolean add(User user);

    /**
     * 普通用户修改用户信息
     * update user date
     * @param name
     * @param password
     * @return
     */
    public boolean update(String name,String password);


    /**
     * 超级管理员获取所有用户信息
     * @return
     */
    public List getUserAll();
}
