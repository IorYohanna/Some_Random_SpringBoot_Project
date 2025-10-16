package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.demo.config.ContentCalendarProperties;
@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

/* CommandLineRunner
* run après le démarrage de l'application et le chargement des bean et
* dependencies
*/