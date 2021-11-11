package com.phande.kafakademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phande.kafakademo.model.User;
import com.phande.kafakademo.service.KafkaProducerService;

@RestController
@RequestMapping("kafka")
public class KafkaController {
	@Autowired
	private KafkaProducerService kafkaProducer;

	@PostMapping(value = "/publish")
	public String produceUser(@RequestBody User users) {
		kafkaProducer.sendMessage(users);
		return "message sent succesfully to the kafka topic user-topic";

	}

}
