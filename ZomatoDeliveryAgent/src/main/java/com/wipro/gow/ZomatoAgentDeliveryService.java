<<<<<<< HEAD
package com.wipro.gow;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ZomatoAgentDeliveryService {

	private final KafkaTemplate<String,String> kafkaTemplate;
	public void updateDeliveryAgentLocation(String string) {
		
		kafkaTemplate.send("zomato-delivery-agent",string);
	}

}
=======
package com.wipro.gow;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ZomatoAgentDeliveryService {

	private final KafkaTemplate<String,String> kafkaTemplate;
	public void updateDeliveryAgentLocation(String string) {
		
		kafkaTemplate.send("zomato-delivery-agent",string);
	}

}
>>>>>>> af4bfed9 (added all the files)
