package com.test;

import com.pojo.User;
import com.service.impl.AddUserServiceImpl;
import com.service.impl.LoginServiceImpl;
import org.junit.Test;

public class LoginServiceImplTest {
    @Test
    public void LoginTest(){
        LoginServiceImpl loginService = new LoginServiceImpl();
        User login = loginService.Login("admin", "123");
        System.out.println(login);
    }
    @Test
    public void AddTest(){
        AddUserServiceImpl addUser = new AddUserServiceImpl();
        boolean b = addUser.newUser("111@163.com", "HHH", "HHH");
        System.out.println(b);
    }
}
