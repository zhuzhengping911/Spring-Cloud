package com.zzp.computer.client.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zhuzhengping on 2017/4/10.
 */
@Component
@ConfigurationProperties(prefix = "zzp")
public class ZzpProperties {

    private String from;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
