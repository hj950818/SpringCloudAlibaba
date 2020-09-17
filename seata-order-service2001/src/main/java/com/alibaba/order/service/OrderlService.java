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

package com.alibaba.order.service;


import com.alibaba.order.entity.Orderl;
import com.baomidou.mybatisplus.extension.service.IService;


public interface OrderlService extends IService<Orderl> {
    /**
     * 修改订单状态
     */
    public void updateStatus(Integer id, String status);
    /**
     * 新增订单
     */
    void saveOrderl(Orderl order);
}
