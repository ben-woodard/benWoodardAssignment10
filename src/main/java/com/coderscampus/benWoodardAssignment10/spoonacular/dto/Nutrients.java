package com.coderscampus.benWoodardAssignment10.spoonacular.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {

    @JsonProperty
    private Double calories;

    @JsonProperty
    private Double protien;

    @JsonProperty
    private double fat;

    @JsonProperty
    private double carbohydrates;

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Double getProtien() {
        return protien;
    }

    public void setProtien(Double protien) {
        this.protien = protien;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }
}
