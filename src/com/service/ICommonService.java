package com.service;

import com.pojo.Ffamily;

import java.util.List;

public interface ICommonService {
    /**
     * 返回空闲的物品
     * @param cpname 需要返回的物品的名称
     * @return 返回空闲物品的List
     */
    public List<Ffamily> getFree(String cpname);

    /**
     * 修改物品的状态   0 为闲置   1 为借出
     * @param status 想要设置的物品状态
     * @param id  需要改变的物品id 且他是物品的唯一标识
     * @return  返回操作是否成功
     */
    public boolean reSet(String name,int status,int id);
}
