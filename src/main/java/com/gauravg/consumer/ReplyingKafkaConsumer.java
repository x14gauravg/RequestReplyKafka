package com.gauravg.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import com.gauravg.model.Model;


@Component
public class ReplyingKafkaConsumer {
	 
	 @KafkaListener(topics = "${kafka.topic.request-topic}")
	 @SendTo
	  public Model listen(Model request) throws InterruptedException {
		 
		 int sum = request.getFirstNumber() + request.getSecondNumber();
		 request.setAdditionalProperty("sum", sum);
		 return request;
	  }

}
