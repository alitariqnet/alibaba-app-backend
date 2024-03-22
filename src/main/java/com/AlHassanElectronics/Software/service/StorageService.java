package com.AlHassanElectronics.Software.service;

import com.amazonaws.services.s3.AmazonS3Client;
import org.springframework.beans.factory.annotation.Value;

public class StorageService {
    private AmazonS3Client amazonS3Client;

    @Value("${}")
    private String bucketName ;
    public StorageService(AmazonS3Client amazonS3Client, String bucketName) {
        this.amazonS3Client = amazonS3Client;
        this.bucketName = bucketName;
    }
//
//    public void init(){
//        amazonS3Client.
//    }
}
