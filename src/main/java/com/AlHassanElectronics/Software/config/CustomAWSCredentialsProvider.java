package com.AlHassanElectronics.Software.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomAWSCredentialsProvider implements AWSCredentialsProvider {
    @Autowired
    private AwsCreds awsCreds;
    @Override
    public AWSCredentials getCredentials() {
        return awsCreds;
    }

    @Override
    public void refresh() {

    }
}
