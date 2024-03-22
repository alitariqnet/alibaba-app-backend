package com.AlHassanElectronics.Software.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("cron")
public class SchedularConfig {
    public static String expression;

    public static String getExpression() {
        return expression;
    }
}
