package com.dao;

import java.util.List;

public interface ILenderDao {

    /**
     * 普通用户查看申请
     */
    public List getLend(String name);

}
