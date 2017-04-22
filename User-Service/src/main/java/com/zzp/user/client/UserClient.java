package com.zzp.user.client;

import com.zzp.user.feign.UserClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhuzhengping on 2017/4/22.
 */
@FeignClient(value = "user-service",fallback = UserClientHystrix.class)
public interface UserClient {

    @RequestMapping(value = "/{userId}",method = RequestMethod.GET)
    String getUser(@PathVariable("userId") Long userId);
}
