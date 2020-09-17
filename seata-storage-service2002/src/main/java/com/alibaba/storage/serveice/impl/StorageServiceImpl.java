package com.alibaba.storage.serveice.impl;

import com.alibaba.storage.entity.Storage;
import com.alibaba.storage.mapper.StorageMapper;
import com.alibaba.storage.serveice.StorageService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements StorageService{

    private StorageMapper storageMapper;
    /**
     * 减库存
     * @param productId
     * @param count
     */
    @Override
    public void decrese(Integer productId, BigDecimal count) {
        LambdaQueryWrapper<Storage> lambdaQueryWrapper=new QueryWrapper<Storage>().lambda();
        lambdaQueryWrapper.eq(productId!=null,Storage::getProdoctId,productId).ge(Storage::getTotal,count);
        Storage storage = storageMapper.selectOne(lambdaQueryWrapper);
        if (storage!=null){
            //使用数
            storage.setUsed(count);
            //剩余数
            storage.setResidue(storage.getResidue().subtract(count));
            storageMapper.updateStorage(storage);
        }
    }
}
