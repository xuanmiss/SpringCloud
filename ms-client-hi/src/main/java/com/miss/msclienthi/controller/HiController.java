package com.miss.msclienthi.controller;


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
public class HiController {

    @Value("${server.port}")
    private String hi ;

    @GetMapping("/hi")
    public Result getHi(@RequestParam(value = "name",required = false)String name)
    {
        Result result = new Result();
        result.setCode("true");
        result.setMessage("success");
        result.setData(hi+"***"+name);
        return result;
    }
}
