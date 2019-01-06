package com.example.jochemmortiers.recipeapp;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Recept implements Serializable {

    @SerializedName("recipe_id")
    private String recipeId;

    @SerializedName("image_url")
    private String imageUrl;

    @SerializedName("title")
    private String title;

    public String getRecipeId() {
        return recipeId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }
}
