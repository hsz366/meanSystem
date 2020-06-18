package com.service.impl;

import com.dao.impl.UserDaoImpl;
import com.pojo.User;
import com.service.ILoginService;


public class LoginServiceImpl implements ILoginService {

    @Override
    public User Login(String name, String password) {
        UserDaoImpl userDao = new UserDaoImpl();
        User user = userDao.find(name, password);
        return user;
    }
}
