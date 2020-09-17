/*
 *    Copyright (c) 2018-2025, bbibm All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the bbibm.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: bbibm
 */
package com.alibaba.order.service.impl;

import com.alibaba.order.entity.Orderl;
import com.alibaba.order.feign.AccountFeign;
import com.alibaba.order.feign.StorageFeign;
import com.alibaba.order.mapper.OrderlMapper;
import com.alibaba.order.service.OrderlService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class OrderlServiceImpl extends ServiceImpl<OrderlMapper, Orderl> implements OrderlService {


    private final OrderlMapper orderlMapper;

   private final StorageFeign storageFeign;
   private final AccountFeign accountFeign;
    /**
     * 修改订单状态
     */
    @Override
    public void updateStatus(Integer id, String status) {
        orderlMapper.updateStatus(id, status);
    }
    /**
     * 新增订单
     */
    @Override
    public void saveOrderl(Orderl order) {
        //新建订单
        orderlMapper.insert(order);
        //建少库存
        storageFeign.decrese(order.getProdoctId(),order.getCount());
        //减少账户金额
        accountFeign.decrese(order.getUserId(),order.getMoney());
        updateStatus(order.getId(),"0");
    }
}