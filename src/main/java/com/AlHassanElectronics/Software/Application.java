package com.AlHassanElectronics.Software;

import com.AlHassanElectronics.Software.custom.CustomEventPublisher;
import com.AlHassanElectronics.Software.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Slf4j
@EnableScheduling
@EnableCaching
@EnableConfigurationProperties
@SpringBootApplication
public class Application {

    private static CustomEventPublisher customEventPublisher;

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        log.info(String.valueOf(applicationContext.getBeanDefinitionCount()));
        publishAppStartEvent();
//		String[] beanDefNames = applicationContext.getBeanDefinitionNames();
//		for(String beanDefName : beanDefNames){
//			log.info(beanDefName);
//		}
        // Create an encoder with strength 16
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
//        String result = encoder.encode("password");
//        log.info("Encoded password for password is ", result);
//		EmailService.sendEmail("Application started...");
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<String> response  = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts", String.class);
//        System.out.println(response.getStatusCode());
//        System.out.println(response.getHeaders());
//        System.out.println(response.getBody());
    }

    //	@Bean
//	public CommandLineRunner commandLineRunner(UserRepository userRepsitory)     {
//		return args -> {
//			userRepsitory.save(new User("Hassan", "7323729","chena_man@yahoo.com",  "22 Shalimar link road Mughalpura", "chenaman", "word"));
//		};
//	}
    private static void publishAppStartEvent() {
        customEventPublisher = new CustomEventPublisher();
        customEventPublisher.publishCustomEvent("Application started...");
    }
    public int number = 10;
}
