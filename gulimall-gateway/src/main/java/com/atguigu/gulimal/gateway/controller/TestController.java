package com.atguigu.gulimal.gateway.controller;/*
 *jay
 *2021/3/13
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class TestController {

    public String testGateWay(){
        System.out.println("11111111111");
        return "testOk!";
    }

    public static void main(String[] args) {
        int total=0;
        int a=4000;
        for(int i=1;i<=240;i++){
            total +=a;
            a -=17;
        }
        System.out.println(total);
    }

}
