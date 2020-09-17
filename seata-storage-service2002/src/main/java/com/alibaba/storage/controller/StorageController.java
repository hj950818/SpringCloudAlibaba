package com.alibaba.storage.controller;

import com.alibaba.storage.serveice.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@Slf4j
@RequestMapping("/storage")
public class StorageController {

    private  StorageService storageService;
    /**
     * 减库存
     * @param productId
     * @param count
     */
    @GetMapping("/decrese")
   public void decrese(@RequestParam("prodoctId") Integer productId, @RequestParam("count") BigDecimal count){
        storageService.decrese(productId,count);
    }
}
