package com.alibaba.order.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.order.entity.CumonResult;
import com.alibaba.order.entity.Orderl;
import com.alibaba.order.service.OrderlService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;



@RestController
@AllArgsConstructor
@RequestMapping("/order" )
@Api(value = "order", tags = "订单表")
public class OrderlController {

    private OrderlService orderlSerlvice;



    /**
     *  新增
     */
    @ApiOperation(value = "新增", notes = "新增")
    @PostMapping("/saveNewData")
    @SentinelResource(value = "saveNewData",blockHandler = "saveNewDataTest")
    public  CumonResult saveNewData(@RequestBody Orderl order){
        order.setStatus(0);
        orderlSerlvice.saveOrderl(order);
        return CumonResult.ok();
    }
    public CumonResult saveNewDataTest(Orderl order,BlockException block){
        return CumonResult.ok("","出错啦----block");
    }
    /**
     * 修改订单状态
     */
    @ApiOperation(value = "修改订单状态", notes = "修改订单状态")
    @GetMapping("/updateStatus/{id}/{status}")
    public CumonResult updateStatus(@PathVariable(value = "id") Integer id,
                                   @PathVariable(value = "status") String status){
        orderlSerlvice.updateStatus(id,status);
        return CumonResult.ok();
    }
}
