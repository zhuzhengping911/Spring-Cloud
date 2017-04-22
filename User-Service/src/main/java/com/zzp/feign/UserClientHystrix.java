package com.zzp.feign;

import com.zzp.user.client.UserClient;
import org.springframework.stereotype.Component;

/**
 * Created by zhuzhengping on 2017/4/22.
 */
@Component
public class UserClientHystrix implements UserClient {
    @Override
    public String getUser(Long userId) {
        return "user service error";
    }
}
