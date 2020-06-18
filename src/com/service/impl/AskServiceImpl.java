package com.service.impl;

import com.pojo.Ffamily;
import com.service.IAskService;
import com.util.CommonUtil;
import com.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class AskServiceImpl implements IAskService {

    /**
     * 插入到lend表中
     * @param count
     * @return
     */
    @Override
    public boolean askLend(String username,String cpname,int count) {

        CommonServiceImpl commonService = new CommonServiceImpl();
        List<Ffamily> free = commonService.getFree(cpname);

        if(free.size()<1){
            return false;
        }

        Random random = new Random();

        int ran = random.nextInt(free.size());

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            conn = JdbcUtil.getConnection();
            pst = conn.prepareStatement("insert into lend values(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,null);
            pst.setString(2,free.get(ran).getZcid());
            pst.setString(3,free.get(ran).getFamily());
            pst.setString(4,free.get(ran).getCpid());
            pst.setString(5,free.get(ran).getCpname());
            pst.setString(6,free.get(ran).getCpnorm());
            pst.setInt(7,1);
            pst.setString(8,username);
            pst.setString(9, CommonUtil.getTime(new Date()));
            pst.setInt(10,0);
            pst.setString(11,null);
            commonService.reSet(username,1,free.get(ran).getId());
            int i = pst.executeUpdate();
            if(i>0){
                return true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JdbcUtil.Close(conn,rs,pst);
        }
        return false;
    }
}
