package com.demo.service.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MainController {

    @Value("${provider.name}")
    String  providerName;

    @Value("${provider.local.name}")
    String localName;

    @RequestMapping("/getConfig")
    public String getConfig() {
        return providerName + localName;
    }

}
