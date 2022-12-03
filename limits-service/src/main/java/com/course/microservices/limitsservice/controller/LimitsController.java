package com.course.microservices.limitsservice.controller;

import com.course.microservices.limitsservice.config.Configuration;
import com.course.microservices.limitsservice.bean.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimitsFromConfiguration(){
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
