package com.service.impl;

import com.dao.impl.UserDaoImpl;
import com.pojo.User;
import com.service.IUserListService;

import java.util.List;

public class UserListServiceImpl implements IUserListService {
    @Override
    public List<User> getUser() {
        UserDaoImpl userDao = new UserDaoImpl();
        List<User> userAll = userDao.getUserAll();
        return userAll;
    }
}
