package com.kaiky.kairos;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("dev")
public class KairosApplication {

	public static void main(String[] args) {
		SpringApplication.run(KairosApplication.class, args);
	}
}