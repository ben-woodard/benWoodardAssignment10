package com.coderscampus.benWoodardAssignment10.web;

import com.coderscampus.benWoodardAssignment10.spoonacular.SpoonacularIntegrationService;
import com.coderscampus.benWoodardAssignment10.spoonacular.dto.DayResponse;
import com.coderscampus.benWoodardAssignment10.spoonacular.dto.WeekResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealPlannerController {

    @Autowired
    private SpoonacularIntegrationService spoonacular;

    @GetMapping("mealplanner/week")
    public ResponseEntity<WeekResponse> getWeekMeals(@RequestParam String numCalories, @RequestParam String diet, @RequestParam String exclusions){
        return null;
    }

    @GetMapping("mealplanner/day")
    public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet,  String exclusions){
        return spoonacular.getDayMeals();
    }

}
