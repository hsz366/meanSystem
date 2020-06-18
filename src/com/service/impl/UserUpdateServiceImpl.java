package com.service.impl;

import com.dao.impl.UserDaoImpl;
import com.service.IUserUpdateService;

public class UserUpdateServiceImpl implements IUserUpdateService {
    @Override
    public boolean Update(String name, String password) {
        UserDaoImpl userDao = new UserDaoImpl();
        boolean update = userDao.update(name, password);
        return update;
    }

}
