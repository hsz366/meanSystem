package com.service;

import com.pojo.User;

public interface ILoginService {
    public User Login(String name,String password);
}
