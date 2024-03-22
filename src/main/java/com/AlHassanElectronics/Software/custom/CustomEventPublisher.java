package com.AlHassanElectronics.Software.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher = new CustomNullEventPublisher();

    public void publishCustomEvent(final String message) {
        System.out.println("Publishing custom event. ");
        CustomEvent customEvent = new CustomEvent(this, message);
//        applicationEventPublisher.publishEvent(customEvent);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    protected static final class CustomNullEventPublisher implements ApplicationEventPublisher {

        @Override
        public void publishEvent(ApplicationEvent event) {

        }

        @Override
        public void publishEvent(Object event) {
        }

    }
}
