package com.coderscampus.benWoodardAssignment10.spoonacular.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class WeekDay {

    @JsonProperty("meals")
    private ArrayList<Meals> meals;

    @JsonProperty("nutrients")
    private Nutrients nutrients;

}
