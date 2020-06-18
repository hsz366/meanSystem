package com.test;

import com.service.impl.AskServiceImpl;
import org.junit.Test;

public class AskServletImplTest {
    @Test
    public void getLendTest(){
        AskServiceImpl askService = new AskServiceImpl();
        boolean b = askService.askLend("hsz", "笔记本电脑", 1);
        System.out.println(b);
    }
}
