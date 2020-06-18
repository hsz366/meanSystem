package com.service.impl;

import com.service.IAdmin;
import com.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminImpl implements IAdmin {
    @Override
    public boolean getRoot(int id, int status, int lock) {
        Connection conn = null;
        PreparedStatement pst = null;
        try{
            conn = JdbcUtil.getConnection();
            pst = conn.prepareStatement("update user set status = ? , locked = ? where id = ?");
            pst.setInt(1,status);
            pst.setInt(2,lock);
            pst.setInt(3,id);
            int i = pst.executeUpdate();
            if(i>0){
                return true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JdbcUtil.Close(conn,null,pst);
        }
        return false;
    }
}
