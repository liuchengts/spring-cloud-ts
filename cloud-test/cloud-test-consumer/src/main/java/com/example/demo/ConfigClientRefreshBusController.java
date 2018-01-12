package com.example.demo;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by apple on 2018/1/10.
 */
@RestController
@RefreshScope
public class ConfigClientRefreshBusController {
//    @Value("${profile}")
//    private String profile;
//
//    @GetMapping("/profile")
//    public String getProfile(){
//        return this.profile;
//    }
}
