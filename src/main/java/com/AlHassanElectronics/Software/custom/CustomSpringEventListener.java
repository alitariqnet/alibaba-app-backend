package com.AlHassanElectronics.Software.custom;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomSpringEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
          log.info("Event received:" + event.getMessage());
    }

    @EventListener(classes = {ContextStartedEvent.class})
    public void contextStartedEvent() {
        log.info("Context started event...");
    }

    @EventListener(classes = {ContextStoppedEvent.class})
    public void contextStoppedEvent() {
        log.info("Context stopped event...");
    }
}
