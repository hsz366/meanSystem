package com.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JdbcUtil {
    private static DataSource ds;

    /**
     * 加载数据库驱动、设置数据库路径、用户和密码、并且初始化数据源
     * load sql driver and set url,user,password,init DataSource
     */
    static{
        try{
            Properties ps = new Properties();
            ps.load(JdbcUtil.class.getClassLoader().getResourceAsStream("database.properties"));
            ComboPooledDataSource DS = new ComboPooledDataSource();
            DS.setDriverClass(ps.getProperty("DRIVER"));
            DS.setJdbcUrl(ps.getProperty("URL"));
            DS.setUser(ps.getProperty("USER"));
            DS.setPassword(ps.getProperty("PASSWORD"));
            ds = DS;
        }catch (IOException e){

        }catch (Exception e){

        }
    }

    /**
     * 获取数据库连接
     * get mysql connection
     * @return connection
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException{
        return ds.getConnection();
    }

    /**
     * 归还connection、resultset、statement
     * give back sql connection resultset PreparedStatement
     * @param conn
     * @param rs
     * @param pst
     */
    public static void Close(Connection conn,ResultSet rs, PreparedStatement pst){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(pst!=null){
            try {
                pst.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    /**
     * 获取数据源
     * get mysql datasource
     * @return
     */
    public static DataSource getDataSource(){
        return ds;
    }
}
