package com.dao.impl;

import com.dao.IAssetDao;
import com.pojo.Asset;
import com.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AssetDaoImpl implements IAssetDao {
    @Override
    public List getAsset() {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Asset asset = null;
        List<Asset> list = new ArrayList();
        try{
            conn = JdbcUtil.getConnection();
            pst = conn.prepareStatement("select * from asset");
            rs = pst.executeQuery();
            while(rs.next()){
                asset = new Asset(rs.getInt(1),rs.getString(2),rs.getString(3),
                        rs.getString(4),rs.getString(5),rs.getString(6),
                        rs.getString(7),rs.getString(8),rs.getString(9),
                        rs.getString(10),rs.getString(11),rs.getInt(12),rs.getDouble(13));
                list.add(asset);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JdbcUtil.Close(conn,rs,pst);
        }
        return list;
    }
}
