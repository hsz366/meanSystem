package com.dao.impl;

import com.dao.IUserDao;
import com.pojo.User;
import com.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements IUserDao {


    /**
     * 查找用户是否存在
     * find user exist or not
     * @param name 用户名或邮箱 username or Email
     * @param password  password
     * @return 用户 User
     */
    @Override
    public User find(String name, String password) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        try {
            conn = JdbcUtil.getConnection();
            pst = conn.prepareStatement("select * from user where username = ?  and password = ?");
            pst.setString(1,name);
            pst.setString(2,password);

            rs = pst.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt(1));
                user.setEmail(rs.getString(2));
                user.setName(rs.getString(3));
                user.setPassword(rs.getString(4));
                user.setStatus(rs.getInt(5));
                user.setLock(rs.getInt(6));
                return user;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtil.Close(conn,rs,pst);
        }
        return null;
    }


    /**
     * 添加新用户
     * add new user
     * @param user
     * @return 操作是否成功 execute success or not
     */
    @Override
    public boolean add(User user) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        try {
            conn = JdbcUtil.getConnection();
            pst = conn.prepareStatement("insert into user (email,username,password) value(?,?,?)");
            pst.setString(1,user.getEmail());
            pst.setString(2,user.getName());
            pst.setString(3,user.getPassword());
            int i = pst.executeUpdate();
            if(i>0){
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtil.Close(conn,rs,pst);
        }
        return false;
    }

    /**
     * 修改用户信息
     * update user date
     * @param name
     * @param password
     * @return
     */
    @Override
    public boolean update(String name , String password) {
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = JdbcUtil.getConnection();
            pst = conn.prepareStatement("update user set password = ? where username = ? ");
            pst.setString(1,password);
            pst.setString(2,name);
            int i = pst.executeUpdate();
            if(i>0){
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtil.Close(conn,null,pst);
        }
        return false;
    }

    @Override
    public List<User> getUserAll() {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<User> list = new ArrayList();
        User user = null;
        try {
            conn = JdbcUtil.getConnection();
            pst = conn.prepareStatement("select * from user");
            rs = pst.executeQuery();
            while (rs.next()){
                user = new User(rs.getInt(1),rs.getString(2),rs.getString(3),
                rs.getString(4),rs.getInt(5),rs.getInt(6));
                list.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtil.Close(conn,rs,pst);
        }
        return list;
    }
}
