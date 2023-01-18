package com.example.kafkaspring.Controller;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/kafkaap")
public class KafakaController {
    @Autowired
    Producer producer;
    @PostMapping(value="/post")
    public void sendMessage(@RequestParam("msg") String msg){
        producer.publishToTopic(msg);
    }
}
