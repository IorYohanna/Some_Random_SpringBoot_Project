package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cc")
public record ContentCalendarProperties(
    String message,
    String about 
) {}




/* 
@configurationProperties(prefix = "smth") : tout commme @Value il permet de injecter des valeurs depuis application.properties mais sans avoir a
appeller les attributs d'un meme prefix un par un comme avce @Value 
Contrairement a @Value, il peut gérer des listes et des objets complexes
*/