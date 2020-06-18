package com.service;

public interface IAdmin {
    /**
     * 管理员受援或冻结
     * @param id
     * @param status
     * @param lock
     * @return
     */
    public boolean getRoot(int id,int status,int lock);
}
