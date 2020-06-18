package com.service.impl;

import com.dao.impl.UserDaoImpl;
import com.pojo.User;
import com.service.IAddUserService;

public class AddUserServiceImpl implements IAddUserService {
    @Override
    public boolean newUser(String email ,String username, String password) {
        User user = new User(email,username,password);
        UserDaoImpl userDao = new UserDaoImpl();
        boolean add = userDao.add(user);
        return add;
    }
}
