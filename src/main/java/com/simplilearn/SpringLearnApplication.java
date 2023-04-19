package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
	}

	@GetMapping("/")
	public String hello(@RequestParam(value = "name1", defaultValue = "Class") String name2) {
		return String.format("Hello %s", name2);

	}

	@GetMapping("/hello")
	public String hello2(@RequestParam(value = "name1", defaultValue = "2") String name2) {
		return String.format("We are on page %s", name2);

	}

}
