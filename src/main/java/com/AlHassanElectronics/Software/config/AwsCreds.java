package com.AlHassanElectronics.Software.config;

import com.amazonaws.auth.AWSCredentials;
import org.springframework.beans.factory.annotation.Value;

public class AwsCreds implements AWSCredentials {
    @Value("${cloud.aws.credentials.access-key}")
    public String accessKey;
    @Value("&{cloud.aws.credentials.secret-key}")
    public String secretKey;

    @Override
    public String getAWSAccessKeyId() {
        return accessKey;
    }

    @Override
    public String getAWSSecretKey() {
        return secretKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
