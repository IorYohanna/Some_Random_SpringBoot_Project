package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.ContentCalendarProperties;

@RestController
public class HomeController {

    private ContentCalendarProperties property;

    public HomeController(ContentCalendarProperties property) {
        this.property = property;
    }

    @GetMapping("/")
    public ContentCalendarProperties home() {
        return property ;
    }

}



/*
 * @Value : permet de récupérer la valeur d'une propriété définie dans le
 * fichier application.properties mais celle ci ne prend pas en compte si les valeurs sont des listes ou des objets complexes
 */