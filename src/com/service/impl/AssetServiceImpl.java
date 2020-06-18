package com.service.impl;

import com.dao.impl.AssetDaoImpl;
import com.pojo.Asset;
import com.service.IAssetService;

import java.util.List;

public class AssetServiceImpl implements IAssetService {
    @Override
    public List<Asset> getList() {
        AssetDaoImpl assetDao = new AssetDaoImpl();
        List asset = assetDao.getAsset();
        return asset;
    }
}
