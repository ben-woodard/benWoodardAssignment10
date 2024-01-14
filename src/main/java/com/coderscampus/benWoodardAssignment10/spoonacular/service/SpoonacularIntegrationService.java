package com.coderscampus.benWoodardAssignment10.spoonacular.service;

import com.coderscampus.benWoodardAssignment10.spoonacular.dto.DayResponse;
import com.coderscampus.benWoodardAssignment10.spoonacular.dto.WeekResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;
import java.util.Optional;

@Service
public class SpoonacularIntegrationService {

    @Value("${spoonacular.apiKey}")
    private String apiKey;

    @Value("${spoonacular.baseUrl}")
    private String baseUrl;

    @Value("${spoonacular.endpoint.mealplanner}")
    private String mealPlanner;
    
    public ResponseEntity getResponse(String numCalories, String diet, String exclusions, String timeFrame) {
        RestTemplate rt = new RestTemplate();
        URI requestUri = buildUri(numCalories, diet, exclusions, timeFrame);
        if (timeFrame == "week") {
            return rt.getForEntity(requestUri, WeekResponse.class);
        } else {
            return rt.getForEntity(requestUri, DayResponse.class);
        }
    }

    private URI buildUri(String numCalories, String diet, String exclusions, String timeFrame) {
        URI uri = UriComponentsBuilder.fromHttpUrl(baseUrl+mealPlanner)
                                      .queryParam("timeFrame", timeFrame)
                                      .queryParamIfPresent("targetCalories", Optional.ofNullable(numCalories))
                                      .queryParamIfPresent("diet", Optional.ofNullable(diet))
                                      .queryParamIfPresent("exclude", Optional.ofNullable(exclusions))
                                      .queryParam("apiKey", apiKey)
                                      .build()
                                      .toUri();
        return uri;
    }
}
