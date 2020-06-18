package com.test;

import com.util.JdbcUtil;
import org.junit.Test;

import java.sql.*;


public class JdbcUtilTese {
    @Test
    public void getDataSourceTest(){
        try {
            Connection con = JdbcUtil.getConnection();

            Statement stm  = con.createStatement();
            PreparedStatement pst = con.prepareStatement("select * from user where username=? and password=?");
            pst.setString(1,"admin");
            pst.setString(2,"admin");


            ResultSet rs = pst.executeQuery();

            while (rs.next()){
                System.out.println(1);
            }

            JdbcUtil.Close(con,rs,pst);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
