package com.miss.msfeignhi.controller;

import com.miss.msfeignhi.service.SayHiService;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author miss
 * <p>
 * Created by miss on 2018/3/27
 */
@RestController
@RequestMapping("/api")
public class SayHiController {

    @Autowired
    private SayHiService sayHiService;

    @GetMapping(value = "/hi")
    public Result sayHi(@RequestParam(value = "name",required = false) String name){
        return sayHiService.sayHiFromClientOne(name);
    }
}
