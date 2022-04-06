package com.qian.gulimallmember.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: I have a qianqian
 * @Date: 2022/3/23 - 03 - 23 - 14:03
 * @Description: com.qian.gulimallmember.openfeign
 * @version: 1.0
 */
@FeignClient("gulimass-coupon")
public interface FeignTest {
    @RequestMapping("/gulimallcoupon/coupon/test")
    public String test();
}
