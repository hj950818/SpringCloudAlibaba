package com.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelController {
    @GetMapping(value = "/testa")
    public String testA(){
        return "----》》》》A";
    }
    @GetMapping(value = "/testb")
    public String testB(){
        return "------->>>>>>B";
    }

@GetMapping("/hotKey")
@SentinelResource(value = "hotkey",blockHandler = "exception_hotkey")
    public String  hotKey(@RequestParam(value = "p1",required = false) String p1,
                          @RequestParam(value = "p2",required = false) String p2){

        return "----->>>>>hoekey             p1="+p1+"p2="+p2;
    }
    public String exception_hotkey(String p1, String p2, BlockException exception){
        return "im  exception_hotkey(╥﹏╥)o";
    }
}
