package com.coderscampus.benWoodardAssignment10.spoonacular.service;

import com.coderscampus.benWoodardAssignment10.spoonacular.dto.DayResponse;
import com.coderscampus.benWoodardAssignment10.spoonacular.dto.WeekResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@Service
public class SpoonacularIntegrationService {

    public ResponseEntity getResponse(String numCalories, String diet, String exclusions, String timeFrame) {
        RestTemplate rt = new RestTemplate();
        URI dayUri = buildUri(numCalories, diet, exclusions, timeFrame);
        if (timeFrame == "week") {
            return rt.getForEntity(dayUri, WeekResponse.class);
        } else {
            return rt.getForEntity(dayUri, DayResponse.class);
        }
    }

    private URI buildUri(String numCalories, String diet, String exclusions, String timeFrame) {
        URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                                      .queryParam("timeFrame", timeFrame)
                                      .queryParamIfPresent("targetCalories", Optional.ofNullable(numCalories))
                                      .queryParamIfPresent("diet", Optional.ofNullable(diet))
                                      .queryParamIfPresent("exclude", Optional.ofNullable(exclusions))
                                      .queryParam("apiKey", "ae6a53f077af49678c939638919b7696")
                                      .build()
                                      .toUri();
        return uri;
    }
}
