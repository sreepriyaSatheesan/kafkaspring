package com.example.kafkaspring;

import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @kafkaListener(topic="my topic",groupId="mygroup")
    public void consumerFromTopic(String message){
        System.out.println("Consummed message"+message);
    }
}
