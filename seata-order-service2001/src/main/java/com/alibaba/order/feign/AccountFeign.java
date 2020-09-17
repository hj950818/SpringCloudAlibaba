package com.alibaba.order.feign;

import com.alibaba.order.entity.CumonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(value = "seate-account-service",contextId = "AccountFeign")
public interface AccountFeign {

    @GetMapping("/account/decrese")
    CumonResult decrese(@RequestParam("money") Integer money, @RequestParam("userId") BigDecimal userId);
}
