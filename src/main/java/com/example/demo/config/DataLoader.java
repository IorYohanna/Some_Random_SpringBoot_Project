package com.example.demo.config;

import java.io.InputStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.repository.ContentRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class DataLoader implements CommandLineRunner {

    private final ContentRepository repository;
    private ObjectMapper mapper;

    public DataLoader(ContentRepository repository, ObjectMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void run(String... args) throws Exception {
        try (InputStream inputStream = TypeReference.class.getResourceAsStream("/data/content.json")) 
        {
            var contents = mapper.readValue(inputStream, new TypeReference<java.util.List<com.example.demo.model.Content>>() {});
            repository.saveAll(contents);
            System.out.println("Data loaded successfully.");

        } catch (Exception e) 
        {
            System.err.println("Failed to load data: " + e.getMessage());
        }
    }

    
}


/* ObjectMapper permet de convertir des objets Java en JSON et vice versa */