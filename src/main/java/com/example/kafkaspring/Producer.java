package com.example.kafkaspring;

import org.springframework.beans.factory.annotation.Autowired;

public class Producer {
    public static final String topic="Mytopic";
    @Autowired
    private kafkaTemplate<String,String> kafkaTemp;
    public void publicToTopic(String message){
        System.out.println("Published topic"+topic);
        this.kafkaTemp.send(topic,message);
    }
}
