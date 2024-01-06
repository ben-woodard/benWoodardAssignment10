package com.coderscampus.benWoodardAssignment10.spoonacular.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class DayResponse {

    @JsonProperty("meals")
    private ArrayList<Meals> meals;

    @JsonProperty("nutrients")
    private Nutrients nutrients;

    public ArrayList<Meals> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<Meals> meals) {
        this.meals = meals;
    }

    public Nutrients getNutrients() {
        return nutrients;
    }

    public void setNutrients(Nutrients nutrients) {
        this.nutrients = nutrients;
    }


}
