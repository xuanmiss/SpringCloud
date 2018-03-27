package com.miss.msfeignhi.FallBackObject;

import com.miss.msfeignhi.service.SayHiService;
import entity.Result;
import org.springframework.stereotype.Component;

/**
 * @author miss
 * <p>
 * Created by miss on 2018/3/27
 */
@Component
public class HiFallBack implements SayHiService {

    @Override
    public Result sayHiFromClientOne(String name)
    {
        return Result.ERROR("Sorry***"+name);
    }
}
