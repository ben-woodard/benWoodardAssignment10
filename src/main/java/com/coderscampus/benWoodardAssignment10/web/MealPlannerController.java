package com.coderscampus.benWoodardAssignment10.web;

import com.coderscampus.benWoodardAssignment10.spoonacular.service.SpoonacularIntegrationService;
import com.coderscampus.benWoodardAssignment10.spoonacular.dto.DayResponse;
import com.coderscampus.benWoodardAssignment10.spoonacular.dto.WeekResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealPlannerController {

    @Autowired
    private SpoonacularIntegrationService spoonacular;

    @GetMapping("mealplanner/week")
    public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
        return spoonacular.getResponse(numCalories, diet, exclusions, "week");
    }

    @GetMapping("mealplanner/day")
    public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
        return spoonacular.getResponse(numCalories, diet, exclusions, "day");
    }

}
