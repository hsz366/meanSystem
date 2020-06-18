package com.service.impl;

import com.dao.impl.LenderDaoImpl;
import com.pojo.Ffamily;
import com.pojo.Lender;
import com.service.ILenderUserService;

import java.util.List;

public class LenderUserServiceImpl implements ILenderUserService {
    @Override
    public List getLender(String name) {
        LenderDaoImpl lenderDao = new LenderDaoImpl();
        List lend = lenderDao.getLend(name);
        return lend;
    }

    /**
     * 物品归还
     * @param cpid
     * @return
     */
    @Override
    public boolean giveBack(String cpid) {
        LenderDaoImpl lenderDao = new LenderDaoImpl();
        boolean b = lenderDao.rePay(cpid);
        CommonServiceImpl commonService = new CommonServiceImpl();
        boolean b1 = commonService.rePay(cpid);
        return b&&b1;
    }

    /**
     * 查询没有归还的物品
     * @param name
     * @return
     */
    public List<Lender> noBcak(String name){
        LenderDaoImpl lenderDao = new LenderDaoImpl();
        List<Lender> noBack = lenderDao.getNoBack(name);
        return noBack;
    }
}
