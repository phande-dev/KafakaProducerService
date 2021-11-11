package com.phande.kafakademo.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.phande.kafakademo.model.User;

@Configuration
public class KafkaProducerConfig {
   private final Logger log = LoggerFactory.getLogger(KafkaProducerConfig.class);
  
   @Value("${kafka.bootstrap-servers}")
   private String bootstrapServer;

   @Bean
   public ProducerFactory<String, User> userProducerFactory(){
      Map<String,Object> configProperties = new HashMap<>();
      configProperties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer);
      configProperties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
      configProperties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
      return new DefaultKafkaProducerFactory<>(configProperties);
   }
   @Bean
   public KafkaTemplate<String,User> kafkaTemplate(){
      return  new KafkaTemplate<>(userProducerFactory());
   }

}