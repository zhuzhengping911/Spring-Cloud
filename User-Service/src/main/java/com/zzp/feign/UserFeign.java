package com.zzp.feign;

import com.zzp.user.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuzhengping on 2017/4/22.
 */
@RestController
public class UserFeign {

    @Autowired
    private UserClient userClient;


}
