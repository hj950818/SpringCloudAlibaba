package com.alibaba.order.feign;


import com.alibaba.order.entity.CumonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(value = "seata-storage-service",contextId = "OderFeign")
public interface StorageFeign {
    @GetMapping("/storage/decrese")
    CumonResult decrese(@RequestParam("prodoctId") Integer productId,@RequestParam("count") BigDecimal count);
}
