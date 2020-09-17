package com.alibaba.order.mapper;

import com.alibaba.order.entity.CumonResult;
import com.alibaba.order.entity.Orderl;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderlMapper extends BaseMapper<Orderl> {
    /**
     * 修改订单状态
     */
    void updateStatus(@Param("userId") Integer userId, @Param("status") String status);
}
