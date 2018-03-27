package com.miss.msclienthello.controller;

import entity.Result;
import org.springframework.beans.factory.annotation.Value;
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
public class HelloController {

    @Value("${server.port}")
    private String hello;

    @GetMapping("/hi")
    public Result getHello(@RequestParam(value = "name",required = false)String name)
    {
        return Result.OK(hello+"***"+name);
    }
}
