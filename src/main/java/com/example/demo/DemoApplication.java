package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Content;
import com.example.demo.model.Status;
import com.example.demo.model.Type;
import com.example.demo.repository.ContentRepository;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			//insert some data into the database 
			Content content = new Content(
            null,
            "Hello World! , -FROM Copilot!!",
            "Just to test if it works",
            Status.IDEA,
            Type.ARTICLE,
            LocalDateTime.now(),
            null,
            ""
        );
		repository.save(content);
		};
	}
}
