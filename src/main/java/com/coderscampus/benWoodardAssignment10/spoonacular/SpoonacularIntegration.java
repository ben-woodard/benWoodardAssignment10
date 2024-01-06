package com.coderscampus.benWoodardAssignment10.spoonacular;

import org.junit.Test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class SpoonacularIntegration {

    @Test
    public void getDayMeals() {
        RestTemplate rt = new RestTemplate();

        URI dayUri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("timeFrame", "week")
                .queryParam("apiKey", "9ea1124e0a9b44ddb2bf999c4bc0ba66")
                .build()
                .toUri();

        ResponseEntity<String> response = rt.getForEntity(dayUri, String.class);
        System.out.println(response.getBody());
    }

}
