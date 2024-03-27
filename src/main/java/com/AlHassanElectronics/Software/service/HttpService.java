package com.AlHassanElectronics.Software.service;

import org.springframework.web.client.RestTemplate;

public class HttpService {
       public static Object sendHttpRequest(String url,Class responseType){
               return new RestTemplate().getForObject(url,responseType);
       }
}
