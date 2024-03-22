package com.AlHassanElectronics.Software.schedular;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;

@Slf4j
public class Reminder {
    @Scheduled(cron = "${cron.expression}")
    public void remindMeProgramming() throws InterruptedException{
        log.info("Remind me to code");
    }
}
