package com.test;

import com.service.impl.LenderUserServiceImpl;
import org.junit.Test;

import java.util.List;

public class LenderUserImplTest {
    @Test
    public void getListTest(){
        LenderUserServiceImpl lenderUser = new LenderUserServiceImpl();
        List admin = lenderUser.getLender("admin");

        System.out.println(admin);
    }
}
