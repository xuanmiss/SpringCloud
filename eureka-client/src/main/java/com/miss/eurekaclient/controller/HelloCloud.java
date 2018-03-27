package com.miss.eurekaclient.controller;

import com.miss.eurekaclient.entity.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author miss
 * <p>
 * Created by miss on 2018/3/26
 */
@RestController
@RequestMapping("/api")
public class HelloCloud {

    private String hello = "Hello SpringCloud";

    @GetMapping("/hello")
    public Result hello(@RequestParam(value = "name",required = false)String name)
    {
        Result result = new Result();
        result.setCode("ture");
        result.setMessage("success");
        result.setData(hello+"***"+name);
        return result;
    }

}
