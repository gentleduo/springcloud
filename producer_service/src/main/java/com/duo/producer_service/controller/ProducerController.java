package com.duo.producer_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer-service")
public class ProducerController {

    @GetMapping("/msg")
    public String msg() {
        return "this is product3' msg";
    }
}
