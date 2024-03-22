//package com.AlHassanElectronics.Software.controller;
//
//import com.amazonaws.services.s3.AmazonS3Client;
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class DashboardController {
//    @Value("${custom.bucket-name}")
//    private String bucketName;
//
//    @Autowired
//    private AmazonS3Client amazonS3Client;
//
//    private String bucketLocation;
//
//    public DashboardController() {
//    }
//
//    public DashboardController(String bucketName) {
//        this.bucketName = bucketName;
//    }
//
//    public DashboardController(
//            @Value("${custom.bucket-name}") String bucketName,
//            AmazonS3Client amazonS3Client) {
//        this.bucketName = bucketName;
//        this.amazonS3Client = amazonS3Client;
//    }
//
//    @PostConstruct
//    public void postConstruct() {
//        this.bucketLocation = String.format("https://%s.s3.%s.amazonaws.com",
//                bucketName, this.amazonS3Client.getBucketLocation(bucketName));
//    }
//
//    @GetMapping("/")
//    public ModelAndView getDashboardView() {
//        ModelAndView modelAndView = new ModelAndView("dashboard");
//        modelAndView.addObject("message", "Spring Boot with AWS");
//        modelAndView.addObject("bucketName", bucketName);
//        modelAndView.addObject("bucketLocation", bucketLocation);
//        modelAndView.addObject("availableFiles", amazonS3Client.listObjects(bucketName).getObjectSummaries());
//        return modelAndView;
//    }
//
//}
