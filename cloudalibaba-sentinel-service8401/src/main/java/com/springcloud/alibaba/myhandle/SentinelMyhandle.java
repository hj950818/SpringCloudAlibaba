package com.springcloud.alibaba.myhandle;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class SentinelMyhandle {
    public static String customHandler(BlockException e){
        return "我是方法1";
    }
    public static String customHandler2(BlockException e){
        return "我是方法2";
    }
}
