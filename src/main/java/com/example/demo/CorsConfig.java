package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;


@Configuration
@EnableWebFlux
public class CorsConfig implements WebFluxConfigurer {

@Override
public void addCorsMappings(CorsRegistry corsRegistry) {
corsRegistry.addMapping("/**")
.allowedOrigins("*")
.allowedHeaders("")
.allowedMethods("");
// .maxAge(3600);
}
}