package com.example.jochemmortiers.recipeapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class APIAnswer {

    @SerializedName("count")
    public int count;
    @SerializedName("recipes")
    public List<Recept> recipes;

    public int getCount() {
        return count;
    }

    public List<Recept> getRecipes() {
        return recipes;
    }
}
