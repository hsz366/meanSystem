package com.test;

import com.dao.impl.UserDaoImpl;
import com.pojo.User;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void getUserAllTest(){
        UserDaoImpl userDao = new UserDaoImpl();
        List<User> list = userDao.getUserAll();
        System.out.println(list.get(0));
    }
}
