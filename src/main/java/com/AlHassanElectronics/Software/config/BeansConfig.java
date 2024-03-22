package com.AlHassanElectronics.Software.config;

import com.amazonaws.services.s3.AmazonS3Client;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;

public class BeansConfig {
    @Bean
    public AmazonS3Client amazonS3Client() {
        return new AmazonS3Client();
    }

    @Bean
    CacheManager cacheManager() {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
        return cacheManager;
    }
}
