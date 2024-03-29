package com.coderscampus.benWoodardAssignment10.spoonacular.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {

    @JsonProperty("calories")
    private Double calories;

    @JsonProperty("protein")
    private Double protein;

    @JsonProperty("fat")
    private double fat;

    @JsonProperty("carbohydrates")
    private double carbohydrates;

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Double getProtien() {
        return protein;
    }

    public void setProtien(Double protien) {
        this.protein = protien;
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
