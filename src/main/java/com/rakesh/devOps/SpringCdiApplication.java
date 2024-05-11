package com.rakesh.devOps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCdiApplication {
	
	@GetMapping("/message")
	public String displayMessage(){
		return "deploy successfully with Jenkins .............";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCdiApplication.class, args);
	}

}
