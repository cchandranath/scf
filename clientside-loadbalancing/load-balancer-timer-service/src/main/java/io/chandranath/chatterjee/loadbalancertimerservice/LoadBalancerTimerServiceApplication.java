package io.chandranath.chatterjee.loadbalancertimerservice;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class LoadBalancerTimerServiceApplication {

	@Value("${server.port}")
	private int portNumber;

	public static void main(String[] args) {
		SpringApplication.run(LoadBalancerTimerServiceApplication.class, args);
	}

	@GetMapping
	public String getTimeMessage() {
		return "Current Timestamp : " + new Date().toString() + "{ fetching from port : " + portNumber + "}";
	}

}
