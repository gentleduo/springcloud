package com.duo.consumer_service.controller;

import com.duo.consumer_service.client.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/msg")
    public String hello() {
        return feignService.hello();
    }
}
