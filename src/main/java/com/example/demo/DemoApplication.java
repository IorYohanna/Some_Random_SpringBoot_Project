package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.example.demo.config.ContentCalendarProperties;
import com.example.demo.model.Content;
import com.example.demo.model.Status;
import com.example.demo.model.Type;
import com.example.demo.repository.ContentRepository;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			// insert some data into the database
			Content content = new Content(
					null,
					"Hello World! , -FROM Copilot!!",
					"Just to test if it works",
					Status.IDEA,
					Type.ARTICLE,
					LocalDateTime.now(),
					null,
					"");
			repository.save(content);
		};
	}
}

/* CommandLineRunner
* run après le démarrage de l'application et le chargement des bean et
* dependencies
*/