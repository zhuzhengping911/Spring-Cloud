package com.zzp.client;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by zhuzhengping on 2017/4/22.
 */
@FeignClient(value = "user-service",fallback = UserClientHystrix.class)
public interface UserClient {
}
