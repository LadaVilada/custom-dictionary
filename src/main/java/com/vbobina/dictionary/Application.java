package com.vbobina.dictionary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Stereotype annotation, provides hints for people reading the code
@RestController
// Auto-configuration is designed to work well with “Starters”
@EnableAutoConfiguration
public class Application {

	@RequestMapping("/")
	String home() {
		return "Your Dictionary";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
