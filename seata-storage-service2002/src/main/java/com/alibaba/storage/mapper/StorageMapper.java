package com.alibaba.storage.mapper;

import com.alibaba.storage.entity.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StorageMapper extends BaseMapper<Storage> {
    /**
     * 修改库存数
     * @param storage
     */
    void updateStorage(Storage storage);
}
