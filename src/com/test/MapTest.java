package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("超级管理员",2);
        hashMap.put("管理员",1);
        hashMap.put("普通用户",0);


        Iterator it = hashMap.entrySet().iterator();

        while (it.hasNext()){
            System.out.println(hashMap.get("超级管理员"));
        }

    }
}
