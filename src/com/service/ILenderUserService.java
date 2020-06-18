package com.service;

import java.util.List;

public interface ILenderUserService {
    /**
     * 查询借条的状态、
     * @param name
     * @return
     */
    public List getLender(String name);

    /**
     * 物品归还
     * @param cpid
     * @return
     */
    public boolean giveBack(String cpid);
}
