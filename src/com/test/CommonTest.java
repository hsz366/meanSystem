package com.test;

import com.pojo.Ffamily;
import com.pojo.Lender;
import com.service.impl.CommonServiceImpl;
import com.service.impl.LenderUserServiceImpl;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CommonTest {
    @Test
    public void getFreeTest(){
        CommonServiceImpl commonService = new CommonServiceImpl();
        List<Ffamily> free = commonService.getFree("笔记本电脑");

        System.out.println(free.get(0));
        System.out.println(free.size());

        String a = "1";
        Integer i = Integer.parseInt(a);
        System.out.println(i);

    }
    @Test
    public void noBackTest(){
        LenderUserServiceImpl lenderUserService = new LenderUserServiceImpl();
        List<Lender> list = lenderUserService.noBcak("admin");
        System.out.println(list);
    }

    @Test
    public void rePayTest(){
        LenderUserServiceImpl lenderUserService = new LenderUserServiceImpl();
        boolean cpi00005 = lenderUserService.giveBack("CPI00005");
        System.out.println(cpi00005);
    }

    @Test
    public void myTest(){
        Date time = new Date();
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

        String format1 = format.format(time);
        System.out.println(format1);
    }


    public static void main(String[] args){
        Integer i = 200;
        Integer y = 200;
        Integer y1 = new Integer(200);

        boolean b = i.equals(y);
        boolean b2 = y.equals(y1);

        System.out.println(b);
        System.out.println(b2);
    }

    @Override
    public boolean equals(Object obj){
        System.out.println(obj);
        return false;
    }

}
