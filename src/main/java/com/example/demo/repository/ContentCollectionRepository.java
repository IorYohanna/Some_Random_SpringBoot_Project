package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.example.demo.model.Content;
import com.example.demo.model.Status;
import com.example.demo.model.Type;

import jakarta.annotation.PostConstruct;

@Repository 
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository () {

    }

    public List<Content> FindAll () {
        return contentList;
    }

    public Optional<Content> FindById (Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();  
    }

    @PostConstruct
    private void init () {
        Content content = new Content(
            1,
            "First Content",
            "This is the first content",
            Status.IDEA,
            Type.ARTICLE,
            LocalDateTime.now(),
            null,
            ""
        );
        contentList.add(content);
    }

    public void save (Content content) {
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }

    public boolean existsById (Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).count() == 1;  
    }

    public void delete (Integer id) {
        contentList.removeIf(c -> c.id().equals(id));
    }
}




// Notes :
// Composant avec intances auto : @Component, @controller, @Service, @Bean, @Repository
// @Repository : équivalent au DemoApplication
// Optional<Type> : evite les NullPointerException -> soit un retour de type Type soit empty(null)
// @PostConstruct : retourne un void et est execute avant les bean et ses dependances le soit