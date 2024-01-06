package com.coderscampus.benWoodardAssignment10.spoonacular;

import com.coderscampus.benWoodardAssignment10.spoonacular.dto.DayResponse;
import com.coderscampus.benWoodardAssignment10.spoonacular.dto.WeekResponse;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class SpoonacularIntegrationService {

    public ResponseEntity<WeekResponse> getWeekMeals(){
        RestTemplate rt = new RestTemplate();

        URI weekUri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("timeFrame", "week")
                .queryParam("apiKey", "9ea1124e0a9b44ddb2bf999c4bc0ba66")
                .build()
                .toUri();

        return rt.getForEntity(weekUri, WeekResponse.class);
    }

    public ResponseEntity<DayResponse> getDayMeals() {
        RestTemplate rt = new RestTemplate();
        URI dayUri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("timeFrame", "day")
                .queryParam("apiKey", "9ea1124e0a9b44ddb2bf999c4bc0ba66")
                .build()
                .toUri();

        return rt.getForEntity(dayUri, DayResponse.class);
    }

}
