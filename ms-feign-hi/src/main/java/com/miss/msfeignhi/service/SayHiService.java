package com.miss.msfeignhi.service;


import com.miss.msfeignhi.FallBackObject.HiFallBack;
import entity.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author miss
 * <p>
 * Created by miss on 2018/3/27
 */
@FeignClient(value = "service-hi",fallback = HiFallBack.class)
@Service
public interface SayHiService {

    @GetMapping (value = "/api/hi")
    Result sayHiFromClientOne(@RequestParam(value = "name",required = false) String name);
}
