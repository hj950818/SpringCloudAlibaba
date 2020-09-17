package com.alibaba.storage.serveice;

import com.alibaba.storage.entity.Storage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;

public interface StorageService extends IService<Storage> {
    /**
     * 减库存
     * @param productId
     * @param count
     */
    void decrese(Integer productId, BigDecimal count);
}
