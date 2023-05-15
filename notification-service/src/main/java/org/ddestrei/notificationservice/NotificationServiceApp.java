package org.ddestrei.notificationservice;

import lombok.extern.slf4j.Slf4j;
import org.ddestrei.notificationservice.event.OrderPlacedEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
public class NotificationServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(NotificationServiceApp.class, args);
    }

    @KafkaListener(topics = "notificationTopic")
    public void HandleNotification(OrderPlacedEvent orderPlaceEvent){
        //send out an email notification
        log.info("Received Notification for Order - {}", orderPlaceEvent.getOrderNumber());
    }

}
