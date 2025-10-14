package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.model.Content;
import com.example.demo.repository.ContentCollectionRepository;

@RestController 
@RequestMapping("/api/content") 
public class ContentController {

    private final ContentCollectionRepository repository;

    public ContentController(ContentCollectionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public List<Content> FindAll () {
        return repository.FindAll();
    }

    @GetMapping("/{id}")
    public Content findById (@PathVariable Integer id) {
        return repository.FindById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found"));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create (@RequestBody Content content) {
        repository.save(content);
    }


    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update (@RequestBody Content content, @PathVariable Integer id) {
        if (! repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found");
        }
        repository.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete (@PathVariable Integer id) {
        repository.delete(id);
    }

}





// Notes :
// - @RestController : Gère les REST API et retourne des réponse JSON/XML sans vue
// - @RequestMapping : Sert à Mapper une URL ou une requete Http : GET, UPDATE, POST, DELETE, PATCH
// - @PathVariable : Sert a mapper l'argument de le corps de la requete HTTP dans l'URL
// -@RequestBody : Sert a mapper le corps de la requete HTTP dans l'argument de la methode
