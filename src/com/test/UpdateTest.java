package com.test;

import com.service.impl.AdminImpl;
import com.service.impl.UserUpdateServiceImpl;
import org.junit.Test;

public class UpdateTest {
    @Test
    public void UpdateTest(){
        UserUpdateServiceImpl userUpdate = new UserUpdateServiceImpl();
        boolean admin = userUpdate.Update("admin", "123");
        System.out.println(admin);
    }

    @Test
    public void RootTest(){
        AdminImpl admin = new AdminImpl();
        boolean root = admin.getRoot(2, 2, 0);
        System.out.println(root);
    }
}
