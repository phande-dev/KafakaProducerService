package com.phande.kafakademo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.phande.kafakademo.model.User;
@Service
public class KafkaProducerService {
	 private final Logger log = LoggerFactory.getLogger(KafkaProducerService.class);
	    @Autowired
	    private KafkaTemplate<String, User> kafkaTemplate;
	    final  String TOPIC_NAME="user-topic";

	    public void sendMessage(User user){
	        log.info("Sending User Serilizer : {}",user);
	        kafkaTemplate.send(TOPIC_NAME,user);
	    }
}
