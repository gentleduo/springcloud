package com.duo.consumer_service.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "producer-service")
public interface FeignService {

    @GetMapping("/producer-service/msg")
    String hello();
}
