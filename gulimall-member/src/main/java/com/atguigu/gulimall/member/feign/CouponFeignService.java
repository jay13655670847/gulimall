package com.atguigu.gulimall.member.feign;/*
 *jay
 *2021/3/12
 */

import com.atguigu.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/getCoupon")
    public R getCoupon();
}
