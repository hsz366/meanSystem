package com.dao.impl;

import com.dao.ILenderDao;
import com.pojo.Lender;
import com.util.CommonUtil;
import com.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LenderDaoImpl implements ILenderDao {

    @Override
    public List getLend(String name) {
        List<Lender> list = new ArrayList();
        Lender lender = null;
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtil.getConnection();
            pst = conn.prepareStatement("select * from lend where applyname = ?");
            pst.setString(1,name);
            rs = pst.executeQuery();
            while (rs.next()){
                lender = new Lender(rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getString(11));
                list.add(lender);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtil.Close(conn,rs,pst);
        }
        return list;
    }

    /**
     * 归还物品时，在lend表中插入系统时间
     * @param cpid
     * @return
     */
    public boolean rePay(String cpid){
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String time = CommonUtil.getTime(new Date());
        try{
            conn = JdbcUtil.getConnection();
            pst = conn.prepareStatement("update lend set sptime = ? ,status = ? where cpid = ?");
            pst.setString(1,time);
            pst.setInt(2,1);
            pst.setString(3,cpid);
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

    /**
     * 查询没有归还的物品
     * @param name
     * @return
     */
    public List<Lender> getNoBack(String name){
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Lender> list = new ArrayList<>();
        Lender lender = null;
        try{
            conn = JdbcUtil.getConnection();
            pst = conn.prepareStatement("select * from lend where applyname = ? and status = ?");
            pst.setString(1,name);
            pst.setInt(2,0);
            rs = pst.executeQuery();
            while (rs.next()){
                lender = new Lender(rs.getInt(1),rs.getString(2),rs.getString(3),
                        rs.getString(4),rs.getString(5),rs.getString(6),
                        rs.getInt(7),rs.getString(8),rs.getString(9),
                        rs.getInt(10),rs.getString(11));
                list.add(lender);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JdbcUtil.Close(conn,rs,pst);
        }
        return list;
    }
}
