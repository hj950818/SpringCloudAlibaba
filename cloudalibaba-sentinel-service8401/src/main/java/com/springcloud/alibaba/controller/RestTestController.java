package com.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.springcloud.alibaba.myhandle.SentinelMyhandle;
import com.sun.xml.internal.ws.handler.HandlerException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Handler;

@RestController
public class RestTestController {

    @GetMapping("/customhandle")
    @SentinelResource(value ="customhandle",blockHandlerClass = SentinelMyhandle.class,blockHandler = "customHandler")
    public String customhandle(){
        return "我没有问题!  我成功执行了！";
    }

    public String customhandleThoed(BlockException exception){
        return "出现问题了！我是兜底方法";
    }


    @GetMapping("/customhandleTest1")
    @SentinelResource(value ="customhandleTest1",blockHandlerClass = SentinelMyhandle.class,blockHandler = "customHandler")
    public String customhandleTest1(){
        return "我是测试1没有问题!  我成功执行了！";
    }

    @GetMapping("/customhandleTest2")
    @SentinelResource(value ="customhandleTest2",blockHandlerClass = SentinelMyhandle.class,blockHandler = "customHandler2")
    public String customhandleTest2(){
        return "我是测试2没有问题!  我成功执行了！";
    }




}
