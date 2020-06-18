package com.test;

import com.pojo.Asset;
import com.service.impl.AssetServiceImpl;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.SimpleFormatter;

public class AssetServiceTest {
    @Test
    public void getListTest(){
        AssetServiceImpl assetService = new AssetServiceImpl();
        List<Asset> list = assetService.getList();
        System.out.println(list);

        System.out.println(list.get(1).getCpid());

        Date mytime = new Date();

        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String format = time.format(mytime);

        System.out.println(format);

    }
}
