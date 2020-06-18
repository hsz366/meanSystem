package com.service.impl;

import com.pojo.Ffamily;
import com.pojo.Lender;
import com.service.ICommonService;
import com.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommonServiceImpl implements ICommonService {

    /**
     * 查找空闲的物品
     * @param cpname
     * @return
     */
    @Override
    public List<Ffamily> getFree(String cpname) {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Ffamily> list = new ArrayList();
        Ffamily ffamily = null;
        try{
            conn = JdbcUtil.getConnection();
            pst = conn.prepareStatement("select * from ffamily where cpname = ?");
            pst.setString(1,cpname);
            rs = pst.executeQuery();
            while(rs.next()){
                int anInt = rs.getInt(7);
                if(anInt==0){//表示物品空闲，可以用户使用
                    ffamily = new Ffamily(rs.getInt(1),rs.getString(2),rs.getString(3),
                            rs.getString(4),rs.getString(5),rs.getString(6),
                            rs.getInt(7),rs.getString(8),rs.getString(9));
                    list.add(ffamily);
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JdbcUtil.Close(conn,rs,pst);
        }
        return list;
    }


    public boolean rePay(String cpid){
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            conn = JdbcUtil.getConnection();
            pst = conn.prepareStatement("update ffamily set applyname = ? , status = ? where cpid = ?");
            pst.setString(1,null);
            pst.setInt(2,0);
            pst.setString(3,cpid);
            int i = pst.executeUpdate();
            if(i>0){
                return true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            JdbcUtil.Close(conn,rs,pst);
        }
        return false;
    }

    /**
     * 更新图品的状态--闲置、借出
     * @param status 0 闲置  1 借出
     * @param id 物品的唯一标识
     * @return 操作是否成功
     */
    @Override
    public boolean reSet(String name,int status,int id){
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            conn = JdbcUtil.getConnection();
            pst = conn.prepareStatement("update ffamily set applyname = ? , status = ? where id = ?");
            pst.setString(1,name);
            pst.setInt(2,status);
            pst.setInt(3,id);
            int i = pst.executeUpdate();
            if(i>0){
                return true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            JdbcUtil.Close(conn,rs,pst);
        }
        return false;
    }
}
