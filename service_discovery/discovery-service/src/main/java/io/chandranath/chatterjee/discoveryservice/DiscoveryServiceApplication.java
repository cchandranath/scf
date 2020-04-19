package io.chandranath.chatterjee.discoveryservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class DiscoveryServiceApplication {
	
	@Value("${service.instance.name}")
	private String instanceValue;

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServiceApplication.class, args);
	}
	
	@RequestMapping("/service")
	public String serviceHandler() {
		return "Fetching : " + instanceValue;
	}

}
