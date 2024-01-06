package com.coderscampus.benWoodardAssignment10.spoonacular.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meals {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("imageType")
    private String imageType;

    @JsonProperty("title")
    private String title;

    @JsonProperty("readyInMinutes")
    private Double readyInMinutes;

    @JsonProperty("servings")
    private Double servings;

    @JsonProperty("sourceUrl")
    private String sourceUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getReadyInMinutes() {
        return readyInMinutes;
    }

    public void setReadyInMinutes(Double readyInMinutes) {
        this.readyInMinutes = readyInMinutes;
    }

    public Double getServings() {
        return servings;
    }

    public void setServings(Double servings) {
        this.servings = servings;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }
}
