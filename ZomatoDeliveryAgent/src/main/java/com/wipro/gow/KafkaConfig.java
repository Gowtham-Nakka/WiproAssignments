<<<<<<< HEAD
package com.wipro.gow;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.apache.kafka.clients.admin.NewTopic;


@Configuration
public class KafkaConfig {

	@Bean
	NewTopic topic() {
		return TopicBuilder.name("zomato-delivery-agent")
				.replicas(1)
				.partitions(4)
				.config("retention.ms", "604800000") // 7 days
				.config("cleanup.policy", "delete")
				.build();
	}
=======
package com.wipro.gow;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.apache.kafka.clients.admin.NewTopic;


@Configuration
public class KafkaConfig {

	@Bean
	NewTopic topic() {
		return TopicBuilder.name("zomato-delivery-agent")
				.replicas(1)
				.partitions(4)
				.config("retention.ms", "604800000") // 7 days
				.config("cleanup.policy", "delete")
				.build();
	}
>>>>>>> af4bfed9 (added all the files)
}